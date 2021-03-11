
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book bk1 = new Book(1,"book1","isbn-1234");
		Book bk2 = new Book(2,"book2","isbn-8034");
		Book bk3 = new Book(1,"book3","isbn-2534");
		Book bk4 = new Book(4,"book4","isbn-7834");
		Reader rd1 = new Reader("Mike","2020-12-03-12:40");
		Reader rd2 = new Reader("Eric","2020-12-05-12:50");
		rd1.add(bk1);
		rd1.add(bk2);
		rd1.back("isbn-1234","2020-12-06-14:50");
		Librarian Lban = new Librarian("Jackey");
		Lban.print(rd1);
		rd2.add(bk4);
		rd2.add(bk4);
		Lban.print(rd2);
	}

}
 