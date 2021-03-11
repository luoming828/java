import java.util.ArrayList;
public class Reader {
	String strName;
	String strTime;
	BookList bl;
	public Reader(String name,String time)// Ãû×Ö Ê±¼ä
	{
		strName = name;
		strTime = time;
		this.bl = new BookList();
		
	}
	public void add(Book bk)
	{
		this.bl.add(bk);
	}
	public void back(String number,String time)
	{
		this.bl.back(number,time);
		System.out.println(" by " + strName);
	}
}
