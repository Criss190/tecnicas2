package Vista;



public class Vista {
    

    public void printUserDetails(String name, int age, int cantidad, double precio, boolean esDeContado, double totalAPagar) {
        // Información del usuario
        System.out.println("Usuario: " + name);
        System.out.println("Edad: " + age);
        System.out.println("Cantidad de productos: " + cantidad);
        System.out.println("Precio por producto: " + precio);
        System.out.println("Pago de contado: " + (esDeContado ? "Sí" : "No"));

        // Información del pago
        if (esDeContado) {
            System.out.println("Método de pago: Contado");
        } else {
            System.out.println("Método de pago: Crédito");
        }

        // Mostrar el total a pagar
        System.out.println("Total a pagar: " + totalAPagar);
    }
}

