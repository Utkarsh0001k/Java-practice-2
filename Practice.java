import java.util.Scanner;

public class Practice {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the element number ");
    int elnum = input.nextInt();
    int[] array = new int[elnum];

    int num = 0;
    while(num < array.length){
        System.out.println("Enter Your number "+ (num + 1)+" : ");
        array[num] = input.nextInt();
        num++;
    }
      int sum = sumtotal(array);
        int avg = avgTotal(array);
        System.out.println("Total Sum of element is "+sum);
        System.out.println("Average of element is "+ avg);
}
public static int sumtotal(int array[]){
    int sum = 0;
    int i = 0;
    while(i < array.length){
        sum+= array[i];
        i++;
    }
    return sum;
}
public static int avgTotal(int array[]){
    int  sum = sumtotal(array);
    return sum / array.length;
}
    
}