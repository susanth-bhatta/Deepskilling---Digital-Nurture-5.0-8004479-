BEGIN
    FOR cust IN (
        SELECT CustomerID,
               DOB
        FROM Customers
    )
    LOOP
        -- Check if customer age is greater than 60
        IF TRUNC(MONTHS_BETWEEN(SYSDATE, cust.DOB) / 12) > 60 THEN

            UPDATE Loans
            SET InterestRate = InterestRate - 1
            WHERE CustomerID = cust.CustomerID;

            DBMS_OUTPUT.PUT_LINE(
                'Interest rate updated for Customer ID: ' || cust.CustomerID
            );

        END IF;
    END LOOP;

    COMMIT;
END;
/