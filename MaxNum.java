import java.util.Scanner;

public class MaxNum {
    public static void main(String[] args) {
        float num;
        float num1;
        Scanner input = new Scanner(System.in);
        System.out.println("enter any two numbers ");

        num = input.nextFloat();
        num1 = input.nextFloat();
        if(num >= num1){
            System.out.println("The max no is " + " " +num);
        }

        else {
            System.out.println("The max no is " + " " + num1);
        }
    }
}
