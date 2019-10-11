import java.util.Scanner;
public class RotateArrayWithKDegree {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array ");
        int n=sc.nextInt();
        int[] a=new int[n];
        System.out.println("Enter elements ");
        for(int i=0;i<n;i++)a[i]=sc.nextInt();
        System.out.print("Enter degree of rotation ");
        int k=sc.nextInt();
        for(int i=0;i<k;i++){
            int x=a[n-1];
            for(int j=n-1;j>0;j--)
                a[j]=a[j-1];
            a[0]=x;
        }
        for(int i=0;i<n;i++)System.out.print(a[i]+" ");
    }
    
}
