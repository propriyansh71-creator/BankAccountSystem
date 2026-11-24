public class Main {
    public static void main(String[] args) {
        BankAccount a1 = new BankAccount("1001", "Rahul", 5000);
        BankAccount a2 = new BankAccount("1002", "Priya", 10000);

        a1.deposit(2000);
        a1.withdraw(1500);
        a1.withdraw(10000);

        a2.deposit(500);
        a2.withdraw(3000);

        System.out.println();
        a1.displayDetails();
        System.out.println();
        a2.displayDetails();
    }
}
