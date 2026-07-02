CREATE OR REPLACE PACKAGE CustomerManagement AS

    PROCEDURE AddNewCustomer(
        p_CustomerID NUMBER,
        p_Name VARCHAR2,
        p_DOB DATE,
        p_Balance NUMBER
    );

    PROCEDURE UpdateCustomer(
        p_CustomerID NUMBER,
        p_Name VARCHAR2,
        p_Balance NUMBER
    );

    FUNCTION GetCustomerBalance(
        p_CustomerID NUMBER
    ) RETURN NUMBER;

END CustomerManagement;
/


CREATE OR REPLACE PACKAGE BODY CustomerManagement AS

PROCEDURE AddNewCustomer(
    p_CustomerID NUMBER,
    p_Name VARCHAR2,
    p_DOB DATE,
    p_Balance NUMBER
)
IS
BEGIN

    INSERT INTO Customers
    VALUES(
        p_CustomerID,
        p_Name,
        p_DOB,
        p_Balance,
        SYSDATE
    );

    COMMIT;

END;

PROCEDURE UpdateCustomer(
    p_CustomerID NUMBER,
    p_Name VARCHAR2,
    p_Balance NUMBER
)
IS
BEGIN

    UPDATE Customers
    SET Name = p_Name,
        Balance = p_Balance,
        LastModified = SYSDATE
    WHERE CustomerID = p_CustomerID;

    COMMIT;

END;

FUNCTION GetCustomerBalance(
    p_CustomerID NUMBER
)
RETURN NUMBER
IS

    v_Balance NUMBER;

BEGIN

    SELECT Balance
    INTO v_Balance
    FROM Customers
    WHERE CustomerID = p_CustomerID;

    RETURN v_Balance;

END;

END CustomerManagement;
/


BEGIN
    CustomerManagement.AddNewCustomer(
        3,
        'David',
        DATE '1995-06-15',
        5000
    );
END;
/

BEGIN
    CustomerManagement.UpdateCustomer(
        3,
        'David Kumar',
        8000
    );
END;
/

SELECT CustomerManagement.GetCustomerBalance(3)
AS Balance
FROM Dual;
