package org.example.design.patterns.strategy;

public class MathCalculationContext {

    private MathCalulations mathCalulations;

    public MathCalculationContext(MathCalulations mathCalulations) {
        this.mathCalulations = mathCalulations;
    }

    public int executeMath(int num1,int num2){
        return mathCalulations.math(num1, num2);
    }
}
