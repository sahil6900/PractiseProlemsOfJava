package org.example.design.patterns.strategy;

public class MathCalculationMain {
    public static void main(String[] args) {

        MathCalculationContext context1 = new MathCalculationContext(((num1, num2) -> num1+num2));
        System.out.println(context1.executeMath(10,15));

        MathCalculationContext context2 = new MathCalculationContext(((num1, num2) -> num1-num2));
        System.out.println(context2.executeMath(40,50));

        MathCalculationContext context3 = new MathCalculationContext(((num1, num2) -> num1*num2));
        System.out.println(context3.executeMath(200,500));
    }
}
