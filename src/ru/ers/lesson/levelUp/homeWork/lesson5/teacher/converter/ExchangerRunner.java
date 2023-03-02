package ru.ers.lesson.levelUp.homeWork.lesson5.teacher.converter;

import ru.ers.lesson.levelUp.homeWork.lesson5.teacher.converter.impl.EuroToRublesExchanger;
import ru.ers.lesson.levelUp.homeWork.lesson5.teacher.converter.impl.UsdToRublesExchanger;

public class ExchangerRunner {

    public static void main(String[] args) {
        Exchanger eur2RurExchanger = new EuroToRublesExchanger();
        Exchanger usd2RurExchanger = new UsdToRublesExchanger();
        double money = 12.23;
        System.out.println(money + " euros = " + eur2RurExchanger.convert(money) + " rubles");
        System.out.println(money + " dollars = " + usd2RurExchanger.convert(money)  + " rubles");
    }
}
