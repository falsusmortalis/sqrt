package ru.netology.javaqa.javaqamvn.services;

public class SqrtService {
    public int calcSqrt(int minNumber, int maxNumber) {
        int count = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= minNumber && i * i <= maxNumber) {
                count++;
            }
        }
        return count;
    }
}
