package com.sanjay;

public class Main {

    public static void main(String[] args) {

        /*Customer 1 details */
        BankDetails customer1 = new BankDetails();
        int customer1AccountNumber = 903686;
        int customer1alance= 20_000;
        String customer1Name = "Sanjay";
        String customer1Email = "sanjaykv7@gmail.com";
        String customer1Phone = "903869086";

        customer1.setCustomerName(customer1Name);
        customer1.setCustomerEmail(customer1Email);
        customer1.setPhoneNumber(customer1Phone);
        customer1.setAccountNumber(customer1AccountNumber);
        customer1.setBalance(customer1alance);

        int amountToDeposite = 10000;
        int amountToWithdraw = 31000;

        int depositedAmount=customer1.depositeFund(amountToDeposite);
        System.out.println("Customer Name is : "+customer1.getCustomerName());
        System.out.println("Customer account Number : "+customer1.getAccountNumber());
        System.out.println("Amount deposited is : "+amountToDeposite);
        System.out.println("Total amount available in account is : "+depositedAmount);
        System.out.println("*******************************************************************");

        int debitedAmount = customer1.withdrawFund(amountToWithdraw);
        if(debitedAmount==-1){
            System.out.println("Customer Name is : "+customer1.getCustomerName());
            System.out.println("Customer account Number : "+customer1.getAccountNumber());
            System.out.println("You entered "+amountToWithdraw+" rupees");
            System.out.println("Insufficient amout retry with different amount");
        }
        else{
            System.out.println("Customer Name is : "+customer1.getCustomerName());
            System.out.println("Customer account Number : "+customer1.getAccountNumber());
            System.out.println("You entered "+amountToWithdraw+" rupees");
            System.out.println("Remaining balance is :"+debitedAmount);


        }



    }
}
