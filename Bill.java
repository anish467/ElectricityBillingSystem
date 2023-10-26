package ElectricityBillingSystem;

public class Bill {
    
    Bill(user u)
    {
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("                   Bill for Present Month");
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("Name: "+u.username);
        System.out.println("Address: "+u.address);
        System.out.println("Phone No.: "+u.phoneno);
        System.out.println("No. of units Consumed: "+u.units);
        System.out.println("Total Amount to be paid: "+BillAmountCalculator(u.units));
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("Bill Calculation Method");
        System.out.println("For first 50 units Rs.0.5/unit");
        System.out.println("For next 100 units Rs.0.75/unit");
        System.out.println("For next 250 units Rs.1.2/unit");
        System.out.println("For unit above 250 units Rs.1.5/unit");
         System.out.println("-----------------------------------------------------------------------");
    }
    static Double BillAmountCalculator(Float units)
    {
        double billamount=0;
        if(units<=50)
        {
            billamount=billamount+50*units;
        }
        else if(units>50 && units<=100)
        {
            billamount=billamount+(units-50)*0.75+50*0.5;
        }
        else if(units>100 && units<=250)
        {
            billamount=billamount+(units-150)*1.2+100*0.75+50*0.5;
        }
        else if(units>250)
        {
            billamount=billamount+(units-400)*1.5+250*1.5+100*0.75+50*0.5;
        }
        return billamount;
    }
}
