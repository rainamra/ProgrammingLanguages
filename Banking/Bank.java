package Banking;

import java.util.ArrayList;

public class Bank
{
    private ArrayList<Customer> customers;
    private int numberOfCustomers;
    private String bankName;

    public Bank(String bName)
    {
        this.customers = new ArrayList<Customer>();
        this.numberOfCustomers = 0;
        this.bankName = bName;
    }

    public void addCustomer(Customer c)
    {
       this.numberOfCustomers++;
       this.customers.add(c);
    }

    public void addCustomer(String f, String l)
    {
       Customer c = new Customer(f,l);
       Account acc = new Account(0d);
       c.setAccount(acc);
       this.addCustomer(c);
    }

    public Customer getCustomer(int index)
    {
        return this.customers.get(index);
    }

    public int getNumOfCustomers()
    {
         return this.numberOfCustomers;
    }

    public String getName()
    {
        return this.bankName;
    }

    public ArrayList<Customer> getCustomers(String f, String l)
    {
        ArrayList<Customer> cust = new ArrayList<Customer>();

        for (Customer c : this.customers)
        {
            if (c.getFirstname().equalsIgnoreCase(f) && c.getLastname().equalsIgnoreCase(l))
            {
                cust.add(c);
            }
        }

        return cust;
    }

    public Customer getCustomer(ArrayList<Customer> customers, String pin)
    {
        Customer c = null;

        for (Customer customer : this.customers)
        {
            if (customer.checkPIN(pin))
            {
                c = customer;
            }
        }

        return c;
    }

}
