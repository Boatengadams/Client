// Question: Which details should a bank transaction record?
package OOP.BANK;
//          TRansaction
//----------------------------------------

import java.util.Date;

//          -type : char
//        -amount : double
//        -balance : double
//        -date : Date
//        -description :String
//-------------------------------------------------
//        +Transaction(char, double,double,String)
//--------------------------------------------------
public class Transaction {
    private char type ;
    private double amount;
    private double balance ;
    private Date date;
    private String description ;

    public Transaction(char type, double amount, double balance, String description) {
        this.type = type;
        this.amount = amount;
        this.balance = balance;
        this.description = description;
        this.date = new Date();
    }
}
