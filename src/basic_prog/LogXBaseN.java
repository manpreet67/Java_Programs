import java.util.Scanner;
public class LogXBaseN {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter value and base ");
        int n=sc.nextInt();
        int base=sc.nextInt();
        System.out.println(Log2n(n)/Log2n(base)); 
    }
    static int Log2n(int n) 
    { 
        return (n > 1) ? 1 + Log2n(n / 2) : 0; 
    }  
}
