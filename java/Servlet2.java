

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Servlet2 extends HttpServlet {

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
            out.println("<title>Servlet Servlet2</title>");            
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
                        
            //out.println("<h1>Servlet Servlet2 at " + request.getContextPath() + "</h1>");
                                                                              
            out.println("</body>");
            out.println("</html>");
            
            /* Retrieving pets from file */
           // DeSerialization d1 = new DeSerialization();
           // p1.ht = d1.DeSerializationDetails(out);
            
          //  if(p1.ht.isEmpty())
          //  {
          //   out.println(" <TABLE align=\"center\"><TR><TD><h1>Sorry...no pets to adopt at this time</h1></TD></TR></TABLE> ");
          //  }  
            
          //  else
          //  {            
          //  out.println("<TABLE align=\"center\"><TR><TD><h1>Choose the pet you like to adopt</h1></TD></TR></TABLE>");
          //  String str=null;
          //  Enumeration names=p1.ht.keys();
          //  while(names.hasMoreElements())
          //  {
          //  str = (String) names.nextElement();
          //  out.println("<br>");   
            //out.println("The petname and pettype deserialized from file are : ");
          //  out.println("<br>");
          //  out.println("<a href=\"Servlet3?key="+str+"\">" + str + " : " + p1.ht.get(str) + "</a>"); 
            //out.println("<a href=\"index.jsp\">Click here to go to Home Page</a>");             
           // }
            //}
            
            Pets pets = new Pets();
            
            /*DeSerializing the LostPet Details from File*/            
            FileInputStream filein1 = new FileInputStream("C:/Users/sagar/Documents/NetBeansProjects/HumaneSociety/src/java/pets.ser");
            ObjectInputStream objin1=null;
            
            /*Trying to overcome EOF Exception if file is empty*/
            if(filein1.available()>0)
            {                
               objin1 = new ObjectInputStream(filein1);
               if(objin1!=null)
               {                   
                arraylist = (ArrayList)objin1.readObject();
                if(arraylist.size() == 0)
                {
                out.println(" <TABLE align=\"center\"><TR><TD><h1>Sorry...no pets to adopt at this time</h1></TD></TR></TABLE> ");
                objin1.close();
                }
                else
                {
                out.println("<TABLE align=\"center\"><TR><TD><h1>Choose the pet you like to adopt</h1></TD></TR></TABLE>");    
                out.println("<TABLE align=\"center\" border=\"1\"><TR><TD>PetName</TD><TD>PetType</TD><TD>Breed</TD><TD>Color</TD><TD>Size</TD><TD>Sex</TD></TR></TABLE>");
                for (int i=0; i<arraylist.size(); i++)
                {
                 out.println("<TABLE align=\"center\"><TR><TD><a href=\"Servlet3?petname="+arraylist.get(i).petname+"&pettype="+arraylist.get(i).pettype+"&breed="+arraylist.get(i).breed+"&color="+arraylist.get(i).color+"&size="+arraylist.get(i).size+"&sex="+arraylist.get(i).sex+"\">" + arraylist.get(i).petname + arraylist.get(i).pettype + arraylist.get(i).breed + arraylist.get(i).color + arraylist.get(i).size + arraylist.get(i).sex  +  "</a></TD></TR></TABLE>");                 
                 out.println("<br>");
                }                              
               }    
               }                                 
            }                                 
            filein1.close();
                                                                                        
        } catch (Exception ex) {
            out.println("Error Occured in Servlet2");
        } finally {
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
