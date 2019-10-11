import java.util.ArrayList;
import java.util.Scanner;
public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s=sc.next();
        ArrayList<Character> sl=new ArrayList<>();
        char[] a=new char[s.length()];
        a=s.toCharArray();
        for(int i=1;i<s.length();i++){
            if(a[i]==a[i-1]){
                a[i-1]='\0';
            }
        }
        for(int i=0;i<s.length();i++){
            if(a[i]!='\0'){
                sl.add(a[i]);
            }
        }
        s=sl.toString();
        System.out.println(sl);  
    }
}
