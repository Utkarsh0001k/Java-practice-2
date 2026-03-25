import java.util.Scanner;

public class Occurance {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of element ");  
        int num = input.nextInt();
        int[] array = new int[num];
        int n = 0;
        while (n < array.length){
            System.out.println("Enter the number "+(n +1)+" : ");
            array[n] = input.nextInt();
            n++;
        }
        System.out.println("Enter the number to check how many times it occurs ");
        int num1 = input.nextInt();

        int occ = occurance(array, num1);
        System.out.println("Your number occures "+occ+" times");

    }
    public static int occurance(int array[], int num1){
        int occ = 0;
        int i =0;
        while(i < array.length){
            if(array[i] == num1){
                occ++;
            }
            i++;
        }
        return occ;
    }
}
