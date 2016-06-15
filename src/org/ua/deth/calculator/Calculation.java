package org.ua.deth.calculator;
public class Calculation {
    private double firstNum;
    private double secondNum;

    public Calculation() {
        firstNum = 0;
        secondNum = 0;
    }

    //Calculate the values
    private double calculate(double first, double second, String operator) {
        switch (operator.toLowerCase()) {
            case "-":
                return first - second;
            case "+":
                return first + second;
            case "/":
                return first / second;
            case "*":
                return first * second;
        }
        return 0;
    }

    // checking values and initialization
    private String getResult(String first, String second, String operator) {
        if (operator.equalsIgnoreCase("/") || operator.equalsIgnoreCase("-") || operator.equalsIgnoreCase("+")
                || operator.equalsIgnoreCase("*")) {
            if (!first.equalsIgnoreCase("") && !second.equalsIgnoreCase("") && !operator.equalsIgnoreCase("")) {
                try {
                    firstNum = Double.parseDouble(first);
                    secondNum = Double.parseDouble(second);
                } catch (NumberFormatException e) {
                    return "Check values! Allowed only digits";
                }
                if (Double.isInfinite(calculate(firstNum, secondNum, operator))) {
                    return "Division by zero";
                } else return Double.toString(calculate(firstNum, secondNum, operator));
            } else return "Insert some  data";
        } else {
            return "Check the operator value. Allowed: (+.-.*./)";
        }
    }

    public String goCalculate(String first, String second, String operator) {
        return getResult(first, second, operator);
    }
}
