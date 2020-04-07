package Banking;

import java.util.Scanner;
import java.util.ArrayList;

public class Driver
{

    public static Bank bank = new Bank("International Bank");
    public static Scanner s = new Scanner(System.in);

    public static void menu()
    {
        System.out.println(bank.getName());
        System.out.println("=======================");
        System.out.println("1. Create Account" +
                "\n2. Deposit" +
                "\n3. Withdraw" +
                "\n4. Check Balance" +
                "\n5. Exit");
        System.out.println("=======================");
        System.out.print("Choose menu: ");

        int input = s.nextInt();
        System.out.println();

        switch (input) {
            case 1:
                createNewAccount();
                break;

            case 2:
                depositMoney();
                break;

            case 3:
                withdrawMoney();
                break;

            case 4:
                seeBalance();
                break;

            case 5:
                s.close();
                System.exit(0);
                break;
        }
    }


    public static void createNewAccount()
    {
        System.out.print("Enter Firstname: ");
        String inputF = s.next();

        System.out.print("Enter Lastname: ");
        String inputL = s.next();

        Customer c = new Customer(inputF, inputL);
        Account acc = new Account(0.0d);
        c.setAccount(acc);

        while(true)
        {
            System.out.print("Enter PIN [6 characters || numbers 1-9]: ");
            String inputP = s.next();
            boolean p = c.setPin(inputP);

            if (!p)
            {
                System.out.println("Invalid. Please try again.");
                continue;
            }
            break;
        }
        bank.addCustomer(c);
        System.out.println();
        menu();
    }


    public static Customer checkCustomer()
    {
        while (true)
        {
            System.out.print("Enter Firstname: ");
            String inputF = s.next();

            System.out.print("Enter Lastname: ");
            String inputL = s.next();

            ArrayList<Customer> cust = bank.getCustomers(inputF, inputL);

            if (cust.size() > 0)
            {
                System.out.println("Enter PIN: ");
                String pin = s.next();
                return bank.getCustomer(cust, pin);
            }

            else
            {
                System.out.println();
                System.out.println("Account was not found. Try again?");
                System.out.println("1. Yes");
                System.out.println("2. No");
                System.out.print("Choose menu: ");
                int ch = s.nextInt();
                s.nextLine();

                switch(ch)
                {
                    case 1:
                        System.out.println();
                        continue;

                    case 2:
                        return null;

                    default:
                        return null;
                }
            }
        }
    }


    public static void depositMoney()
    {
        depositMoney:
        while (true)
        {
            Customer c = checkCustomer();

            if (c != null)
            {
                System.out.println("Enter amount of money:");
                double amount = s.nextDouble();

                if (c.getAccount().deposit(amount))
                {
                    System.out.println("Your money has been deposited." +
                            "\nCurrent balance: " +
                            c.getAccount().getBalance());
                    System.out.println();
                    break;
                }

                else
                {
                    System.out.println();
                    System.out.println("Invalid Input. Try again?");
                    System.out.println("1. Yes");
                    System.out.println("2. No");
                    System.out.print("Choose menu: ");
                    int ch = s.nextInt();

                    switch(ch)
                    {
                        case 1:
                            continue;

                        case 2:
                            break depositMoney;
                    }
                }
            }

            else
            {
              break ;
            }
        }
        menu();
    }


    public static void withdrawMoney()
    {
        withdrawMoney:
        while (true)
        {
            Customer c = checkCustomer();

            if (c != null)
            {
                System.out.println("Enter amount of money:");
                double amt = s.nextDouble();
                c.getAccount().withdraw(amt);

                if (c.getAccount().withdraw(amt))
                {
                    System.out.println("Your money has been withdrawn. " +
                            "\nCurrent balance:" +
                            c.getAccount().getBalance());
                    break;
                }

                else
                {
                    System.out.println();
                    System.out.println("Invalid Input. Try again?");
                    System.out.println("1. Yes");
                    System.out.println("2. No");
                    System.out.print("Choose menu: ");
                    int ch = s.nextInt();

                    switch(ch)
                    {
                        case 1:
                            continue;

                        case 2:
                            break withdrawMoney;
                    }
                }
            }

            else
            {
                break;
            }
        }
        menu();
    }


    public static void seeBalance()
    {
        checkBalance:
        while(true)
        {
            Customer c = checkCustomer();

            if (c != null)
            {
                System.out.println("Your current balance: " +
                        c.getAccount().getBalance());
                System.out.println();
                break;
            }
        }
        menu();
    }


    public static void main(String[] args)
    {

        Driver main = new Driver();
        main.menu();
    }

}

