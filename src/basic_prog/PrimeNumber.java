import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter start and end ");
        int start=sc.nextInt();
        int end=sc.nextInt();
        boolean bool=true;
        for(int i=start;i<=end;i++){
            bool=true;
            for(int j=2;j<i;j++){
                if(i%j==0)
                    bool=false;
            }
            if(bool)
                System.out.print(i+" ");
        }
    }
}
