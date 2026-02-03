import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int original = num;
        int sum = 0;
        int digit;
        int count = 0;   
        int temp = num;
        while(temp != 0) {
            count++;
            temp = temp / 10;
        }     
        temp = num;
        while(temp != 0) {
            digit = temp % 10;
            sum = sum + (int)Math.pow(digit, count);
            temp = temp / 10;
        }
        if(sum == original) {
            System.out.println("It is an Armstrong Number");
        } else {
            System.out.println("Not an Armstrong Number");
        }

    }
}
