SET SERVEROUTPUT ON;

DECLARE

    CURSOR UpdateLoanInterestRates IS
        SELECT LoanID,
               InterestRate
        FROM Loans;

    v_Loan UpdateLoanInterestRates%ROWTYPE;

BEGIN

    OPEN UpdateLoanInterestRates;

    LOOP

        FETCH UpdateLoanInterestRates INTO v_Loan;

        EXIT WHEN UpdateLoanInterestRates%NOTFOUND;

        UPDATE Loans
        SET InterestRate = InterestRate - 0.5
        WHERE LoanID = v_Loan.LoanID;

        DBMS_OUTPUT.PUT_LINE(
        'Updated Loan ID: ' || v_Loan.LoanID);

    END LOOP;

    CLOSE UpdateLoanInterestRates;

    COMMIT;

END;
/