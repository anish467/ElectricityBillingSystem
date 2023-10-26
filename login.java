package ElectricityBillingSystem;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.*;

public class login
{
    ObjectOutputStream oos = null;
    File file = new File("user.txt");
    login(ArrayList<user> a1) throws FileNotFoundException, IOException
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter username");
        String username = sc.nextLine();
        System.out.println("Enter Password");
        String password = sc.nextLine();
        ListIterator<user> li = null; 
        boolean found = false;
        li = a1.listIterator();
        out:
        while(li.hasNext())
        {
            user u = (user)li.next();
            if(u.username.equals(username))
            {
                if(u.password.equals(password))
                {
                    found = true;
                    System.out.println("-----------------------------------------------------------------------");
                    System.out.println("login successfull");
                    System.out.println("Your details are");
                    System.out.println("-----------------------------------------------------------------------");
                    System.out.println("Username  : "+u.username);
                    System.out.println("Password  : "+u.password);
                    System.out.println("Address   : "+u.address);
                    System.out.println("Mobile No.: "+u.phoneno);
                    System.out.println("Units     : "+u.units);
                    System.out.println("Bill Amount: "+Bill.BillAmountCalculator(u.units));
                    System.out.println("-----------------------------------------------------------------------");
                    while(true){
                    System.out.println("Please select one option");
                    System.out.println("1. View Bill");
                    System.out.println("2. Raise a Complaint");
                    System.out.println("3. Modify details");
                    System.out.println("4. Pay Bill");
                    System.out.println("5. Go to user menu");
                    System.out.println("6. Exit");
                    System.out.print("Choose an option: ");
                    int x = sc.nextInt();
                    switch(x)
                    {
                        case 1: new Bill(u);
                        break;
                        case 2:new complaint(a1,u);
                        break;
                        case 3:
                        
                        sc.nextLine();
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
                        case 4: System.out.println("-----------------------------------------------------------------------");
                        System.out.println("Pay "+Bill.BillAmountCalculator(u.units)+" through google pay on 8349544741");
                        System.out.println("-----------------------------------------------------------------------");
                        break;
                        case 5: break out;
                        case 6: System.exit(0);
                    }
                }
                }
            }
        }
        if(!found)
        {
             System.out.println("-----------------------------------------------------------------------");
            System.out.println("Record not Found");
            System.out.println("Please try again");
             System.out.println("-----------------------------------------------------------------------");
        }

    }
}