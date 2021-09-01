package data;

public class Account {
    int balance;
    int id;
    
    public Account(int id)
    {
        this.id=id;
        this.balance=100;
    }
    
    
    public int getBalance(){
        return this.balance;
    }
    public int withdraw(int amount){
        if(amount > balance) {
            System.out.println("Not enough funds!");
        }
        else{
            return this.balance -= amount;
        }
        return this.balance;
    
    }
    public int deposit(int amount){
        return this.balance += amount;
    }
}