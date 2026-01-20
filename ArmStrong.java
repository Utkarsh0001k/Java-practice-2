
import java.util.Scanner;

public class ArmStrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter you number ");
        int num = sc.nextInt();
        boolean armStrong = isArm(num);
        if(armStrong){
            System.out.println("Your number is Armsrong");
        }else{
            System.out.println("Your number is not Armstrong");
        }
    }
    public static boolean isArm(int num){
        int noOfDigit = noOfDigit(num);
        int finalNumber = 0;
        int dumNum = num;
        while(num > 0){
            int lastdigit = num % 10;
            num /= 10;
            finalNumber += pow(lastdigit, noOfDigit);
        }
        return finalNumber == dumNum;
    }
    public static int pow(int num1, int num2){
        int result = 1;
        int i = 0;
        while(i < num2){
            result *= num1;
            i++;
        }
        return result;
    }
    public static int noOfDigit(int num){
        int digit = 0;
        while(num > 0){
            digit++;
            num /= 10;
        }
        return digit;
    }
}
