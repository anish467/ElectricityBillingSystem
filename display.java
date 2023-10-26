package ElectricityBillingSystem;

import java.util.ArrayList;
import java.util.ListIterator;

public class display{
    display(ArrayList<user> a)
    {
        ListIterator<user> li = null; 
        li = a.listIterator();
        while(li.hasNext())
        {
            user u = (user)li.next();
            System.out.println("-----------------------------------------------------------------------");
            System.out.println("Username  : "+u.username);
            System.out.println("Password  : "+u.password);
            System.out.println("Address   : "+u.address);
            System.out.println("Mobile No.: "+u.phoneno);
            System.out.println("Units     : "+u.units);
            System.out.println("Bill Amount: "+Bill.BillAmountCalculator(u.units));
            System.out.println("-----------------------------------------------------------------------");  
        }
    }
}
 