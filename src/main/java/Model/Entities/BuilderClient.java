package Model.Entities;

public class BuilderClient implements Builder {
    private Customer customer;
    
    public BuilderClient() {
        this.reset();
    }
    
    private void reset() {
        this.customer = new Customer();
    }
    
    @Override
    public Builder setName(String name) {
        customer.setName(name);
        return this;
    }
    
    @Override
    public Builder setCedula(String cedula) {
        customer.setCedula(cedula);
        return this;
    }
    
    @Override
    public Builder setEmail(String email) {
        customer.setEmail(email);
        return this;
    }
    
    @Override
    public Builder setPhone(String phone) {
        customer.setPhone(phone);
        return this;
    }
    
    @Override
    public Builder setFunds(double funds) {
        customer.setFunds(funds);
        return this;
    }
    
    @Override
    public Builder setUsername(String username) {
        customer.setUsername(username);
        return this;
    }
    
    @Override
    public Builder setPassword(String password) {
        customer.setPassword(password);
        return this;
    }
    
    @Override
    public Customer build() {
        // Validaciones antes de construir
        generateCredentials();
        
        Customer builtClient = this.customer;
        this.reset(); // Preparar para siguiente construcción
        return builtClient;
    }
    
    private void generateCredentials() {
        if (customer.getUsername() == null || customer.getUsername().trim().isEmpty()) {
            // Generar username automáticamente si no se proporcionó
            generateUsername();
        }
        if (customer.getPassword() == null || customer.getPassword().trim().isEmpty()) {
            // Generar password automáticamente si no se proporcionó
            generatePassword();
        }
    }
    
    private void generateUsername() {
        String name = customer.getName();
        if (name != null && !name.trim().isEmpty()) {
            String username = name.toLowerCase()
                .replaceAll("[^a-z0-9]", "")
                .replaceAll("\\s+", "_");
            username += "_" + customer.getCedula().substring(Math.max(0, customer.getCedula().length() - 4));
            customer.setUsername(username);
        }
    }
    
    private void generatePassword() {
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder password = new StringBuilder();
        
        // Asegurar al menos 8 caracteres
        for (int i = 0; i < 8; i++) {
            int index = (int) (Math.random() * chars.length());
            password.append(chars.charAt(index));
        }
        
        customer.setPassword(password.toString());
    }
}