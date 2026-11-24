# Bank Account Management System

A simple Java program that shows how classes and objects work, using a bank account example.

## Files
- `BankAccount.java` - the class with account number, holder name and balance
- `Main.java` - creates two accounts and performs deposit and withdraw operations

## Methods in BankAccount
- `deposit(double amount)` - adds money to the account
- `withdraw(double amount)` - takes money out, shows "Insufficient balance" if there isn't enough
- `checkBalance()` - shows the current balance
- `displayDetails()` - shows account number, holder name and balance

Each account has its own separate balance.

## How to run
```
javac BankAccount.java Main.java
java Main
```

## Output
```
2000.0 deposited successfully
1500.0 withdrawn successfully
Insufficient balance
500.0 deposited successfully
3000.0 withdrawn successfully

Account Number: 1001
Account Holder: Rahul
Balance: 5500.0

Account Number: 1002
Account Holder: Priya
Balance: 7500.0
```
