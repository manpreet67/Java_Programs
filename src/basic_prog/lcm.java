package basic_prog;
import java.util.Scanner;
public class lcm {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter two numbers: ");
		int x=sc.nextInt();
		int y=sc.nextInt();
		if(x<y){
			if(y%x==0)
				System.out.println("lcm: "+x);
			else
				System.out.println("lcm: "+x*y);
		}
		else{
			if(y%x==0)
				System.out.println("lcm: "+y);
			else
				System.out.println("lcm: "+x*y);	
		}
	}
}
