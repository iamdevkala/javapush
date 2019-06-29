import java.util.Scanner;

public class FindVowel {
    public static void main(String[] args) {
        char userInput;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter characters a to z");
        userInput = input.next().charAt(0);
//        System.out.println(userInput);

//        if(userInput == 'a' ){
//            System.out.println("A is a vowel " );
//        }
//        else if(userInput == 'e'){
//            System.out.println("e is a vowel " );
//        }
//
//        else if(userInput == 'i'){
//            System.out.println("i is a vowel " );
//        }
//
//        else if(userInput == 'o'){
//            System.out.println("o is a vowel " );
//        }
//
//        else if(userInput == 'u'){
//            System.out.println("u is a vowel " );
//        }
//        else {
//            System.out.println(userInput + " is consonant");
//        }

//        Alternative soulution

        if(userInput == 'a' || userInput == 'e' || userInput == 'i' || userInput == 'o' || userInput == 'u'){
            System.out.println(userInput +" is a vowel");
        }

        else{
            System.out.println(userInput + " is consonant");
        }
    }
}
