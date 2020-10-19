package generics;


//SET OF FUNCTIONS THAT ANY IMPLEMENTATION OF ARRAYLIST MUST SUPPORT

public interface ArrayListADT<T> {

	
	 //-----------------------------------------------------------------
	   //  Creates an empty ArrayList using the default capacity.
	   //-----------------------------------------------------------------
	  // public ArrayList();
	   
	   //-----------------------------------------------------------------
	   //  Creates an empty ArrayList using the specified capacity.
	   //-----------------------------------------------------------------
	 //  public ArrayList (int initialCapacity);
	   

	   //-----------------------------------------------------------------
	   //  Adds the specified element to the next available slot in the array
	   //-----------------------------------------------------------------
	   public void add (T element);
	   

	//-----------------------------------------------------------------
	   //  Adds the specified element to position index if is is empty
	   //-----------------------------------------------------------------
	   public void add (T element, int index);


	 //-----------------------------------------------------------------
	   //  Removes the last element added to the array. 
	   //-----------------------------------------------------------------
	   public T remove();
	   
	   //-----------------------------------------------------------------
	   //  Removes the element in position index
	   //-----------------------------------------------------------------
	   public T remove(int index);
	   
            //-----------------------------------------------------------------
	   //  Search for and remove the element 
	   //-----------------------------------------------------------------
	   public T remove(T element);


	   //-----------------------------------------------------------------
	   //  Returns true if the array is empty and false otherwise. 
	   //-----------------------------------------------------------------
	   public boolean isEmpty();
	   

	   //-----------------------------------------------------------------
	   //  Returns the number of elements in the array.
	   //-----------------------------------------------------------------
	   public int size();
	   
	   //-----------------------------------------------------------------
	   //  Returns a string representation of the entire array. 
	   //-----------------------------------------------------------------
	   public String toString();
	   
}
