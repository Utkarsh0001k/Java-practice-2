import java.util.Scanner;

public class Search2Darray {
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
        System.out.println("Enter the number you want to search ");
        int num = input.nextInt();

        boolean found =isfound(array, num);
        if(found){
            System.out.println("Your element is found " );
        }else{
            System.out.println("Your element is not found" );
        }
    }
    public static boolean isfound (int [][] array, int num){
        int i = 0;
        while(i < array.length){
            int j = 0;
            while(j < array[i].length){
                if(array[i][j] == num){
                    return true;
                }
                j++;
            }
            i++;
        }
        return false;
    }
}
