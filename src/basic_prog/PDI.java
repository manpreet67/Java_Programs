import java.util.Scanner;
public class PDI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :");
        int n = sc.nextInt();
        PDI(n);
    }
    public static void PDI(int n) {
        if (n == 0) {
            return;
        }
        System.out.print(n+" ");
        PDI(n - 1);
        System.out.print(n+" ");
    }
}
