package com.roy._14oop.solid.o.problem;

/*
 Let take a scenario we need to add another currentLoanValidator
 Thus we would need to add a field and method for the same which means
 this class is not closed so cannot be packaged to a separate library.
 Also, it is not open too because we would not be able to extend it.
 */


public class LoanHandler {
    private PersonalLoanValidator personalLoanValidator;
    private MortgageLoanValidator mortgageValidator;

    public void approvePersonalLoan(User user) {
        if (personalLoanValidator.isValidUserForPersonalLoan(user)) {
            // proceed with personal loan approval
        }
    }

    public void approveMortgage(User user) {
        if (mortgageValidator.isValidUserForMortgage(user)) {
            // proceed with personal loan approval
        }
    }
}
