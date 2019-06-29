import java.util.Scanner;

public class MaxOfThree {
    public static void main(String[] args) {
        int num1;
        int num2;
        int num3;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any three numbers");
        num1 = input.nextInt();
        num2 = input.nextInt();
        num3 = input.nextInt();
        if((num1 > num2) && (num1 > num3)){
            System.out.println("The max num is " + " " +num1);
        }

        else if((num2 > num1) && (num2 > num3)){
            System.out.println("the max num is " + " " +num2);
        }

        else {
            System.out.println("The max num is " + " " +num3);
        }
    }
}

