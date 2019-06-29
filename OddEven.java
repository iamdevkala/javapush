import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        int num;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any num");
        num = input.nextInt();

        if((num%2) == 0){
            System.out.println("The given num is even " + num);
        }
        else{
            System.out.println("The given num is odd" + num);
        }
    }
}
