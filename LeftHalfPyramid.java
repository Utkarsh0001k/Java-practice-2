
import java.util.Scanner;

public class LeftHalfPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your rows ");
        int rows = sc.nextInt();
        leftHalfPyramid(rows);
    }
    public static void leftHalfPyramid(int rows){
        int row = rows;
        while(row > 0){
            int j = 0;
            while (j < row-1){
                System.out.print("  ");
                j++;
            }
            int i = 0;
            while(i<=(rows-row)){
                System.out.print("* ");
                i++;
            }
            System.out.println();
            row--;
        }
    }
}
