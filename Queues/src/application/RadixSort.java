package application;

//********************************************************************
//  RadixSort.java       
//
//  Demonstrates the use of queues in the execution of a radix sort.
//********************************************************************

import dataStructures.*;

public class RadixSort    
{
   //-----------------------------------------------------------------
   //  Perform a radix sort on a set of numeric values.
   //-----------------------------------------------------------------
   public static void main ( String[] args)
   { 
      int[] list = {1427, 3829, 109, 2411, 6738, 8412, 555, 7328};


      String temp;
      Integer numObj;
      int digit, num;

      LinkedQueue<Integer>[] digitQueues;
      digitQueues = (LinkedQueue<Integer>[])(new LinkedQueue[10]);
      for (int digitVal = 0; digitVal <= 9; digitVal++)
         digitQueues[digitVal] = new LinkedQueue<Integer>();

      // sort the list
      for (int position=0; position <= 3; position++)
      {
         for (int scan=0; scan < list.length; scan++)
         {
            temp = String.valueOf (list[scan]);
            //The following loop checks to ensure that each number in the 
            //list has 4 digits, if not it adds zeros
				while (temp.length() < 4) {
					String temp2 = "";
					for (int i = 0; i < temp.length(); i++)
						temp2 = '0' + temp;
					temp = temp2;
				}
            digit = Character.digit (temp.charAt(3-position), 10);
            digitQueues[digit].enqueue (list[scan]);
         }
         
         // gather numbers back into list
         num = 0;
         for (int digitVal = 0; digitVal <= 9; digitVal++)
         {
            while (!(digitQueues[digitVal].isEmpty()))
            {
               numObj = (Integer) digitQueues[digitVal].dequeue();
               list[num] = numObj.intValue();
               num++;
            }
         }
      }

      // output the sorted list
      for (int scan=0; scan < list.length; scan++)
         System.out.println (list[scan]);
   }
}



