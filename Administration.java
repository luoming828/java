
import java.util.LinkedList;

import java.util.Scanner;

public class Administration extends Administrator {
	private LinkedList<Student> Stu = new LinkedList<Student>();
	private LinkedList<Teacher> Tea = new LinkedList<Teacher>();
	private LinkedList<Ad_staff> Ads = new LinkedList<Ad_staff>();
	private LinkedList<Staff> Sta = new LinkedList<Staff>();
	private LinkedList<Administrator> Adt = new LinkedList<Administrator>();
	
	public  void CreateStu(String name,int age,String grade,String major,String num,String Class)
	{
		Student stu1 = new Student();
		stu1.setStrName(name);
		stu1.setiAge(age);
		stu1.setStrGrade(grade);
		stu1.setStrMajor(major);
		stu1.setStrNum(num);
		stu1.setStrClass(Class);
		Stu.add(stu1);
		System.out.println("Creating Successful! ");
		System.out.println();
		
	}
	public  void CreateTea(String name,int age,String num,String position,String education,float Salary)
	{
		Teacher tea = new Teacher();
		tea.setStrName(name);
		tea.setiAge(age);
		tea.setStrNum(num);
		tea.setStrPosition(position);
		tea.setStrEducation(education);
		tea.setfSalary(Salary);
		Tea.add(tea);
		System.out.println("Creating Successful! ");
		System.out.println();
	}
	public  void CreateAdstaff(String name,int age,String num,String position,float Salary)
	{
		Ad_staff adstaff =new Ad_staff();
		adstaff.setStrName(name);
		adstaff.setiAge(age);
		adstaff.setStrNum(num);
		adstaff.setStrPosition(position);
		adstaff.setfSalary(Salary);
		Ads.add(adstaff);
		System.out.println("Creating Successful! ");
		System.out.println();
		
	}
	public  void CreateStaff(String name,int age,String num,String positon,float Salary)
	{
		Staff sta = new Staff();
		sta.setStrName(name);
		sta.setiAge(age);
		sta.setStrNum(num);
		sta.setStrPosition(positon);
		sta.setfSalary(Salary);
		Sta.add(sta);
		System.out.println("Creating Successful! ");
		System.out.println();
		
	}
	public  void CreateAdministrator(String name,int age,String num,String key)
	{
		Administrator AD = new Administrator();
		AD.setiAge(age);
		AD.setStrKey(key);
		AD.setStrName(name);
		AD.setStrNum(num);
		Adt.add(AD);
		System.out.println("Creating Successful! ");
		System.out.println();
	}
	public  boolean  IsAdministartor(String num,String key)
	{
		boolean flag = false;
		for(int i=0; i<Adt.size();i++)
		{
			Administrator temp = Adt.get(i);
			if(temp.getStrKey().equals(key)&&temp.getStrNum().equals(num))
			{
				flag = true ;
				break;
			}
				
		}
		return flag;
	}
	
