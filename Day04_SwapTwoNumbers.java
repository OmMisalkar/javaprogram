// Day 4 - Swap Two Numbers Using a Third Variable

public class Day04_SwapTwoNumbers {

    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 20;

        System.out.println("Before Swapping:");
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        // Swapping
        int temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("\nAfter Swapping:");
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
    }
}