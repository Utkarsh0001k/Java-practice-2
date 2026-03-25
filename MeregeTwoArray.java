import java.util.Scanner;

public class MeregeTwoArray {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        System.out.println("Enter your element number 1");
        int num = input.nextInt();
        int[] array1 = new int[num];
        int i = 0;
        while(i <array1.length){
            System.out.println("Enter the number "+(i + 1)+ " : ");
            array1[i]=input.nextInt();
            i++;
        }
         System.out.println("Enter your element number 2");
        int num1 = input.nextInt();
        int[] array2 = new int[num1];
        int n = 0;
        while(n <array2.length){
            System.out.println("Enter the number "+(n + 1)+ " : ");
            array2[n]=input.nextInt();
            n++;
        }
        int [] newarr = merge(array1, array2);
        System.out.println("Merge element is ");
        for(int x = 0; x < newarr.length; x++){
            System.out.print(newarr[x] + " ");
}

    }
    public static int[] merge(int[]array1, int[]array2){
        int newSum = array1.length + array2.length;
        int [] newArray = new int [newSum];
        int i = 0, j = 0, k = 0;
        while(i < array1.length || j < array2.length){
            if(j == array2.length || i < array1.length && array1[i] < array2[j] ){
                newArray[k] = array1[i];
                i++;
                k++;
            }else{
                newArray[k] = array2[j];
                j++;
                k++;
            }
        }
        return newArray;

    }
}
