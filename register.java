package ElectricityBillingSystem;
import java.io.*;
import java.util.*;
public class register extends splash{
    
    ArrayList<user> a1 = new ArrayList<user>();
    ObjectOutputStream oos = null;
    File file = new File("user.txt");
    void registeration() throws IOException
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter user name");
        String username = sc.nextLine();
        System.out.println("Enter password");
        String password = sc.nextLine();
        System.out.println("Enter address");
        String address= sc.nextLine();
        System.out.println("Enter phone number");
        String phoneno=sc.nextLine();
        System.out.println("Enter No. of Units Consumed");
        Float units = sc.nextFloat();
        user u= new user();
        u.user1(username, password, address, phoneno,units);
        a1.add(u);
        oos = new ObjectOutputStream(new FileOutputStream(file));
        oos.writeObject(a1);
        oos.close();
    }
}
