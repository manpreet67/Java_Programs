import java.util.Scanner;
public class FindSmallestCharacter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of char array :");
        int n=sc.nextInt();
        char[] ch=new char[n];
        System.out.print("Enter elements: ");
        for(int i=0;i<n;i++)ch[i]=sc.next().charAt(0);
        System.out.print("Enter element to find nearest ");
        char c=sc.next().charAt(0);
        int diff=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(diff>ch[i]-c)
                diff=ch[i]-c;
          }
        System.out.println((char)(c+diff));
    }
}
