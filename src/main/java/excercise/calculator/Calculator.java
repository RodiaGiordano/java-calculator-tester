package java.calculator;

public abstract class Calculator {

    public static float add(float num1, float num2){
        return num1 + num2;
    }
    public static float subtract(float num1, float num2){
        return num1 - num2;
    }
    public static float divide(float num1, float num2)throws IllegalArgumentException{
        if(!isValidDivide(num1, num2)){
            throw new IllegalArgumentException("Non si può dividere per 0");
        }
        return num1 / num2;
    }
    public static float multiply(float num1, float num2) {

        return num1 * num2;
    }

    private static boolean isValidDivide(float num1, float num2){
        return (num2 > 0);
    }

}
