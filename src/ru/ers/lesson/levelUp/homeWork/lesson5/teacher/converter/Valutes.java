package ru.ers.lesson.levelUp.homeWork.lesson5.teacher.converter;

import static ru.ers.lesson.levelUp.homeWork.lesson5.teacher.converter.Valutes.Values.RUBLES_IN_DOLLAR;

public enum Valutes {
    USD2RUR(Values.RUBLES_IN_EURO),
    EUR2RUR(RUBLES_IN_DOLLAR);

    private double value;

    Valutes(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    public static class Values {
        public static final double RUBLES_IN_EURO = 79.5654;
        public static final double RUBLES_IN_DOLLAR = 74.2077;
    }
}
