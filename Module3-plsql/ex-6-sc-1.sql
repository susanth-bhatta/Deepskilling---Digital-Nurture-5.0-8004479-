SET SERVEROUTPUT ON;

DECLARE

    CURSOR GenerateMonthlyStatements IS
        SELECT t.TransactionID,
               c.CustomerID,
               c.Name,
               t.AccountID,
               t.TransactionDate,
               t.Amount,
               t.TransactionType
        FROM Customers c
        JOIN Accounts a
            ON c.CustomerID = a.CustomerID
        JOIN Transactions t
            ON a.AccountID = t.AccountID
        WHERE TO_CHAR(t.TransactionDate,'MMYYYY') =
              TO_CHAR(SYSDATE,'MMYYYY');

    v_Record GenerateMonthlyStatements%ROWTYPE;

BEGIN

    OPEN GenerateMonthlyStatements;

    LOOP

        FETCH GenerateMonthlyStatements INTO v_Record;

        EXIT WHEN GenerateMonthlyStatements%NOTFOUND;

        DBMS_OUTPUT.PUT_LINE('---------------------------');
        DBMS_OUTPUT.PUT_LINE('Customer ID : ' || v_Record.CustomerID);
        DBMS_OUTPUT.PUT_LINE('Customer Name : ' || v_Record.Name);
        DBMS_OUTPUT.PUT_LINE('Account ID : ' || v_Record.AccountID);
        DBMS_OUTPUT.PUT_LINE('Transaction ID : ' || v_Record.TransactionID);
        DBMS_OUTPUT.PUT_LINE('Amount : ' || v_Record.Amount);
        DBMS_OUTPUT.PUT_LINE('Type : ' || v_Record.TransactionType);
        DBMS_OUTPUT.PUT_LINE('Date : ' ||
        TO_CHAR(v_Record.TransactionDate,'DD-MON-YYYY'));

    END LOOP;

    CLOSE GenerateMonthlyStatements;

END;
/