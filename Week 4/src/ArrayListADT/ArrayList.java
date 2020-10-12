//********************************************************************
//  ArrayList.java     
//
//  This is my very pared-down and simplified version of an ArrayList definition.
//********************************************************************

package ArrayListADT;

public class ArrayList<T> implements ArrayListADT<T> {
	private final int DEFAULT_CAPACITY = 100;
	private int open; // indicates the next open slot
	private int capacity;
	private T[] array;
	

	// -----------------------------------------------------------------
	// Creates an empty ArrayList using the default capacity.
	// -----------------------------------------------------------------
	public ArrayList() {
		this.capacity = DEFAULT_CAPACITY;
		this.open = 0;
		this.array = (T[]) (new Object[DEFAULT_CAPACITY]);
		
	}

	// -----------------------------------------------------------------
	// Creates an empty ArrayList using the specified capacity.
	// -----------------------------------------------------------------
	public ArrayList(int initialCapacity) {
		this.capacity = initialCapacity;
		this.open = 0;
		this.array = (T[]) (new Object[initialCapacity]);
		
	}

	// -----------------------------------------------------------------
	// Adds the specified element to the next available slot in the array
	// -----------------------------------------------------------------
	public void add(T element) {
		//if (this.open == this.capacity )
		//extendCapacity();
		array[open] = element;
		open++;
	}

	//HELPER METHOD - function is to discreetly double the size of the 
	//underlying array if more space is required
	private void extendCapacity()
	{
		T[] tempArray;
		tempArray = (T[]) (new Object[this.capacity * 2]);
		for (int i=0; i<this.capacity; i++)
			tempArray[i] = array[i];
		
		array = tempArray;
	}
	
	public void add(T element, int index) {

		// ADD CODE
	}

	// -----------------------------------------------------------------
	// Removes the last element added to the array.
	// -----------------------------------------------------------------
	public T remove() {
		if (isEmpty())
			System.out.println("The list is empty");

		open--;
		T result = array[open];
		array[open] = null;

		return result;
	}

	// -----------------------------------------------------------------
	// Removes the element in position index
	// -----------------------------------------------------------------
	public T remove(int index) {
		T answer = null;

		// ADD CODE

		return answer;
	}

	// -----------------------------------------------------------------
	// Search for and remove the element
	// -----------------------------------------------------------------
	public T remove(T element) {
		T answer = null;

		// ADD CODE

		return answer;

	}

	// -----------------------------------------------------------------
	// Returns true if the array is empty and false otherwise.
	// -----------------------------------------------------------------
	public boolean isEmpty() {

		return (open == 0);
	}

	// -----------------------------------------------------------------
	// Returns the number of elements in the array.
	// -----------------------------------------------------------------
	public int size() {
		return open;
	}

	// -----------------------------------------------------------------
	// Returns a string representation of the entire array.
	// -----------------------------------------------------------------
	public String toString() {
		String result = "";

		for (int scan = 0; scan < open; scan++)
			result = result + array[scan].toString() + "\n";

		return result;
	}

}
