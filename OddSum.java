
import java.util.Scanner;

public class OddSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number ");
        int n = sc.nextInt();
        int sumb = summ(n);
        System.out.println("Odd number till "+ n + " is "+ sumb);
    }
    public static int summ (int n){
        int sum = 0;
        int i = 1;
        while(i <= n){
            sum += i;
            i += 2;
        }
        return sum;
    }
}