	public  void administration()
	{	
		int flag = 0;
		while(true)
		{
		System.out.println("1.Create Stutent's information");
		System.out.println("2.Create Teacher's information");
		System.out.println("3.Create Ad_Staff's information");
		System.out.println("4.Create Staff's information");
		System.out.println("5.Create Administrator's information");
		System.out.println("0.Stop Creating");
		System.out.println("please input your choice:");
		Scanner sc = new Scanner(System.in);
		Scanner in = new Scanner(System.in);
		int choice = sc.nextInt();
		switch(choice)
		{
		case 1:{
			System.out.print("please input name:");
			String name = in.nextLine();
			System.out.println();
			System.out.print("please input age:");
			int  age = sc.nextInt();
			System.out.println();
			System.out.print("please input num:");
			String num = in.nextLine();
			System.out.println();
			System.out.print("please input class:");
			String Class = in.nextLine();
			System.out.println();
			System.out.print("please input grade:");
			String grade = in.nextLine();
			System.out.println();
			System.out.print("please input major:");
			String major = in.nextLine();
			CreateStu(name, age, grade, major, num, Class);
			
		};break;
		case 2:{
			System.out.print("please input name:");
			String name = in.nextLine();
			System.out.println();
			System.out.print("please input age:");
			int age = sc.nextInt();
			System.out.println();
			System.out.print("please input num:");
			String num = in.nextLine();
			System.out.println();
			System.out.print("please input position:");
			String pos = in.nextLine();
			System.out.println();
			System.out.print("please input education:");
			String edu = in.nextLine();
			System.out.println();
			System.out.print("please input salary:");
			float sary = in.nextFloat();
			CreateTea(name, age, num,pos, edu, sary);
			
		};break;
		case 3:{
			System.out.print("please input name:");
			String name = in.nextLine();
			System.out.println();
			System.out.print("please input age:");
			int age = sc.nextInt();
			System.out.println();
			System.out.print("please input num:");
			String num = in.nextLine();
			System.out.println();
			System.out.print("please input position:");
			String pos = in.nextLine();
			System.out.println();
			System.out.print("please input salary:");
			float sary = in.nextFloat();
			System.out.println();
			CreateAdstaff(name, age, num,pos, sary);
		};break;
		case 4:{
			System.out.print("please input name:");
			String name = in.nextLine();
			System.out.println();
			System.out.println("please input age:");
			int age = sc.nextInt();
			System.out.println();
			System.out.print("please input num:");
			String num = in.nextLine();
			System.out.println();
			System.out.print("please input position:");
			String pos = in.nextLine();
			System.out.println();
			System.out.print("please input salary:");
			float sary = in.nextFloat();
			CreateStaff(name, age, num,pos, sary);
			
			
		};break;
		case 5:{
			System.out.print("please input name:");
			String name = in.nextLine();
			System.out.println();
			System.out.print("please input age:");
			int age = sc.nextInt();
			System.out.println();
			System.out.print("please input num:");
			String num = in.nextLine();		
			System.out.println();
			System.out.print("please input key:");
			String key = in.nextLine();
			System.out.println();
			CreateAdministrator(name, age, num, key);
			
		};break;
		case 0: flag=1;break;
		default:System.out.println("invalid choice");
			
		}
		if(flag==1)
			break;
		}
	}
	public  void printStu()
	{
		if(Stu.isEmpty())
			return;
		else 
		{
			System.out.println("All Students' Information:");
			for(int i=0;i<Stu.size();i++)
			{
				Student temp = Stu.get(i);
				System.out.println("name   age   num   class   grade   major   ");
				System.out.println(temp.getStrName()+"   "+temp.getiAge() + "   " + temp.getStrNum()
				+"   " + temp.getStrClass()+ "   "+ temp.getStrGrade()+ "   "+temp.getStrMajor());
			}
		}
	}
	
	public  void printTea()
	{
		if(Tea.isEmpty())
			return;
		else
		{
			System.out.println("All Teachers' Information:");
			for(int i=0;i<Tea.size();i++)
			{
				Teacher temp = Tea.get(i);
				System.out.println("name   age   position   education   salary   ");
				System.out.println(temp.getStrName()+"   "+temp.getiAge() + "   " + temp.getStrPosition()
				+"   " + temp.getStrEducation()+ "   "+ temp.getfSalary());
			}
		}
	}
	
