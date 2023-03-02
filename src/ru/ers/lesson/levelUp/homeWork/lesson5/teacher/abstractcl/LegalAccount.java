package ru.ers.lesson.levelUp.homeWork.lesson5.teacher.abstractcl;

public class LegalAccount extends Account {

    private String companyName;

    public LegalAccount(String companyName, String accountNumber, double balance) {
        super(accountNumber, balance);
        this.companyName = companyName;
    }

    @Override
    public double taxes() {
        return 0.2;
    }
}
