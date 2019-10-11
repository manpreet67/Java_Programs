import java.util.Scanner;
public class largestContinuesSpanMaxSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array ");
        int n=sc.nextInt();
        int[] a=new int[n];
        int sum,temp;
        sum=a[0];
        System.out.println("Enter elements ");
        for(int i=0;i<n;i++)a[i]=sc.nextInt();
        for(int i=0;i<n;i++){
            temp=a[i];
            for(int j=i+1;j<n;j++){
                if(temp>sum)
                    sum=temp;
                temp+=a[j];
            }
        }
        System.out.println("Max sum is "+sum);
    }
}
