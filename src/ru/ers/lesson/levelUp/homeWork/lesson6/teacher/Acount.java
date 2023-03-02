package ru.ers.lesson.levelUp.homeWork.lesson6.teacher;

public class Acount implements Cloneable{
    private String accountNumber;
    private double balance;
    private Owner owner;

    public Acount(String accountNumber, double balance, String owner) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.owner = new Owner(owner);
    }

    @Override
    protected Acount clone() throws CloneNotSupportedException {
        Acount clone = (Acount) super.clone();
        clone.owner = clone.owner.clone();
        return clone;
    }

    @Override
    public String toString() {
        return "Acount{" +
                "accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                ", owner=" + owner +
                '}';
    }

    public static class Owner implements Cloneable {
        private String fullName;

        public Owner(String fullName) {
            this.fullName = fullName;
        }

        @Override
        protected Owner clone() throws CloneNotSupportedException {
            return (Owner) super.clone();
        }

        @Override
        public String toString() {
            return "Owner{" +
                    "fullName='" + fullName + '\'' +
                    '}';
        }
    }
}
