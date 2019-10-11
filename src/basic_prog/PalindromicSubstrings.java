import java.util.Scanner;
public class PalindromicSubstrings {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a sring :");
        String str=sc.next();
        int count=0;
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<=str.length();j++){
                if(str.substring(i, j).equals(reverse(str.substring(i, j)))){
                    System.out.println(str.substring(i,j));
                    count++;
                }
            }
        }
        System.out.println(count);
    }
    public static String reverse(String str){
        String reverse="";
        for(int i=str.length()-1;i>=0;i--){
            
            reverse=reverse+str.charAt(i);
        }
        return reverse;
    }
}
