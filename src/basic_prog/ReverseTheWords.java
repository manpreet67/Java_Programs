import java.util.Scanner;
public class ReverseTheWords {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String :");
        StringBuilder sb=new StringBuilder(sc.nextLine());
        String[] s=sb.toString().split(" ");
        String res="";
        for(int i=s.length-1;i>=0;i--){
            res=res+s[i]+" ";
        }
        System.out.println(res);
    }
    
}
