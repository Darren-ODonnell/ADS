//********************************************************************
//  Contact.java       
//
//  Represents a phone contact.
//********************************************************************

public class Contact implements Comparable<Contact>
{
   private String firstName, lastName, phone;

   //-----------------------------------------------------------------
   //  Sets up this contact with the specified information.
   //-----------------------------------------------------------------
   public Contact (String first, String last, String telephone)
   {
      firstName = first;
      lastName = last;
      phone = telephone;
   }

   //-----------------------------------------------------------------
   //  Returns a description of this contact as a string.
   //-----------------------------------------------------------------
   public String toString ()
   {
      return lastName + ", " + firstName + "\t" + phone;
   }

   //-----------------------------------------------------------------
   //  Uses both last and first names to determine lexical ordering.
   //-----------------------------------------------------------------
   public int compareTo (Contact other)
   {
      int result;

      if (lastName.equals(other.lastName))
         result = firstName.compareTo(other.firstName);
      else
         result = lastName.compareTo(other.lastName);

      return result;
   }
}


