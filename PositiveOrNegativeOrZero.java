import java.util.Scanner;

public class PositiveOrNegativeOrZero {
    public static void main(String[] args) {
        int num;

        Scanner input = new Scanner(System.in);
        System.out.println("enter numbers");
        num = input.nextInt();

        if(num == 0){
            System.out.println("The number is zero" );
        }

        else if(num <0 ){
            System.out.println("The num is negative");
        }

        else{
            System.out.println("The num is positive");
        }
    }
}
