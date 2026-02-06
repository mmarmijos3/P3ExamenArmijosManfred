package Controller;

/**
 *
 * @author Manfred Armijos
 */
public class Validation {
    
    public static String validateName(String name) {
        if (name.isEmpty()) {
            return "* Campo obligatorio";
        } else if (!name.matches("^[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+$")) {
            return "* Solo se permiten letras";
        }
        
        return null;
    }
    
    
    public static String validateCedula(String cedula) {
        if (cedula.isEmpty()) {
            return "* Campo obligatorio";
        }
        
        cedula = cedula.trim().replaceAll("[\\s-]", "");
        
        if (cedula.length() != 10) {
            return "* La cédula debe tener 10 dígitos";
        }
        
        if (!cedula.matches("^[0-9]+$")) {
            return "* Solo se permiten números";
        }
        
        if (cedula.matches("0{10}")) {
            return "* Cédula inválida";
        }
        
        return null;
    }
    
    public static String validateEmail(String email) {
        if (email.isEmpty()) {
            return "* Campo obligatorio";
        }
        
        String emailPattern = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        
        if (!email.matches(emailPattern)) {
            return "* Formato de correo inválido";
        }
        
        if (email.length() > 100) {
            return "* El correo es demasiado largo";
        }
        
        if (email.contains(" ")) {
            return "* El correo no debe contener espacios";
        }
        
        String dominio = email.split("@")[1].split("\\.")[0];
        if (dominio.matches("^[0-9]+$")) {
            return "* Dominio de correo inválido";
        }
        
        return null;
    }
    
    public static String validatePhone(String telefono) {
        if (telefono.isEmpty()) {
            return "* Campo obligatorio";
        }
        
        telefono = telefono.trim().replaceAll("[\\s\\-()+]", "");
        
        if (!telefono.matches("^[0-9]+$")) {
            return "* Solo se permiten números";
        }
        
        if (telefono.length() != 10) {
            return "* El teléfono debe tener 10 dígitos";
        }
        
        // Validar que no sea un número con muchos ceros consecutivos
        if (telefono.matches("0{6,}")) {
            return "* Número de teléfono inválido";
        }
        
        return null;
    }
    
    public static String validateFunds(String amount) {
        if (amount.isEmpty()) {
            return "* Campo obligatorio";
        }
        
        // Validar que sea un número válido (puede contener decimales)
        if (!amount.matches("^[0-9]+(\\.[0-9]{1,2})?$")) {
            return "* Ingrese un monto válido (ej: 100.50)";
        }
        
        try {
            double monto = Double.parseDouble(amount);
            
            // Validar que sea mayor a cero
            if (monto <= 0) {
                return "* El monto debe ser mayor a 0";
            }
            
            // Validar que sea menor a 10000
            if (monto >= 10000) {
                return "* El monto debe ser menor a 10,000";
            }
            
            // Validar que no tenga más de 2 decimales
            String[] partes = amount.split("\\.");
            if (partes.length == 2 && partes[1].length() > 2) {
                return "* Máximo 2 decimales";
            }
            
            // Validar que no sea un número muy pequeño
            if (monto < 0.01) {
                return "* El monto mínimo es 0.01";
            }
            
        } catch (NumberFormatException e) {
            return "* Formato de monto inválido";
        }
        
        return null;
    }
}