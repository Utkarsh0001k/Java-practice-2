import java.util.Scanner;

public class MinMax {
    public static void main (String []args){
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
        int min = minimum(array);
        int max = maximum(array);
        System.out.println("Minimum number in the element is " + min);
        System.out.println("Maximum number in the element is " + max);
    }
    public static int minimum(int array[]){
        int min = Integer.MAX_VALUE;
        int i = 0;
        while (i < array.length){
            if (min > array[i]){
                min = array[i];
            }
            i++;
        }

        return min;
    }
    public static int maximum (int array[]){
        if(array.length==0){
            return Integer.MIN_VALUE;
        }
        int max = array[0];
        int i = 1;
        while(i < array.length){
            if(max < array[i]){
                max = array[i];
            }
            i++;
        }
        return max;
    }
}
