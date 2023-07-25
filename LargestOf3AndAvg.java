import java.util.Scanner;

public class LargestOf3AndAvg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.println("Enter second number: ");
        int num2 = sc.nextInt();

        System.out.println("Enter third number: ");
        int num3 = sc.nextInt();

        
        int largest = num1;
        if (num2 > largest) {
            largest = num2;
        }
        if (num3 > largest) {
            largest = num3;
        }


        System.out.println("The largest number is: " + largest);

	double avg = (num1 + num2 + num3) / 3.0;
        System.out.println("The average of the three numbers is: " + avg);
    }
}
