//********************************************************************
//  SortPhoneList.java       
//
//  Driver for testing an object selection sort.
//********************************************************************


public class SortPhoneList
{
   //-----------------------------------------------------------------
   //  Creates an array of Contact objects, sorts them, then prints
   //  them.
   //-----------------------------------------------------------------
   public static void main (String[] args)
   {
      Contact[] friends = new Contact[7];

      friends[0] = new Contact ("John", "Smith", "086-123456");
      friends[1] = new Contact ("Sarah", "Barnes", "01-4353533");
      friends[2] = new Contact ("Mark", "Riley", "0405-39574");
      friends[3] = new Contact ("Laura", "Grace", "062-54644");
      friends[4] = new Contact ("Larry", "Smith", "087-3948573");
      friends[5] = new Contact ("Frank", "Higgins", "01-9384756");
      friends[6] = new Contact ("Marsha", "Grant", "01-9383743");

      Sorting temp = new Sorting();
      temp.insertionSort(friends);

      for (int index = 0; index < friends.length; index++)
         System.out.println (friends[index]);
   }
}


