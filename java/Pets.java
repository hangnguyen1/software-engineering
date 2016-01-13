import java.io.*;
import java .util.*;

public class Pets implements Serializable 
{
   public String petname; 
   public String pettype;
   public String breed;
   public String color;
   public String size;
   public String sex;
   
   Hashtable ht = new Hashtable();
   
   //Hashtable ht = new Hashtable();
   
   public void hashtable(String petname, String pettype)
   {
     ht.put(petname, pettype);     
   }               
   
}
