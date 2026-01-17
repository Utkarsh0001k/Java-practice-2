
import java.util.Scanner;

public class Gcd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your fisrt number: ");
        int fisrt = sc.nextInt();
        System.out.print("Enter your second number: ");
        int second = sc.nextInt();
        int gcd = gcd(fisrt, second);
        System.out.println("GCD of your number is "+gcd);
    }
    public static int gcd (int first, int second){
        int gcd = 1;
        int i = 2;
        int least = least(first, second);
        while(i<=least){
            if(first % i == 0 && second % i == 0 ){
                gcd = i;
            }
            i++;
        }
        return gcd;
    }
    public static int least(int first, int second){
        if(first < second){
            return first;
        }else{
            return second;
        }
        
    }
}
