
package Model.Entities;

public interface Operations {
    public double consultFunds();
    public void withdraw(double amount);
    public void deposit(double amount);
    public void transfer(Customer customer, double amount);
}
