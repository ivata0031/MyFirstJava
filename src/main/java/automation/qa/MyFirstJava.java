package automation.qa;

import java.util.Scanner;

public class MyFirstJava {
    public static void main(String[] args) {
        //writes the text in the console
        System.out.println("Please enter your first name:");
        Scanner scanner = new Scanner(System.in);
        String firstName = scanner.next();

        System.out.println("Please enter your favorite hobby: ");
        String hobby = scanner.next();


        System.out.println("Your name is: " + firstName );
        System.out.println("Your favorite hobby is: " + hobby );


    }
}
