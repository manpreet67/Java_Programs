import java.util.Scanner;
import java.util.ArrayList;
public class IntersectionPoint {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of first array  :");
        int size1=sc.nextInt();
        System.out.println("Enter elements ");
        int[] a=new int[size1];
        for(int i=0;i<size1;i++)a[i]=sc.nextInt();
        System.out.print("Enter size of second array :");
        int size2=sc.nextInt();
        System.out.println("Enter elements ");
        int[] b=new int[size2];
        for(int i=0;i<size2;i++)b[i]=sc.nextInt();
        ArrayList<Integer> al=new ArrayList<>();
         int i = 0, j = 0; 
        while (i < a.length && j < b.length) 
        { 
          if (a[i] < b[j]) 
            i++; 
          else if (a[j] >b[i]) 
            j++; 
          else 
          { 
           al.add((int)b[i]);
          } 
        } 
        System.out.println(al);
    } 
}
