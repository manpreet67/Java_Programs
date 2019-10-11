import java.util.Scanner;
public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array ");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter elements ");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n/2;i++){
            //a[i]=a[i]+a[n-1-i]-(a[n-1-i]=a[i]);
            int temp=a[i];
            a[i]=a[n-i-1];
            a[n-i-1]=temp;
            
        }
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
}
