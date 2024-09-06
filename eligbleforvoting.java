import java.util.Scanner;

public class eligbleforvoting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        String eligibility = (age >= 18) ? "You are eligible to vote." : "You are not eligible to vote.";
        System.out.println(eligibility);

        scanner.close();
    }
}
