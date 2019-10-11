import java.util.Scanner;
public class VowelBetweenConsonents {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter String :");
        StringBuilder sb=new StringBuilder(sc.nextLine());
        for(int i=0;i<sb.length()-2;i++){
            if(!isVowel(sb.charAt(i))&&isVowel(sb.charAt(i+1))&&!isVowel(sb.charAt(i+2))){
                sb.delete(i+1,i+2);
            }
        }
        System.out.println(sb);
        
    }
    public static boolean isVowel(char ch){
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
            return true;
        }else return false;
    }
    
}
