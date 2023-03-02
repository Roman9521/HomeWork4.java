package ru.ers.lesson.levelUp.homeWork.lesson5.teacher.converter.impl;

import ru.ers.lesson.levelUp.homeWork.lesson5.teacher.converter.Exchanger;
import ru.ers.lesson.levelUp.homeWork.lesson5.teacher.converter.Valutes;

public class EuroToRublesExchanger implements Exchanger {

    @Override
    public Valutes getType() {
        return Valutes.EUR2RUR;
    }
}
