
import java.util.Scanner;

public class RightHalfPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number of rows ");
        int rows = sc.nextInt();
        rightHalfPyramid(rows);

    }
    public static void rightHalfPyramid(int rows){
        int row = 0;
        while(row < rows){
            System.out.print("*");
            int i = 0;
            while (i < row){
                System.out.print("*");
                i++;
            }
            System.out.println();
            row++;
        }
    }
}
