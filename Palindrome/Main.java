package Palindrome;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Word :");
        String palin = input.nextLine();
        StringBuilder sb = new StringBuilder(palin);
        String message = (palin.equalsIgnoreCase(sb.reverse().toString()))?"Palindrome": "not Palindrome";
        System.out.println(message);
        
        
    }
}
