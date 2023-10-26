package ElectricityBillingSystem;

import java.io.*;
import java.util.*;
public class delete {
    delete(ArrayList<user> a1) throws FileNotFoundException, IOException
    {
        ObjectOutputStream oos = null;
        File file = new File("user.txt");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter username of user you want to delete");
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
                a1.remove(u);
                System.out.println("-----------------------------------------------------------------------");
                System.out.println("User deleted Successfully");
                System.out.println("-----------------------------------------------------------------------");
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
