
import java.util.Scanner;

public class Lcm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your first number ");
        int a = sc.nextInt();
        System.out.print("Enter your second number ");
        int b = sc.nextInt();
        int lcm = lcm(a, b);
        System.out.println("Lcm of your given number is "+lcm);

    }
    public static int lcm(int a, int b){
        int i = 1;
        while(true){
            int first = a*i;
            if(first % b == 0){
                return first;
            }
            i++;
        }
    }
}
