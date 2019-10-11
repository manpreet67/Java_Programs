import java.util.Scanner;
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter start and end ");
        int start=sc.nextInt();
        int end=sc.nextInt();
        for(int i=start;i<=end;i++){
            if(isArmstrong(i))
                System.out.print(i+" ");
        }
        
    }
    public static boolean isArmstrong(int x){
        int temp=x;
        int n,sum=0;
        while(x>0){
            n=x%10;
            sum+=n*n*n;
            x=x/10;
            
        }
        if(sum==temp)
            return true;
        else return false;
        
    }
    
}
