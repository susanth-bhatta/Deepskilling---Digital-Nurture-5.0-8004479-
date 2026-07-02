SET SERVEROUTPUT ON;

DECLARE

    CURSOR ApplyAnnualFee IS
        SELECT AccountID,
               Balance
        FROM Accounts;

    v_Account ApplyAnnualFee%ROWTYPE;

    v_Fee NUMBER := 100;

BEGIN

    OPEN ApplyAnnualFee;

    LOOP

        FETCH ApplyAnnualFee INTO v_Account;

        EXIT WHEN ApplyAnnualFee%NOTFOUND;

        UPDATE Accounts
        SET Balance = Balance - v_Fee
        WHERE AccountID = v_Account.AccountID;

        DBMS_OUTPUT.PUT_LINE(
        'Annual fee deducted from Account ID: '
        || v_Account.AccountID);

    END LOOP;

    CLOSE ApplyAnnualFee;

    COMMIT;

END;
/