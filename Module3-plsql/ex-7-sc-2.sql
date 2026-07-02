CREATE OR REPLACE PACKAGE EmployeeManagement AS

    PROCEDURE HireEmployee(
        p_EmployeeID NUMBER,
        p_Name VARCHAR2,
        p_Position VARCHAR2,
        p_Salary NUMBER,
        p_Department VARCHAR2,
        p_HireDate DATE
    );

    PROCEDURE UpdateEmployee(
        p_EmployeeID NUMBER,
        p_Salary NUMBER,
        p_Department VARCHAR2
    );

    FUNCTION CalculateAnnualSalary(
        p_EmployeeID NUMBER
    ) RETURN NUMBER;

END EmployeeManagement;
/

CREATE OR REPLACE PACKAGE BODY EmployeeManagement AS

PROCEDURE HireEmployee(
    p_EmployeeID NUMBER,
    p_Name VARCHAR2,
    p_Position VARCHAR2,
    p_Salary NUMBER,
    p_Department VARCHAR2,
    p_HireDate DATE
)
IS
BEGIN

    INSERT INTO Employees
    VALUES(
        p_EmployeeID,
        p_Name,
        p_Position,
        p_Salary,
        p_Department,
        p_HireDate
    );

    COMMIT;

END;

PROCEDURE UpdateEmployee(
    p_EmployeeID NUMBER,
    p_Salary NUMBER,
    p_Department VARCHAR2
)
IS
BEGIN

    UPDATE Employees
    SET Salary = p_Salary,
        Department = p_Department
    WHERE EmployeeID = p_EmployeeID;

    COMMIT;

END;

FUNCTION CalculateAnnualSalary(
    p_EmployeeID NUMBER
)
RETURN NUMBER
IS

    v_Salary NUMBER;

BEGIN

    SELECT Salary
    INTO v_Salary
    FROM Employees
    WHERE EmployeeID = p_EmployeeID;

    RETURN v_Salary * 12;

END;

END EmployeeManagement;
/

BEGIN
    EmployeeManagement.HireEmployee(
        101,
        'Alice',
        'Manager',
        50000,
        'HR',
        SYSDATE
    );
END;
/

BEGIN
    EmployeeManagement.UpdateEmployee(
        101,
        60000,
        'Finance'
    );
END;
/

SELECT EmployeeManagement.CalculateAnnualSalary(101)
AS AnnualSalary
FROM Dual;