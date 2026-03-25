import java.util.Scanner;
public class Reverse {
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
        reverce(array);
        System.out.println("Here is your reverce element ");
        int n = 0;
        while(n < array.length){
            System.out.println(array[n]+" ");
            n++;
        }
    }
    public static void reverce(int [] array){
        int i = 0;
        while(i < array.length / 2){
            int swap = array[i];
            array[i] = array[(array.length - 1) - i];
            array[(array.length - 1) - i] = swap;
            i++;
        }
    }
}
