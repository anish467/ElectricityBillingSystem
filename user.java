package ElectricityBillingSystem;

import java.io.Serializable;

public class user implements Serializable{
    String username;
    String password;
    String address;
    String phoneno;
    String complaint="null";
    Float units;
    private static final long serialVersionUID=-6210742191815846441L;
    void user1(String username,String password,String address,String phoneno,Float units)
    {
        this.username=username;
        this.password=password;
        this.address=address;
        this.phoneno=phoneno;
        this.units=units;
        complaint="null";
    }
    public String toString()
    {
        return username+" "+password+" "+address+" "+phoneno+" "+units;
    }
}
