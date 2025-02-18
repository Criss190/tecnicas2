package MetodoPago;

import modelo.User;

public class Pagos {
    
    // Método para procesar el pago
    public void procesarPago(User user, String metodoPago) {
        double totalAPagar = user.calcularPago();  // Obtener el total a pagar después de los descuentos

        // Validar el tipo de pago y aplicar el descuento correspondiente
        if (metodoPago.equalsIgnoreCase("contado")) {
            // Si es de contado, se aplica un 10% de descuento adicional
            double descuentoContado = totalAPagar * 0.10;  // 10% adicional de descuento
            totalAPagar -= descuentoContado;  // Restamos el descuento al total
            System.out.println("Pago realizado de contado.");
            System.out.println("Descuento adicional por pago de contado: " + descuentoContado);
        } else if (metodoPago.equalsIgnoreCase("credito")) {
            // Si es a crédito, no se aplica descuento adicional
            System.out.println("Pago realizado a crédito.");
        } else {
            System.out.println("Método de pago no válido.");
        }

        // Mostrar el total final a pagar
        System.out.println("Total a pagar: " + totalAPagar);
    }
}
