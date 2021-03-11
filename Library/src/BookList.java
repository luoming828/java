import java.util.ArrayList;
import java.util.List;

public class BookList {
	List<Book> bcount; 
	public BookList () 
	{
		this.bcount=new ArrayList<Book>();
		
	}
	public void add(Book bk)
	{
		this.bcount.add(bk);
	}
	public void back(String number,String time)
	{
		int i;
		for( i=0 ; i<bcount.size(); i++)
		{
			Book temp = bcount.get(i);
			if(temp.strNumber==number)
			{
				this.bcount.remove(i);
				System.out.print("The " + temp.strName + " which number is "
				+ temp.strNumber+" is back on " + time  ); 
				break;
			}
			
		}
		if(i==bcount.size())
		{
			System.out.println("There is no book to back");
		}
			
		
	}
	public int BookCounts()
	{
		int counts=0;
		for(int i = 0; i<bcount.size(); i++)
		{
			Book temp = bcount.get(i);
			counts += temp.iCount;
		}
		return counts;
	}
}





















