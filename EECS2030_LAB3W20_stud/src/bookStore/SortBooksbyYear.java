package bookStore;

public class SortBooksbyYear implements java.util.Comparator<Book> {

	@Override
	public int compare(Book o1, Book o2) {
		// TODO Auto-generated method stub
		// return 0;

		// if(o1.getYearPublished()

		return o1.getYearPublished() - o2.getYearPublished();

	}

}
