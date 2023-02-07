package ru.netology.javaqa.javaqamvn.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class SqrtServiceTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/sqrt.csv")  //файл с табличкой
    public void calculateLimits(int minNumber, int maxNumber, int expected) {
        SqrtService service = new SqrtService();

        int actual = service.calcSqrt(minNumber, maxNumber);

        // проверка
        Assertions.assertEquals(expected, actual);
    }
}