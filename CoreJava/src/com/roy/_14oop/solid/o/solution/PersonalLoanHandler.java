package com.roy._14oop.solid.o.solution;

public class PersonalLoanHandler implements LoanHandler{
    private Validator validator;

    public PersonalLoanHandler(Validator validator) {
        this.validator = validator;
    }

    @Override
    public void approveLoan(User user) {
        if (validator.isValid(user)) {
            // proceed with loan approval
        }
    }
}
