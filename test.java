import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//≤‚ ‘Administration
		Administration man = new Administration();
		man.CreateAdministrator("ad1", 18 ,"001", "abc");

		Scanner sc = new Scanner(System.in);
		System.out.println("please input initial administrator's number and key");
		String num = sc.nextLine();
		String key = sc.nextLine();
		
		if(man.IsAdministartor(num, key))
		{
			man.administration();
			man.print();
		}
		else
			System.out.println("number or key wrong");
		man.ChangeStu("001");
		man.printStu();
		man.DeleteStu("001");
		man.printStu();
		
		/*Manage man = new Manage();
		
		man.CreateStu("lm", 19, "2", "cs", "001", "1");
		man.CreateStu("zyz", 19, "2", "cs", "002", "1");
		man.CreateTea("yj", 40, "002", "js", "doctor", 15000f);
		man.CreateTea("lo", 45, "003", "pl", "doctor", 13000f);
		man.PrintPerSize();
		man.PrintStu();
		man.PrintTea();
*/		
	}

}
