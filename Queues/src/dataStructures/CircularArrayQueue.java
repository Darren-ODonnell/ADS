//********************************************************************
//  CircularArrayQueue.java      
//
//  Represents an array implementation of a queue in which the
//  indexes for the front and rear of the queue circle back to 0
//  when they reach the end of the array.
//
// Note that you will have to add code to the specified methods
// before this class can be used.
//********************************************************************

package dataStructures;

 

public class CircularArrayQueue<T> implements QueueADT<T>
{
   private final int DEFAULT_CAPACITY = 100;
   private int front, rear, count;
   private T[] queue; 

   //-----------------------------------------------------------------
   //  Creates an empty queue using the default capacity.
   //-----------------------------------------------------------------
   public CircularArrayQueue()
   {
      front = rear = count = 0;
      queue = (T[]) (new Object[DEFAULT_CAPACITY]);
   }

   //-----------------------------------------------------------------
   //  Creates an empty queue using the specified capacity.
   //-----------------------------------------------------------------
   public CircularArrayQueue (int initialCapacity)
   {
      front = rear = count = 0;
      queue = (T[])(new Object[initialCapacity]);
   }

   //-----------------------------------------------------------------
   //  Adds the specified element to the rear of the queue, expanding
   //  the capacity of the queue array if necessary.
   //-----------------------------------------------------------------
   public void enqueue (T element)
   {
      // ADD CODE HERE
    // 1. if the number of elements in the queue is equal to
    // queue.length then expand the capacity
       if(size() >= queue.length){
           expandCapacity();
       }


	// 2. add element to rear position then update the value of rear by one 
    // ensuring that rear can loop back to position 0 if that is the next free
	// slot - see circular queue notes
       queue[rear] = element;
       rear ++;
	   
	//3. Increment the count variable
       count++;
   }

   //-----------------------------------------------------------------
   //  Removes the element at the front of the queue and returns a
   //  reference to it.
   //-----------------------------------------------------------------
   public T dequeue() 
   {
   	   T result = null;
   	   
        // ADD CODE here
   	   
   	   //1.  if the queue is empty, display message
       if(queue.length == 0){
           System.out.println("Empty Queue, nothing to dequeue");
       }else{
           // else
           //2. Let the result be equal to the element at the front of the queue
           //3. Set this front element to null
           //4. add 1 to front ensuring that front can loop back to position 0.
           //5. Decrement the count variable.
           result  = queue[front];
           queue[front] = null;
           front ++;
           count --;

       }


      return result;
   }
   
   //-----------------------------------------------------------------
   //  Returns a reference to the element at the front of the queue.
   //  The element is not removed from the queue. 
   //-----------------------------------------------------------------
   public T first() 
   {
	   if (isEmpty())
	      {
	          System.out.println("Empty queue");
	          return null;
		   }
		   else
		   {

	         return queue[front];
		   }
   }

   //-----------------------------------------------------------------
   //  Returns true if this queue is empty and false otherwise. 
   //-----------------------------------------------------------------
   public boolean isEmpty()
   {
      return (count == 0);
   }
 
   //-----------------------------------------------------------------
   //  Returns the number of elements currently in this queue.
   //-----------------------------------------------------------------
   public int size()
   {
      return count;
   }


   //-----------------------------------------------------------------
   //  Returns a string representation of this queue. 
   //-----------------------------------------------------------------
  public String toString()
  {
    String result = "";
    	int scan = front;
    
    while (scan < rear) {
    	// 	ADD CODE HERE
    }
    
    return result;

  }

   //-----------------------------------------------------------------
   //  Creates a new array to store the contents of the queue with
   //  twice the capacity of the old one.
   //-----------------------------------------------------------------
  private void expandCapacity()
  {
    T[] larger = (T[])(new Object[queue.length *2]);   

    for(int scan=0; scan < count; scan++)
    {
      larger[scan] = queue[front];
      front=(front+1) % queue.length;
    }

    front = 0;
    rear = count;
    queue = larger;
  }
}

