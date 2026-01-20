
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number ");
        int num = sc.nextInt();
        boolean ispalindrome = ispalindrome(num);
        if(ispalindrome){
            System.out.print("Your number is palindrome");
        }else{
            System.out.println("Your number is not palindrom ");
        }
    }
    public static boolean ispalindrome(int num){
        return num == reverce(num);
    }
    public static int reverce (int num){
        int newNum = 0;
        while (num > 0){
        int digit = num % 10;
        newNum = newNum * 10 + digit;
        num /= 10;
        }
        return newNum;
    }
}
