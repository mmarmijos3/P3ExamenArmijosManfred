package Model.Entities;

public class Customer implements Operations{
    private String name;
    private String cedula;
    private String email;
    private String phone;
    private double funds;
    private String username;
    private String password;

    protected Customer() {}

    public String getName() { return name; }
    public String getCedula() { return cedula; }
    public String getEmail() { return email; }
    public String getPhone() { return phone; }
    public double getFunds() { return funds; }
    public String getUsername() { return username; }
    public String getPassword() { return password; }

    protected void setName(String name) { this.name = name; }
    protected void setCedula(String cedula) { this.cedula = cedula; }
    protected void setEmail(String email) { this.email = email; }
    protected void setPhone(String phone) { this.phone = phone; }
    protected void setFunds(double funds) { this.funds = funds; }
    protected void setUsername(String username) { this.username = username; }
    protected void setPassword(String password) { this.password = password; }

    @Override
    public double consultFunds() {
        return getFunds();
    }

    @Override
    public void withdraw(double amount) {
        setFunds(getFunds() - amount);
    }

    @Override
    public void deposit(double amount) {
        setFunds(getFunds() + amount);
    }

    @Override
    public void transfer(Customer customer, double amount) {
        withdraw(amount);
        customer.deposit(amount);
    }

    @Override
    public String toString() {
        return "Customer{" + "name=" + name + ", cedula=" + cedula + ", email=" + email + ", phone=" + phone + ", funds=" + funds + ", username=" + username + ", password=" + password + '}';
    }
    
    
}