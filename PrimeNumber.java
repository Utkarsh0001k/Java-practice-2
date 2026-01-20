
import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int num = sc.nextInt();
        boolean prime = prime(num);
        if(prime){
            System.out.println("Your number is prime");
        }else{
            System.out.println("Your number is not prime");
        }

    }
    public static boolean prime(int num){
        int i =2;
        while(i < num){
            if(num % i == 0){
                return false;
            }
            i++;
        }
        return true;
    }
}
