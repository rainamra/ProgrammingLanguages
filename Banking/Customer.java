package Banking;

import java.util.ArrayList;

public class Customer
{
    private String firstname, lastname;
    private Account account;
    private int pin;
    ArrayList<String> pins = new ArrayList<String>();

    public Customer (String f, String l)
    {
        this.firstname = f;
        this.lastname = l;
    }

    public String getFirstname()
    {
        return firstname;
    }

    public String getLastname()
    {
        return lastname;
    }

    public Account getAccount()
    {
        return account;
    }

    public void setAccount(Account acct)
    {
        this.account = acct;
    }

    public boolean setPin(String pin)
    {
        if (pin.length() != 6)
        {
            return false;
        }
        else
        {
            try
            {
                this.pin = Integer.parseInt(pin);
                return true;
            }
            catch(Exception ex)
            {
                return false;
            }
        }
    }

    public boolean checkPIN(int pin)
    {
        return this.pin == pin;
    }

    public boolean checkPIN(String pin)
    {
        try
        {
            return this.checkPIN(Integer.parseInt(pin));
        }
        catch(Exception ex)
        {
            return false;
        }
    }

    public void addPins(String pin)
    {
        pins.add(pin);
    }


}

