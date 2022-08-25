import java.util.Scanner;

public class nextAndPrevios {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int c = a + 1;
        System.out.println("The next number for the number " + a + " is " + c + ".");
        int b = a - 1;
        System.out.println("The previous number for the number " + a + " is " + b + ".");
    }
}
