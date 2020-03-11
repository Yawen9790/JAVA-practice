package myUtil;

public class MyArrayList<E> implements MyList<E> {

	private static final int DEFAULT_CAPACITY = 10;
	
	int size;  // non-private for testing purpose
	E [] elementData; // non-private for testing purpose
	
	/**
	 * Create an empty list of capacity capa
	 * 
	 * @param capa the initial capacity. Assume greater than 0.
	 */
	@SuppressWarnings({"unchecked"})
    public MyArrayList(int capa) {
		this.elementData = (E[])new Object [capa];
	}

	/**
	 * Create an empty list of default capacity
	 * 
	 */
    @SuppressWarnings({"unchecked"})
    public MyArrayList() {
		this.elementData = (E[])new Object [DEFAULT_CAPACITY];
	}

}
