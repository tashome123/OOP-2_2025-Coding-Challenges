package Week_1;

public class Challenge1_Call_A_Function {
    public static int calculateSum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 7;
        int result = calculateSum(num1, num2);
        System.out.println("Sum of " + num1 + " and " + num2 + " is: " + result);
    }
}