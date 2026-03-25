import java.util.Scanner;

public class Arrayutality {
    public static int [] [] arrayutality(){
         Scanner input = new Scanner(System.in);
        System.out.println("Enter your rows ");
        int rows = input.nextInt();
         System.out.println("Enter your coloums ");
        int coloums = input.nextInt();
        int[][] array = new int[rows][coloums];
        int i = 0;
        while(i < rows){
            int j = 0;
            while( j < coloums){
            System.out.println("Enter the rows :"+(i + 1)+ " and coloums  " +(j + 1)+ " : ");
            array[i][j]=input.nextInt();
            j++;
            }
            i++;
        }
        
    }
}
