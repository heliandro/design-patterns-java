package observer;

import java.util.ArrayList;
import java.util.List;

public class BankAccount {
    private double balance;
    private List<Observer> observers = new ArrayList<>();
    
    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void addObserver(Observer observer) {
        this.observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        this.observers.remove(observer);
    }

    public void deposit(double amount) {
        balance += amount;
        notifyObservers(amount);
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            notifyObservers(-amount);
        } else {
            System.out.println("Insufficient funds");
        }
    }

    private void notifyObservers(double amount) {
        for (Observer observer : observers) {
            observer.update(amount);
        }
    }
}