	public  void printAd_staff()
	{
		if(Ads.isEmpty())
			return;
		else
		{
			System.out.println("All Ad_staffs' Information:");
			for(int i=0;i<Ads.size();i++)
			{
				Ad_staff temp = Ads.get(i);
				System.out.println("name   age   position   salary   ");
				System.out.println(temp.getStrName()+"   "+temp.getiAge() + "   " + temp.getStrPosition()
				+"   " + temp.getfSalary());
			
			}
		}
	}
	public  void printStaff()
	{
		if(Sta.isEmpty())
			return ;
		else
		{
			System.out.println("All Staffs' Information:");
			for(int i=0;i<Sta.size();i++)
			{
				Staff temp = Sta.get(i);
				System.out.println("name   age   position   salary   ");
				System.out.println(temp.getStrName()+"   "+temp.getiAge() + "   " + temp.getStrPosition()
				+"   " + temp.getfSalary());
			}
		}
	}
	public  void printAdministrator()
	{
		if(Adt.isEmpty())
			System.out.println("There is no Administrator");
		else
		{
			System.out.println("All Administrator' Information:");
			for(int i=0;i<Adt.size();i++)
			{
				Administrator temp = Adt.get(i);
				System.out.println("name   age   num   key   ");
				System.out.println(temp.getStrName()+"   "+temp.getiAge() + "   " + temp.getStrNum()
				+"   " + temp.getStrKey());
			}
		}
	}
	public  void print()
	{
		boolean flag =false;
		while(!flag)
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("please enter your print choice:");
			System.out.println("1.Print All Students' Information");
			System.out.println("2.Print All Teachers' Information");
			System.out.println("3.Print All Ad_Staffs' Information");
			System.out.println("4.Print All Staffs' Information");
			System.out.println("5.Print All Administrators' Information");
			System.out.println("0.exit");
			int choice = sc.nextInt();
			switch(choice)
			{
			case 1:printStu();break;
			case 2:printTea();break;
			case 3:printAd_staff();break;
			case 4:printStaff();break;
			case 5:printAdministrator();break;
			case 0:flag=true;break;
			default: System.out.println("invalid choice");
			}
			if(flag)
				break;
		}
	}
	
	public  void DeleteStu(String StrNum)
	{
		int i;
		for( i = 0;i<Stu.size();i++)
		{
			
			Student temp = Stu.get(i);
			if(temp.getStrNum().equals(StrNum))
			{
				Stu.remove(i);
				break;
			}
		}
		if(i==Stu.size())
			System.out.println("Not Found !");
	}
	public  void DeleteTea(String StrNum)
	{
		int i;
		for( i = 0;i<Tea.size();i++)
		{
			
			Teacher temp = Tea.get(i);
			if(temp.getStrName().equals(StrNum))
			{
				Tea.remove(i);
				break;
			}
		}
		if(i==Tea.size())
			System.out.println("Not Found !");
	}
	public  void DeleteAd_staff(String StrNum)
	{
		int i;
		for( i = 0;i<Ads.size();i++)
		{
			
			Ad_staff temp = Ads.get(i);
			if(temp.getStrName().equals(StrNum))
			{
				Ads.remove(i);
				break;
			}
		}
		if(i==Ads.size())
			System.out.println("Not Found !");
	}
	public  void DeleteStaff(String StrNum)
	{
		int i;
		for(i = 0;i<Sta.size();i++)
		{
			
			Staff temp = Sta.get(i);
			if(temp.getStrName().equals(StrNum))
			{
				Sta.remove(i);
				break;
			}
		}
		if(i==Sta.size())
			System.out.println("Not Found !");
	}
	public  void DeleteAdt(String StrNum)
	{
		int i ;
		for(i = 0;i<Adt.size();i++)
		{
			
			Administrator temp = Adt.get(i);
			if(temp.getStrName().equals(StrNum))
			{
				Adt.remove(i);
				break;
			}
		}
		if(i==Adt.size())
			System.out.println("Not Found !");
	}
	public  void ChangeStu(String StrNum)
	{
		Scanner sc = new Scanner(System.in);
		Scanner in = new Scanner(System.in);
		for(int i=0;i<Stu.size();i++)
		{
			Student temp = Stu.get(i);
			if(temp.getStrNum().equals(StrNum))
			{
				System.out.print("please input name:");
				String name = in.nextLine();
				System.out.println();
				System.out.print("please input age:");
				int  age = sc.nextInt();
				System.out.println();
				System.out.print("please input num:");
				String num = in.nextLine();
				System.out.println();
				System.out.print("please input class:");
				String Class = in.nextLine();
				System.out.println();
				System.out.print("please input grade:");
				String grade = in.nextLine();
				System.out.println();
				System.out.print("please input major:");
				String major = in.nextLine();
				temp.setStrName(name);
				temp.setiAge(age);
				temp.setStrNum(num);
				temp.setStrClass(Class);
				temp.setStrGrade(grade);
				temp.setStrMajor(major);
			}
		}
		
	}
	public  void ChangeTea(String StrNum)
	{
		Scanner sc = new Scanner(System.in);
		Scanner in = new Scanner(System.in);
		for(int i=0;i<Tea.size();i++)
		{
			Teacher temp = Tea.get(i);
			if(temp.getStrNum().equals(StrNum))
			{
				System.out.print("please input name:");
				String name = in.nextLine();
				System.out.println();
				System.out.print("please input age:");
				int  age = sc.nextInt();
				System.out.println();
				System.out.print("please input num:");
				String num = in.nextLine();
				System.out.println();
				System.out.print("please input position:");
				String position = in.nextLine();
				System.out.println();
				System.out.print("please input education:");
				String education = in.nextLine();
				System.out.println();
				System.out.print("please input salary:");
				float salary = in.nextFloat();
				temp.setStrName(name);
				temp.setiAge(age);
				temp.setStrNum(num);
				temp.setStrPosition(position);
				temp.setStrEducation(education);
				temp.setfSalary(salary);
			}
		}
		
	}
	public  void ChangeAd_staff(String StrNum)
	{
		Scanner sc = new Scanner(System.in);
		Scanner in = new Scanner(System.in);
		for(int i=0;i<Ads.size();i++)
		{
			Ad_staff temp = Ads.get(i);
			if(temp.getStrNum().equals(StrNum))
			{
				System.out.print("please input name:");
				String name = in.nextLine();
				System.out.println();
				System.out.print("please input age:");
				int  age = sc.nextInt();
				System.out.println();
				System.out.print("please input num:");
				String num = in.nextLine();
				System.out.println();
				System.out.print("please input position:");
				String position = in.nextLine();
				System.out.println();
				System.out.print("please input salary:");
				float salary = in.nextFloat();
				temp.setStrName(name);
				temp.setiAge(age);
				temp.setStrNum(num);
				temp.setStrPosition(position);
				temp.setfSalary(salary);
			}
		}
		
	}
	public  void ChangeStaff(String StrNum)
	{
		Scanner sc = new Scanner(System.in);
		Scanner in = new Scanner(System.in);
		for(int i=0;i<Sta.size();i++)
		{
			Staff temp = Sta.get(i);
			if(temp.getStrNum().equals(StrNum))
			{
				System.out.print("please input name:");
				String name = in.nextLine();
				System.out.println();
				System.out.print("please input age:");
				int  age = sc.nextInt();
				System.out.println();
				System.out.print("please input num:");
				String num = in.nextLine();
				System.out.println();
				System.out.print("please input position:");
				String position = in.nextLine();
				System.out.println();
				System.out.print("please input salary:");
				float salary = in.nextFloat();
				temp.setStrName(name);
				temp.setiAge(age);
				temp.setStrNum(num);
				temp.setStrPosition(position);
				temp.setfSalary(salary);
			}
		}
		
	}
	public  void ChangeAdt(String StrNum)
	{
		Scanner sc = new Scanner(System.in);
		Scanner in = new Scanner(System.in);
		for(int i=0;i<Adt.size();i++)
		{
			Administrator temp = Adt.get(i);
			if(temp.getStrNum().equals(StrNum))
			{
				System.out.print("please input name:");
				String name = in.nextLine();
				System.out.println();
				System.out.print("please input age:");
				int  age = sc.nextInt();
				System.out.println();
				System.out.print("please input num:");
				String num = in.nextLine();
				System.out.println();
				System.out.print("please input key:");
				String key = in.nextLine();
				System.out.println();

				temp.setStrName(name);
				temp.setiAge(age);
				temp.setStrNum(num);
				temp.setStrKey(key);
			}
		}
		
	}
}





























