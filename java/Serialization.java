
import java.io.*;
import java.util.Hashtable;



public class Serialization 
{                   
    public void SerializationDetails(Pets p1, PrintWriter out)
    {
           try
           {               
            /* Object Serialization */   
            FileOutputStream fileout = new FileOutputStream("C:/Users/sagar/Documents/NetBeansProjects/HumaneSociety/src/java/pets.ser");
            ObjectOutputStream objout = new ObjectOutputStream(fileout);
            objout.writeObject(p1.ht);
            objout.close();
            fileout.close();
            out.println("<br>");
            out.println("Object is Serialized into File");                      
            
            /* Object Serialization Completed */
            }         
           catch(Exception exp)
           {
              out.println("Error occured in Serialization Class");         
           }
     }           
}
