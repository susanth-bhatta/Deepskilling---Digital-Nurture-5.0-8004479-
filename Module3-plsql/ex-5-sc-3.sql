CREATE OR REPLACE TRIGGER CheckTransactionRules
BEFORE INSERT
ON Transactions
FOR EACH ROW
DECLARE
    v_Balance NUMBER;
BEGIN

    -- Check Deposit
    IF :NEW.TransactionType = 'Deposit' THEN

        IF :NEW.Amount <= 0 THEN
            RAISE_APPLICATION_ERROR(
                -20001,
                'Deposit amount must be positive.'
            );
        END IF;

    END IF;

    -- Check Withdrawal
    IF :NEW.TransactionType = 'Withdrawal' THEN

        SELECT Balance
        INTO v_Balance
        FROM Accounts
        WHERE AccountID = :NEW.AccountID;

        IF :NEW.Amount > v_Balance THEN

            RAISE_APPLICATION_ERROR(
                -20002,
                'Insufficient account balance.'
            );

        END IF;

    END IF;

END;
/