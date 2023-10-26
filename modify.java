package ElectricityBillingSystem;

import java.io.*;
import java.util.*;

public class modify {
    modify(ArrayList<user> a1) throws FileNotFoundException, IOException
    {
        ObjectOutputStream oos = null;
        File file = new File("user.txt");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter username of user you wish to modify");
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
                System.out.println("Record Found");
                System.out.println("Enter updated Deatils");
                System.out.println("-----------------------------------------------------------------------");
                System.out.println("Enter user name");
                u.username = sc.nextLine();
                System.out.println("Enter password");
                u.password = sc.nextLine();
                System.out.println("Enter address");
                u.address= sc.nextLine();
                System.out.println("Enter phone number");
                u.phoneno=sc.nextLine();
                System.out.println("Enter No. of Units Consumed");
                u.units = sc.nextFloat();
                oos = new ObjectOutputStream(new FileOutputStream(file));
                oos.writeObject(a1);
                oos.close();
                break;
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
