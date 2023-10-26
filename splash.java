package ElectricityBillingSystem;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class splash{
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        System.out.println("Electricity Billing System");
        Scanner sc = new Scanner(System.in);
        register r =new register();
        ObjectInputStream ois=null;
        ObjectOutputStream oos=null;
        File file = new File("user.txt");
        if(file.exists())
        {
            ois = new ObjectInputStream(new FileInputStream(file));
            r.a1=(ArrayList<user>) ois.readObject();
             ois.close();
        }
        
        label1:
            while(true)
            {
                System.out.println("-----------------------------------------------------------------------");
                System.out.println("Main Menu");
                System.out.println("1. User");
                System.out.println("2. Admin");
                System.out.println("3. Exit");
                System.out.println("-----------------------------------------------------------------------");
                System.out.print("Choose an option: ");
                int n = sc.nextInt();
                switch(n)
                {
                    case 1: while(true)
                    {
                        System.out.println("-----------------------------------------------------------------------");
                        System.out.println("User Menu");
                        System.out.println("1. Register");
                        System.out.println("2. Login");
                        System.out.println("3. Go to main menu");
                        System.out.println("4. Exit");
                        System.out.println("-----------------------------------------------------------------------");
                        System.out.print("Choose an option: ");
                        int x = sc.nextInt();
                        switch(x)
                        {
                            case 1: r.registeration();
                            break;
                            case 2: 
                            new login(r.a1);
                            break;
                            case 3: continue label1;
                            case 4: System.exit(0);
                            default:System.out.println("Enter Valid Option");
                        }
                    }
                    case 2: 
                    sc.nextLine();
                    System.out.println("Enter User ID");
                    String adminid = sc.nextLine();
                    System.out.println("Enter Password");
                    String adminpass  =sc.nextLine();
                    if(adminid.equals("admin") && adminpass.equals("admin")){
                    while(true)
                    {
                        System.out.println("-----------------------------------------------------------------------");
                        System.out.println("Admin Menu");
                        System.out.println("1. Display Detail of All Customers");
                        System.out.println("2. Search Customer");
                        System.out.println("3. Insert Customer");
                        System.out.println("4. Modify Customer Details");
                        System.out.println("5. Delete Customer");
                        System.out.println("6. Delete all customers");
                        System.out.println("7. View all complaints");
                        System.out.println("8. Go to main menu");
                        System.out.println("9. exit");
                        System.out.println("-----------------------------------------------------------------------");
                        System.out.print("Choose an option: ");
                        int x = sc.nextInt();
                        switch(x)
                        {
                            case 1: 
                            new display(r.a1);
                            break;
                            case 2: 
                            new search(r.a1);
                            break;
                            case 3:  r.registeration();
                            break;
                            case 5: 
                            new delete(r.a1);
                            break;
                            case 4: new modify(r.a1);
                            break;
                            case 6: r.a1.clear();
                            oos = new ObjectOutputStream(new FileOutputStream(file));
                            oos.writeObject(r.a1);
                            oos.close();
                            System.out.println("-----------------------------------------------------------------------");
                            System.out.println("All customers deleted successfully");
                            System.out.println("-----------------------------------------------------------------------");
                            break;
                            case 7: new viewcomplaint(r.a1);
                            break;
                            case 8: continue label1;
                            case 9: System.exit(0);
                            default: System.out.println("Enter Valid Option");
                        }

                    }}
                    else
                    {
                        System.out.println("-----------------------------------------------------------------------");
                        System.out.println("Invalid Credentials");
                        System.out.println("Please Try Again");
                        System.out.println("-----------------------------------------------------------------------");
                    }
                    break;
                    case 3:System.exit(0);
                    default: System.out.println("Enter Valid Option");
                }
            }
        }
    
}

