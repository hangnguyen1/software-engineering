

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.ArrayList;


public class Servlet1 extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();   
        ArrayList<Pets> arraylist = new ArrayList<Pets>();        
        try {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet1</title>");            
            out.println("</head>");
            out.println("<body>");                                                           
            
            out.println(" <TABLE align=\"center\">\n" +
"<TR>\n" +
"<TD>\n" +
"<IMG SRC=\"Dog.jpg\" alt=\"\" WIDTH=\"300\" HEIGHT=\"200\">    \n" +
"</TD>\n" +
"<TD>\n" +
"<IMG SRC=\"HumaneSocietySystem.gif\" alt=\"\" WIDTH=\"300\" HEIGHT=\"200\">\n" +
"</TD>\n" +
"<TD>\n" +
"<IMG SRC=\"Cat.jpg\" alt=\"\" WIDTH=\"300\" HEIGHT=\"200\">\n" +
"</TD>\n" +
"</TR>\n" +
"</TABLE>");
            
            out.println(" <TABLE align=\"center\">      \n" +
"   <TR>\n" +
"   <TD ALIGN=\"LEFT\" WIDTH=\"50\"><A HREF=\"AdoptPet.html\"><IMG SRC=\"http://www.lostmydoggie.com/graphics/menu-home3.gif\" WIDTH=\"50\" HEIGHT=\"37\" BORDER=0 ALT=\"Lost My Dog Homepage\" TITLE=\"Humane Society Homepage\"></A></TD>\n" +
"   <TD ALIGN=\"LEFT\" WIDTH=\"118\"><A HREF=\"GivePet.html\"><IMG SRC=\"http://www.lostmydoggie.com/graphics/menu-get-started.gif\" WIDTH=\"118\" HEIGHT=\"37\" BORDER=0 ALT=\"Lost Dog or Cat Pricing\" TITLE=\"Humane Society Pet Package Pricing\"></A></TD>\n" +
"   <TD ALIGN=\"LEFT\" WIDTH=\"98\"><A HREF=\"LostPet.html\"><IMG SRC=\"http://www.lostmydoggie.com/graphics/menu-lost-pets.gif\" WIDTH=\"98\" HEIGHT=\"37\" BORDER=0 ALT=\"Missing Dog Locator\" TITLE=\"Missing Dog or Cat Locator\"></A></TD>\n" +
"   <TD ALIGN=\"LEFT\" WIDTH=\"111\"><A HREF=\"FoundPet.html\"><IMG SRC=\"http://www.lostmydoggie.com/graphics/menu-found-pets.gif\" WIDTH=\"111\" HEIGHT=\"37\" BORDER=0 ALT=\"Found Dog Locator\" TITLE=\"Found Dog or Cat Locator\"></A></TD>\n" +
"   <TD ALIGN=\"LEFT\" WIDTH=\"80\"><A HREF=\"\"><IMG SRC=\"http://www.lostmydoggie.com/graphics/menu-groups2.gif\" WIDTH=\"80\" HEIGHT=\"37\" BORDER=0 ALT=\"Lost My Dog Groups\" TITLE=\"Humane Society Group Forums\"></A></TD>\n" +
"   <TD ALIGN=\"LEFT\" WIDTH=\"130\"><A HREF=\"LostPetTips.html\"><IMG SRC=\"http://www.lostmydoggie.com/graphics/menu-tips.gif\" WIDTH=\"130\" HEIGHT=\"37\" BORDER=0 ALT=\"Lost Dog Recovery Tips\" TITLE=\"Tips For Finding your Lost Dog or Cat\"></A></TD>\n" +
"   <TD ALIGN=\"LEFT\" WIDTH=\"53\"><A HREF=\"FAQ.html\"><IMG SRC=\"http://www.lostmydoggie.com/graphics/menu-faq2.gif\" WIDTH=\"53\" HEIGHT=\"37\" BORDER=0 ALT=\"Lost My Dog FAQ\" TITLE=\"Lost My Doggie Frequently Asked Questions\"></A></TD>\n" +
"   <TD ALIGN=\"LEFT\" WIDTH=\"126\"><A HREF=\"YourStories.html\"><IMG SRC=\"http://www.lostmydoggie.com/graphics/menu-stories2.gif\" WIDTH=\"126\" HEIGHT=\"37\" BORDER=0 ALT=\"Read About Found Dogs & Pets\" TITLE=\"Stories About Found Dogs & Pets\"></A></TD>\n" +
"   <TD ALIGN=\"LEFT\" WIDTH=\"184\"><A HREF=\"\"><IMG SRC=\"http://www.lostmydoggie.com/graphics/menu-shelter-program.gif\" WIDTH=\"184\" HEIGHT=\"37\" BORDER=0 ALT=\"Referral Program\" TITLE=\"Our Referral Program\"></A></TD>\n" +
"   </TR>\n" +
"</TABLE>");
            
            String PetName = request.getParameter("petname");                        
            String pettype = request.getParameter("pettype");
            String breed = request.getParameter("breed");
            String color = request.getParameter("color");
            String size = request.getParameter("size");
            String sex = request.getParameter("sex");
            
            Pets pets = new Pets();
            pets.petname=PetName;
            pets.pettype=pettype;
            pets.breed=breed;
            pets.color=color;
            pets.size=size;
            pets.sex=sex;
                        
            out.println(" <TABLE align=\"center\"><TR><TD><h1>You have successfully gave pets to Humane Society!!!Thank You</h1></TD></TR></TABLE> ");            
            out.println("<h2 align=\"center\">Please find your Pet Details below");
            out.println("<br>");
            out.println("<TABLE align=\"center\"><TR><TD>PetName:</TD><TD>"+PetName+"</TD></TR><TR><TD>PetType:</TD><TD>"+pettype+"</TD></TR><TR><TD>Breed:</TD><TD>"+breed+"</TD></TR><TR><TD>Color:</TD><TD>"+color+"</TD></TR><TR><TD>Size : </TD><TD>"+size+"</TD></TR><TR><TD>Sex : </TD><TD>"+sex+"</TD></TR></TABLE>");
            
                        
            out.println("</body>");
            out.println("</html>");                        
                                    
            
       //     /* Storing Data in File System */
            
       //     // Open a file to write to, named Pets.txt.
       //     File file = new File("C:/Users/sagar/Documents/NetBeansProjects/HumaneSociety/src/java/Pets.txt");
            
       //     // if file doesnt exists, then create it
       // 			if (!file.exists()) {
       //			file.createNewFile();
       //			}
                                                
       //     FileWriter fw = new FileWriter(file.getAbsoluteFile());
       //     BufferedWriter bw = new BufferedWriter(fw);
                        
       //     bw.write("Dogs : " + Integer.toString(Dogs));
       //     bw.write("\n");
       //     bw.write("Cats : " + Integer.toString(Cats));
       //     bw.write("\n");
       //     bw.write("Total Pets : " + Integer.toString(pets));
            
       //     bw.close(); 
            
       //     /* Successfully Stored Data in File System*/                      
         
            
            // retrieving the Hashtable stored in the file using DeSerialization
            //DeSerialization d1 = new DeSerialization();
            //p1.ht = d1.DeSerializationDetails(out);
                        
            /* storing the current petname and pettype in hashtable */
            //p1.hashtable(PetName, pettype);                        
                                  
            //Serializing the Pets Object   
            //Serialization s = new Serialization();                      
            //s.SerializationDetails(p1, out);
          
            //DeSerializing the Hashtable from file with all the Hashtable cotents 
            //DeSerialization d = new DeSerialization();
            //d.DeSerializationDetails(out); */
            
            /*DeSerializing the Pet Details from File*/
            FileInputStream filein1 = new FileInputStream("C:/Users/sagar/Documents/NetBeansProjects/HumaneSociety/src/java/pets.ser");
            ObjectInputStream objin1=null;
            
            /*Trying to overcome EOF Exception if file is empty*/
            if(filein1.available()>0)
            {
               objin1 = new ObjectInputStream(filein1);
               if(objin1!=null)
               {
                arraylist = (ArrayList)objin1.readObject();   
                
                /* Adding Current Lost Pet Details to the Existing Lost Pet Details */
                arraylist.add(pets);
                objin1.close();
               }    
            }                                     
            filein1.close();
            
            
            /*Serializing ArrayList to File*/
            
            FileOutputStream fileout = new FileOutputStream("C:/Users/sagar/Documents/NetBeansProjects/HumaneSociety/src/java/pets.ser");
            ObjectOutputStream objout = new ObjectOutputStream(fileout);
            objout.writeObject(arraylist);
            objout.close();
            fileout.close();
            out.println("<br>");
            out.println(" <TABLE align=\"center\"><TR><TD><h1>Pet Details are Stored in the File System</h1></TD></TR></TABLE> ");
            
            
            /*DeSerializing the lost pet details from File */
            
            FileInputStream filein2 = new FileInputStream("C:/Users/sagar/Documents/NetBeansProjects/HumaneSociety/src/java/pets.ser");
            ObjectInputStream objin2 = new ObjectInputStream(filein2);            
            arraylist = (ArrayList)objin2.readObject();
            
            out.println("<TABLE align=\"center\" border=\"1\"><TR><TD>PetName</TD><TD>PetType</TD><TD>Breed</TD><TD>Color</TD><TD>Size</TD><TD>Sex</TD></TR></TABLE>");
            for (int i=0; i<arraylist.size(); i++)
            {
              out.println("<TABLE align=\"center\"><TR><TD>"+arraylist.get(i).petname +"</TD><TD>"+arraylist.get(i).pettype+"</TD><TD>"+arraylist.get(i).breed+"</TD><TD>"+arraylist.get(i).color+"</TD><TD>"+arraylist.get(i).size+"</TD><TD>"+arraylist.get(i).sex+"</TD></TR></TABLE>");
              out.println("<br>");
            }    
            
            objin2.close();
            filein2.close();                                                                  
          
        }                
        catch(Exception exc){
           exc.printStackTrace(); // If there was an error, print the info. 
           out.println("Error Occured in the Servlet1");
           exc.printStackTrace(response.getWriter()); // This show exception StackTrace into browser
           
         }
        finally {
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
