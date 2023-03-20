import java.util.Scanner;
public class Main {
 
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		in.close();
		
		System.out.print((n>=90)?"A": (n>=80)? "B": (n>=70)? "C": (n>=60)? "D": "F");
	}
}