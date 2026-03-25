import java.util.Scanner;

public class Shorted {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.println("Enter your element number ");
        int num = input.nextInt();
        int[] array = new int[num];
        int i = 0;
        while(i <array.length){
            System.out.println("Enter the number "+(i + 1)+ " : ");
            array[i]=input.nextInt();
            i++;
        }
        boolean inc = isIncreasing(array);
        boolean dec = isDecreacing(array);
        if(inc || dec){
            System.out.println("Your Element is shorted ");
        }else{
            System.out.println("Your Element is not shorted ");
        }
    }
    public static boolean isIncreasing(int array[]){
        int i = 1;
        while(i < array.length){
            if(array[i] < array[i - 1]){
                return false;
            }
            i++;
        }
        return true;
    }
    public static boolean isDecreacing(int array[]){
        int i = 1;
        while(i < array.length){
            if(array[i] > array[i - 1]){
                return false;
            }
            i++;
        }
        return true;
    }
}
