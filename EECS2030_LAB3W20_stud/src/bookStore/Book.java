package bookStore;

import java.util.Objects;

public class Book implements java.lang.Comparable<Book> {

	@Override
	public int compareTo(Book o) {
		// TODO Auto-generated method stub
		// return 0;
		if (this.getPrice() > o.getPrice()) {
			return 1;
		} else if (this.getPrice() < o.getPrice()) {
			return -1;
		} else {
			return 0;
		}
	}

	private double price;
	private String title;
	private int year;

	public Book() {
		this.title = null;
		this.year = 0;
		this.price = 0;
	}

	public Book(String title, int year, double price) {
		this.title = title;
		this.year = year;
		this.price = price;
	}

	public double getPrice() {
		return this.price;
	}

	public String getTitle() {
		return this.title;
	}

	public int getYearPublished() {
		return this.year;
	}

	public Book(Book book) {
		this(book.getTitle(), book.getYearPublished(), book.getPrice());
	}

	public int hashCode() {
		return Objects.hash(this.getTitle(), this.getYearPublished(), this.getPrice());
	}

	public String toString() {
		return "Title: " + this.getTitle() + "; Year: " + this.getYearPublished() + "; Hash: " + this.hashCode()
				+ "; Price: " + this.getPrice();
	}

	public boolean equals(Object obj) {
		if (obj instanceof Book) {
			Book other = (Book) obj;// Incompatible operand types ??
			if (this.hashCode() == other.hashCode() && this.getPrice() == other.getPrice()) {
				return true;
			}
			return false;
		}
		return false;
	}

//	public boolean contains(Book book) {
//		// TODO Auto-generated method stub
//		return books;
//	}

}
