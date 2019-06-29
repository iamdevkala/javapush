import java.util.Scanner;

public class DivisibleByFiveOrNot {
    public static void main(String[] args) {
        int num;

        Scanner input = new Scanner(System.in);
        System.out.println("enter any number");

        num = input.nextInt();

        if(num%5 == 0){
            System.out.println(  num + " is divisible by 5 ");
        }
        else{
            System.out.println( num + " is not divisible by 5");
        }
    }
}

