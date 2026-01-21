
import java.util.Scanner;

public class ReverseRiightHalfPyramid{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your rows");
        int rows = sc.nextInt();
        reverseRightHalfPyramid(rows);

    }
    public static void reverseRightHalfPyramid(int rows){
        int row = rows;
        while(row > 0){
            int i = 0;
            while(i < row){
                System.out.print("* ");
                i++;
            }
            System.out.println();
            row--;
        }
    }
}