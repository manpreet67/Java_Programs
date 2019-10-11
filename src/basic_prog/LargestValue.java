import java.util.Scanner;
public class LargestValue {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int size=sc.nextInt();
        System.out.print("Enter elements: ");
        int[] a=new int[size];
        for(int i=0;i<size;i++)a[i]=sc.nextInt();
        String s="";
        for(int i=0;i<size-1;i++){
            for(int j=i+1;j<size;j++){
                String s1=a[i]+"";
                String s2=a[j]+"";
                String s3=s1+s2;
                String s4=s2+s1;
                if(Integer.parseInt(s3)<Integer.parseInt(s4)){
                    int temp=a[j];
                    a[j]=a[i];
                    a[i]=temp;
                    
                }
            }
            
        }
        for(int i=0;i<size;i++)s+=a[i];
        System.out.println(s);
    }
    
}
