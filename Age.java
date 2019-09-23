import java.util.Scanner;
public class Age{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("input your age:");
		int age = scan.nextInt();
		age /= 18;
		switch(age){ 
		case 0:
		case 1:
		 System.out.println("you are young");
		 break;
		default:
		 System.out.println("you are old");
		 break;		
		}
	}
}