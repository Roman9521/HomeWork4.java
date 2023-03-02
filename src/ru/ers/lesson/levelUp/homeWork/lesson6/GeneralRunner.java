package ru.ers.lesson.levelUp.homeWork.lesson6;

public class GeneralRunner {
    public static void main(String[] args) {
        General<String, Dog, Double> general1 = new General("Some line", new Dog(), 16.);
        General<Integer, Cat, Float> general2 = new General(4, new Cat(), 11.f);
        General<Boolean, Dog, Byte> general3 = new General(true, new Dog(), 0);
        General<Long, Cat, Long> general4 = new General(1254, new Cat(), 125565);
        General[] array = new General[] {general1, general2, general3, general4};
        for (General arr : array) {
            System.out.println(arr);
            arr.showInfo();
            System.out.println("------------");
        }
    }
}
