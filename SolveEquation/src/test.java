import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			System.out.println("«Î ‰»Îa£¨b£¨c");
			double a = sc.nextDouble();
			double b = sc.nextDouble();
			double c = sc.nextDouble();
			SolveEquation e = new SolveEquation(a,b,c);
			e.Solve();
			
			
	}

}
