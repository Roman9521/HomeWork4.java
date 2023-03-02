package ru.ers.lesson.levelUp.homeWork.lesson6.teacher;

public class AccountExample {
    public static void main(String[] args) throws Exception {
        Acount romanAccount = new Acount("1234", 1000, "Roman Efremov");
        Acount clonew = romanAccount.clone();
        System.out.println("1 account: " + romanAccount);
        System.out.println("2 account: " + clonew);
    }
}
