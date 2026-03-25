import java.util.Scanner;

public class DeleteArray {
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
        System.out.println("Enter the number you want to delete ");
        int numDel = input.nextInt();

        int [] delnewaar = deleteArray(array, numDel);
        System.out.println("Here is Your new array " );
        int n = 0;
        while (n < delnewaar.length){
            System.out.println(delnewaar[n] +" ");
            n++;
        }
        
    }
     public static int occurance(int array[], int numDel){
        int occ = 0;
        int i =0;
        while(i < array.length){
            if(array[i] == numDel){
                occ++;
            }
            i++;
        }
        return occ;
    }
    public static int [] deleteArray(int [] array,int numDel){
        int occ = occurance(array, numDel);
        if(occ == 0){
            return array;
        }
        int newSize = array.length - occ;
        int [] newArray = new int[newSize];
        int i = 0, j = 0;
        while(i < array.length){
            if(array[i] != numDel){
                newArray[j] = array[i];
                j++;
            }
            i++;
        }

        return newArray;
    }
}
