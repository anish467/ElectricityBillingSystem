package ElectricityBillingSystem;

import java.util.*;

public class search {
    search(ArrayList<user> a1)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter username");
        String username = sc.nextLine();
        ListIterator<user> li = null; 
        boolean found = false;
        li = a1.listIterator();
        while(li.hasNext())
        {
            user u = (user)li.next();
            if(u.username.equals(username))
            {
                found = true;
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
        if(!found)
        {
            System.out.println("-----------------------------------------------------------------------");
            System.out.println("username not found");
            System.out.println("-----------------------------------------------------------------------");
        }
    }  
}
