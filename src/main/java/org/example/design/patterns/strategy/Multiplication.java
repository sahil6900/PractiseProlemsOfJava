package org.example.design.patterns.strategy;

public class Multiplication implements MathCalulations{
    @Override
    public int math(int num1, int num2) {
        return num1*num2;
    }
}
