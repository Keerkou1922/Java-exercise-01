import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.*;


public class Accounts {
    private double balance;
    private int accountNumber;
    public Accounts( double initialBalance, int accountNumber )
    {
        if ( initialBalance > 0.0 )
            balance = initialBalance;
    }
    public void credit( double amount )
    {
        balance = balance+amount;
    }
    public void withdraw(double amount)
    {
        balance = balance - amount;
    }
    public double getBalance()
    {
        return balance;
    }
    public int getAccountNumber()
    {
        return this.accountNumber;
    }




    public static void main(String[] args)throws IOException {

      Scanner sc=new Scanner(System.in);







        FileWriter writer=new FileWriter("C:\\Users\\TEMP\\Desktop\\Lab3-2018e060-EC5080\\account_details.txt");
        BufferedWriter buffer=new BufferedWriter(writer);
        for(int i=0;i<10;i++) {
            String account=sc.nextLine();
            buffer.write(Integer.toString(i+1) +" "+account);
            



        }
        buffer.close();
        System.out.println("Success");


    }
}

