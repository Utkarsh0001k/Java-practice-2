import java.util.Scanner;

public class Sumof2dArray {
    public static void main(String[] args) {
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
        long sum = sum(array);
        double average = avg(array);
        System.out.println("Sum of element is "+sum);
        System.out.println("Average of element is " +average);
    }
    public static long sum(int[][] array){
        long sum = 0;
        int i = 0;
        while(i < array.length) {
            int j = 0;
            while(j < array[i].length){
                sum+= array[i][j];
                j++;
            }
            i++;
        }
        return sum;
    }
    public static double avg (int[][] array){
        if(array.length == 0){
            return 0;
        }
        int rows = array.length;
        int clms = array[0].length;
        double size = rows * clms;
        return sum(array) / size;
    }
        
}
