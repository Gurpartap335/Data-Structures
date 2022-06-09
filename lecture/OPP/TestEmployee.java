package lecture.OPP;



public class TestEmployee {
    public static void main(String[] args) {
        Employee E1 = new Employee();
        E1.insert(1,"tupac",2345);

        Employee E2 = new Employee();
        E2.insert(2,"nag",234);

        E1.display();

        E2.display();

        // creating object of class Account
        Account a1 = new Account();
        a1.insert(3,"Spiderman",1000);
        a1.display();
        a1.checkBalance();
        a1.deposit(343);
        a1.checkBalance();
        a1.withdraw(500);
        a1.checkBalance();
        a1.withdraw(2343);

    }
}

class Employee {
    int id;
    String name;
    float salary;

    void insert(int i, String n, float s) {
        id = i;
        name = n;
        salary = s;
    }

    void display() {
        System.out.println(id + " " + name + " " + salary);
    }

}


// Account

class Account{
    int acc_no;
    String name;
    float amount;

    // method to initialize object
    void insert(int a, String n,float amt) {
        acc_no = a;
        name = n;
        amount = amt;
    }

    // deposit method
    void deposit(float amt) {
        amount += amt;
        System.out.println(amt + " deposited");
    }

    void withdraw(float amt) {
        if (amount < amt) {
            System.out.println("Insufficient balance");
        } else {
            amount -= amt;
            System.out.println(amt + " withdrawn");
        }
    }

    // method to check the balance of the account
    void checkBalance() {
        System.out.println("Balance : " + amount);
    }

    // method to display the values of an object
    void display(){
        System.out.println(acc_no + " " + name + " " + amount);
    }
}