package dataStructures;

//********************************************************************
//  LinkedQueue.java     
//
//  Represents a linked implementation of a queue.
//********************************************************************

 


public class LinkedQueue<T> implements QueueADT<T>
{
   private int count;
   private LinearNode<T> front, rear;

   //-----------------------------------------------------------------
   //  Creates an empty queue.
   //-----------------------------------------------------------------
   public LinkedQueue()
   {
      count = 0;
      front = rear = null;
   }

   //-----------------------------------------------------------------
   //  Adds the specified element to the rear of the queue.
   //-----------------------------------------------------------------
   public void enqueue (T element)
   {
      LinearNode<T> node = new LinearNode<T>(element);

      if (isEmpty())
         front = node;
      else
         rear.setNext (node);

      rear = node;
      count++;
   }

   //-----------------------------------------------------------------
   //  Removes the element at the front of the queue and returns a
   //  reference to it. 
   //-----------------------------------------------------------------
   public T dequeue() 
   {
       if (isEmpty())
      {
    	  System.out.println("Queue is empty");
          return null;
         }
     else
     {
      T result = front.getElement();
      front = front.getNext();
      count--;

      if (isEmpty())
         rear = null;

      return result;
    }
   }
   
   //-----------------------------------------------------------------
   //  Returns a reference to the element at the front of the queue.
   //  The element is not removed from the queue.    
   //-----------------------------------------------------------------
   public T first() 
   {
       if (isEmpty())
      {
    	  System.out.println("Queue is empty");
          return null;
         }
      else
      {
         return front.getElement();
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
   //  Returns a string representation of this queue. - Commenting this
   // out as it technically we should not be able to access every element 
   //of a queue
   //-----------------------------------------------------------------
 /*  public String toString()
   {
      String result = "";
      LinearNode<T> current = front;

      while (current != null)
      {
         result = result + (current.getElement()).toString() + "\n";
         current = current.getNext();
      }

      return result;
   } */
}

