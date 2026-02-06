package Model.Entities;

public interface Builder {
    Builder setName(String name);
    Builder setCedula(String cedula);
    Builder setEmail(String email);
    Builder setPhone(String phone);
    Builder setFunds(double funds);
    Builder setUsername(String username);
    Builder setPassword(String password);
    Customer build();
}