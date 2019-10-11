import java.util.Scanner;
public class MaxArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array ");
        int n=sc.nextInt();
        int[] a=new int[n];
        int max=a[0];
        System.out.println("Enter elements:");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(a[i]>max)max=a[i];
        }
        System.out.println("Maximum number is :"+max);
    } 
}
