package ru.ers.lesson.levelUp.homeWork.lesson5.teacher.abstractcl;

public final class PersonalAccount extends Account {

    private final String fullName// = "100"
            ;

    public PersonalAccount(String fullName, String accountNumber, double balance) {
        super(accountNumber, balance);
        this.fullName = fullName;
    }

    @Override
    public double taxes() {
        return 0;
    }
}