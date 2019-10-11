import java.util.Scanner;
public class ToggleAll {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string ");
        StringBuilder sb=new StringBuilder(sc.nextLine());
        for(int i=0;i<sb.length();i++){
            char c=sb.charAt(i);
            if(c>=65&&c<=91){
                c+=32;
            }else{
                c-=32;
            }
            String s=c+"";
            sb.replace(i,i+1,s); 
        }
        System.out.println(sb); 
    } 
}
