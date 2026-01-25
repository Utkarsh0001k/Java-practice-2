
import java.util.Scanner;

public class ArrSumAvg {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number ");
        int num = sc.nextInt();
        int [] arreyy = new int [num];
        int i = 0;
        while(i < num){
            System.out.print("Please enter you number "+ (i + 1)+": ");
            arreyy[i]=sc.nextInt();
            i++;
        }
        long sum = sum(arreyy);
        double avg = avg(arreyy);
        System.out.println("Your sum of number is "+sum);
        System.out.println("Your avg of number  is "+avg);

    }
    public static long sum (int[] arreyy){
        long sum = 0;
        int i = 0;
        while(i < arreyy.length){
            sum += arreyy[i];
            i++;
        }
        return sum;
    }
    public static double avg (int [] arreyy){
        long sum = sum(arreyy);
        return sum/arreyy.length;
    }
}
