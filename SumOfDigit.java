
import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int n = sc.nextInt();
        int addNum = calNumber(n);
        System.out.println("Your addition is "+addNum);

    }
    public static int calNumber(int n){
        int sum = 0;
        while(n>0){
            sum += n %10;
            n/=10;
        }
        return sum;
    }
}
