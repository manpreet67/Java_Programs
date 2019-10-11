import java.util.Scanner;
public class CountDeletion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a String: ");
        StringBuilder sb=new StringBuilder(sc.nextLine());
        int count=0;
        for(int i=0;i<sb.length();i++){
            if(sb.charAt(i)==sb.charAt(i+1)){
                sb.delete(i,i+2);
                count++;
            }
        }
        System.out.println(count);
        
    }
    
}
