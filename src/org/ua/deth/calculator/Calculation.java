package org.ua.deth.calculator;

/**
 * Created by DethGhost on 15.06.2016.
 */
public class Calculation {
    private double firstNum;
    private double secondNum;
    private double total;

    public Calculation() {
        total = 0;
        firstNum = 0;
        secondNum = 0;

    }

    //Подсчет
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

    // логика, проверка на ошибки
    private String logic(String first, String second, String operator) {
        if(operator.equalsIgnoreCase("/") || operator.equalsIgnoreCase("-") || operator.equalsIgnoreCase("+")
                || operator.equalsIgnoreCase("*")) {
            if (first != "" && second != "" && operator != "") {
                try {
                    firstNum = Double.parseDouble(first);
                    secondNum = Double.parseDouble(second);
                } catch (NumberFormatException e) {
                    return "Check values!";
                }
                total = calculate(firstNum, secondNum, operator);
                if (Double.isInfinite(total)) {
                    return "Division by zero";
                } else return Double.toString(total);
            } else return "Insert some  data";
        }else {
            return "Check the operator value. Allowed: (+.-.*./)";
        }


    }
    public String goCalculate(String first, String second, String operator){
        return logic(first,second,operator);
    }
}
