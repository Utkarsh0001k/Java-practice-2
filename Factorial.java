
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n = sc.nextInt();
        long facto = factorialCal(n);
        System.out.println("Your factorial of number "+n+" is "+facto);
        
    }
    public static long factorialCal(int n){
        if(n < 2){
            return 1;
        }
        int fact = 1;
        int i = 2;
        while(i<=n){
            fact *=i;
            i++;
        }
       return fact;
    }
}
