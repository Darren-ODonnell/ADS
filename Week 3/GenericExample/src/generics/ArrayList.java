//********************************************************************

//
//  This is my very pared-down and simplified version of an ArrayList definition.
//
// It is repsonsible for providing code to the list of methods outlined in
// the ADT definition
//********************************************************************

package generics;

public class ArrayList<T> 
{
   private final int DEFAULT_CAPACITY = 100;
   private int open;  // indicates the next open slot
   private int capacity;
   private T[] array; 
   private int count;
  

   //-----------------------------------------------------------------
   //  Creates an empty ArrayList using the default capacity.
   //-----------------------------------------------------------------
   public ArrayList()
   {
	  this.capacity = DEFAULT_CAPACITY;
      open = 0;
      array = (T[])(new Object[DEFAULT_CAPACITY]);
      
      //Assigning null to slots in array
      for(int i =0; i< capacity; i++){
    	  array[i] = null;
      }
   }

   //-----------------------------------------------------------------
   //  Creates an empty ArrayList using the specified capacity.
   //-----------------------------------------------------------------
   public ArrayList(int initialCapacity)
   {
	  capacity = initialCapacity;
      open = 0;
      array = (T[])(new Object[initialCapacity]);
      count =0;
      
    //Assigning null to slots in array
      for(int i =0; i< capacity; i++){
    	  array[i] = null;
      }
   }

   //-----------------------------------------------------------------
   //  Adds the specified element to the next available slot in the array
   //-----------------------------------------------------------------
   public void add (T element)
   {
	  if (size() == array.length )
	  	  extendCapacity();
	  
	  array[open] = element;
      open++;
   }
   
   public void add (T element, int index){
	   
   }
   
   
	  //-----------------------------------------------------------------
   //  Removes the last element added to the array. 
   //-----------------------------------------------------------------
   public T remove()
   {
      if (isEmpty())
        System.out.println("The list is empty");


      T result = array[open];
      array[open] = null; 
      open--;
 
      return result;
   }
   
   // -----------------------------------------------------------------
	// Search for and remove the element
	// -----------------------------------------------------------------
	public T remove(T element) {
		T answer = null;
		int index;

		for(int i = 0; i < this.capacity; i++){
			if(array[i].equals(element)){
				answer = array[i];
				index = i;
				array[i] = null;
				
				for(int num = index + 1; num<this.capacity; num++){
					//i is the object being removed, index is the one following it
					if(array[index] != null){
						array[num] = array[index];
					}
				}

			}else return null;
		}		
		
		return answer;

	}
	
	// -----------------------------------------------------------------
		// Remove element by index
		// -----------------------------------------------------------------
	
	public T remove(int index) {
		
		while(index > this.capacity){
			System.out.println("Index out of range");
		}
		if(array[index] != null){
			T answer = array[index];
			array[index] = null;
			
			for(int i = index + 1; i<this.capacity; i++){
				//i is the object being removed, index is the one following it
				if(array[index] != null){
					array[i] = array[index];
				}
			}
			
			return answer;
		}else{
			return null;
		}
		

	}
   
 
   //-----------------------------------------------------------------
   //  Returns true if the array is empty and false otherwise. 
   //-----------------------------------------------------------------
   public boolean isEmpty()
   {
	   
	return (open == 0);
   }
 
   //-----------------------------------------------------------------
   //  Returns the number of elements in the array.
   //-----------------------------------------------------------------
   public int size()
   {
	return this.open;
   }

 

   
   //-----------------------------------------------------------------
   //  Returns a string representation of the entire array. 
   //-----------------------------------------------------------------
   public String toString()
   {
      String result = "";

      for (int scan=0; scan < open; scan++) 
    	  if(array[scan] != null){
    		  result = result + array[scan].toString() + "\n";
    	  }
      return result;
   }
   
   
 //HELPER METHOD - function is to discreetly double the size of the 
 	//underlying array if more space is required
 	@SuppressWarnings("unchecked")
	private void extendCapacity()
 	{
 		T[] tempArray;
 		tempArray = (T[]) (new Object[this.capacity * 2]);
 		for (int i=0; i<this.capacity; i++)
 			tempArray[i] = array[i];
 		
 		this.array = tempArray;
 		this.capacity = this.capacity * 2;
 	}

}
