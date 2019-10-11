import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s=sc.next();
        char[] ch=s.toCharArray();
        boolean flag=true;
        int i=0;
        int j=s.length()-1;
        for(int k=0;k<s.length();k++){
            if(ch[i]!=ch[j]){
                flag=false;
                i++;
                j--;
            }
        }
        if(flag)System.out.println("Palindrome");
        else System.out.println("Not palindrome");
    }
    
}
