package ru.ers.lesson.levelUp.homeWork.lesson5.teacher.converter.impl;

import ru.ers.lesson.levelUp.homeWork.lesson5.teacher.converter.Valutes;
import ru.ers.lesson.levelUp.homeWork.lesson5.teacher.converter.Exchanger;

public class UsdToRublesExchanger implements Exchanger {

    @Override
    public Valutes getType() {
        return Valutes.USD2RUR;
    }
}
