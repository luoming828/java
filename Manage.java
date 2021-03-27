import java.util.LinkedList;

public class Manage {
	private LinkedList Per = new LinkedList<Person>();
	public  void CreateStu(String name,int age,String grade,String major,String num,String Class)
	{
		Student stu1 = new Student();
		stu1.setStrName(name);
		stu1.setiAge(age);
		stu1.setStrGrade(grade);
		stu1.setStrMajor(major);
		stu1.setStrNum(num);
		stu1.setStrClass(Class);
		Per.add(stu1);
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
		Per.add(tea);
		System.out.println("Creating Successful! ");
		System.out.println();
	}
	public void PrintStu()
	{
		for(int i=0;i<2;i++)
		{
			
			Student temp = (Student) Per.get(i);
			System.out.println("name:"+temp.getStrName());
			System.out.println("age:"+temp.getiAge());
			System.out.println("num:"+temp.getStrNum());
			System.out.println("class:"+temp.getStrClass());
			System.out.println("grade:"+temp.getStrGrade());
			System.out.println("major:"+temp.getStrMajor());
			System.out.println();
			
			
		}
	}
	
	public void PrintTea()
	{
		for(int i=2;i<4;i++)
		{
			Teacher temp = (Teacher)Per.get(i);
			System.out.println("name:"+temp.getStrName());
			System.out.println("age:"+temp.getiAge());
			System.out.println("num:"+temp.getStrNum());
			System.out.println("position:"+temp.getStrPosition());
			System.out.println("education:"+temp.getStrEducation());
			System.out.println("salary:"+temp.getfSalary());
			System.out.println();
		}
	}
	public void PrintPerSize()
	{
		 System.out.println(Per.size());
	}
	
	
	
}
