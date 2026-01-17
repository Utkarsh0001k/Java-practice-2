
import java.util.Scanner;

public class MulTable {
    public static void main(String[] args) {
        System.out.println("Welcom to multiplication table \n");
        System.out.print("Enter the number  ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       Multinumber(n);
    }
    public static  void Multinumber(int n){
            int i = 1;
        while(i<=10){
            System.out.println(n + " X " + i + " = "+ (n*i));
            i++;
        }
        }
}
