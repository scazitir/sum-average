import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.CANADA);
        Scanner scan = new Scanner(System.in);

        System.out.print("How many numbers would you like to add? ");
        int num = scan.nextInt();
        double[] arr = new double[num];
        double sum = 0.0;

        for (int i = 0; i < arr.length; i++){
            System.out.print("Enter the value: ");
            arr[i] = scan.nextInt();

            sum += arr[i];
        }

        System.out.printf("SUM: %.2f", sum);
        System.out.printf("\nAverage: %.2f", (sum / arr.length));

        scan.close();
    }
}
