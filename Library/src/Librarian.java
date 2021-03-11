
public class Librarian {
	String strName;
	public  Librarian (String name)
	{
		strName = name;
	}
	
	public void print(Reader rd)
	{
		System.out.println("the book " + rd.strName + " borrowed:");
		for(int i=0; i<rd.bl.bcount.size(); i++)
		{
			Book temp;
			temp = rd.bl.bcount.get(i);
			System.out.println("name: " + temp.strName + " " + "time: " + rd.strTime
					+ " counts: " + temp.iCount);
			
		}
		System.out.println("total counts: " + rd.bl.BookCounts());
	}
}