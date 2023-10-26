package ElectricityBillingSystem;

import java.io.File;
import java.io.*;
import java.util.*;

public class complaint {
    ObjectOutputStream oos=null;
    File file = new File("user.txt");
    complaint(ArrayList<user> a1,user u) throws FileNotFoundException, IOException
    {
        System.out.println("Enter your complaint");
        Scanner sc = new Scanner(System.in);
        u.complaint=sc.nextLine();
        System.out.println("Your complaint has been registered");
        oos = new ObjectOutputStream(new FileOutputStream(file));
        oos.writeObject(a1);
        oos.close();

    }
}
class viewcomplaint
{
    viewcomplaint(ArrayList<user> a1)
    {
        ListIterator<user> li = null; 
        li = a1.listIterator();
        boolean found=false;
        while(li.hasNext())
        {
            user u = (user)li.next();
           if(u.complaint.equals("null"))
            {
                continue;
            }
            else{
                found=true;
                System.out.println("User: "+u.username+" Complaint: "+u.complaint);
            }
        }
        if(!found)
        {
            System.out.println("No complaints");
        }

    }
}
