
import java.io.*;
import java.util.Enumeration;
import java.util.Hashtable;


public class DeSerialization 
{
    Pets p1 = new Pets();
    public Hashtable DeSerializationDetails(PrintWriter out)
    {               
        try
        {
        /* Object DeSerialization */                        
            FileInputStream filein = new FileInputStream("C:/Users/sagar/Documents/NetBeansProjects/HumaneSociety/src/java/pets.ser");
            ObjectInputStream objin = new ObjectInputStream(filein);
            p1.ht= (Hashtable)objin.readObject();
            objin.close();
            filein.close();                        
            
            String str=null;
            Enumeration names=p1.ht.keys();
            while(names.hasMoreElements())
            {
            str = (String) names.nextElement();
            //out.println("<br>");   
            //out.println("The petname and pettype deserialized from file are : ");
            //out.println("<br>");
            //out.println(str + " : " + p1.ht.get(str));                        
            }                        
            /* Object DeSerialization Completed */
       }
       catch(Exception e)
       {
         out.println("Error Occured in the DeSerialization Class");
       }        
        return p1.ht;
    }              
}
