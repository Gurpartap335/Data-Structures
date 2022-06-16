package lecture.OPP.Prac.Setters;

public class Account {
    String name;
    int age;
    int id;

    Account(){
        this("xyz",0,0);
    }

    Account(String name, int age, int id){
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public static void main(String[] args) {
        Account a1 = new Account();
        a1.setName("Gurpartap Singh");
        a1.setAge(20);
        a1.setId(1234);
        a1.showDetails();

        Account a2 = new Account();
        a2.showDetails();

    }

    void setName(String name) {
        this.name = name;
    }

    void setAge(int age){
        this.age = age;
    }

    void setId(int id){
        this.id = id;
    }

    String getName(){
        return this.name;
    }

    int getAge() {
        return this.age;
    }

    int getId(){
        return this.id;
    }

    void showDetails(){
        System.out.println("Name : " + getName() +"\nage : " + getAge() + "\nID : " + getId());

    }
}
