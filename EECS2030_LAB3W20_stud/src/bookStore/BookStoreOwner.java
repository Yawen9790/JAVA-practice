package bookStore;

import java.util.Objects;

public class BookStoreOwner {

	private long id;
	private String name;

	BookStoreOwner(String name) {
		this.name = name;
		this.id = this.hashCode();
	}

	public long getID() {
		return this.id;
	}

	public String getName() {
		return this.name;
	}

	public int hashCode() {
		return Objects.hash(this.name);
	}

	public boolean equals(Object obj) {
		// if(obj instanceof Book) {
		// if (obj != null && obj == this) {
		if (obj instanceof BookStoreOwner) {
			BookStoreOwner other = (BookStoreOwner) obj;
			if (this.getID() == other.getID()) {
				return true;
			}
			return false;
		}
		return false;
	}

	public String toString() {
		return "Name: " + this.getName() + "; ID: " + this.getID();
	}

}
