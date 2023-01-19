import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        try (Scanner x = new Scanner(System.in)) {
            System.out.println("Enter the first number");
            int n1 = x.nextInt();
            System.out.println("Enter the second number");
            int n2 = x.nextInt();
            System.out.println("Choose:\n[1] ADD\n[2] SUBTRACT\n[3] MULTIPLY\n[4] DIVIDE");
            int o = x.nextInt();
            int r;
            switch (o) {
                case 1:
                    r = n1 + n2;
                    System.out.println("Result: " + r);
                    break;
                case 2:
                    r = n1 - n2;
                    System.out.println("Result: " + r);
                    break;
                case 3:
                    r = n1 * n2;
                    System.out.println("Result: " + r);
                    break;
                case 4:
                    r = n1 / n2;
                    System.out.println("Result: " + r);
                    break;
                default:
                    System.out.println("Invalid choice. Please choose either 1,2,3 or 4.");
                    break;
            }
        }
    }
}
