package ProFun.Lab12;

public class Account_650022 {
    int id;
    String name;
    int balance = 0;
    public Account_650022(int id,String name ,int balance ){
        this.id = id;
        this.name = name;
        this.balance = balance;
    }
    public int getId() {
        return id;
    }
    public String getName(){
        return name;
    }
    public int getBalance(){
        return balance;
    }
    public int credit(int amount){ //ฝาก
        if(amount > 0){
            balance += amount;
        }
        return balance;
    }
    public int debit(int amount){ //ถอน
        if(balance >= amount && amount > 0){
            balance -= amount;
        }
        return balance;
    }
    public int transferTo(Account_650022 acct,int amount){
        if( balance >= amount && amount > 0){
            acct.credit(amount);
            balance -= amount;
        }
        return balance;
    }
    public String toString(){
       return String.format("Account %s(%d) balance is %d", name,id, balance);
    }
}

