package Controlador;

import modelo.User;
import Vista.Vista;

public class Controlador {
    
    private User modelo;
    private Vista vista;

    // Constructor
    public Controlador(User modelo, Vista vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    // Métodos para modificar y obtener el nombre del usuario
    public void setUserName(String name) {
        modelo.setName(name);
    }

    public String getUserName() {
        return modelo.getName();
    }

    // Métodos para modificar y obtener la edad del usuario
    public void setUserAge(int age) {
        modelo.setAge(age);
    }

    public int getUserAge() {
        return modelo.getAge();
    }

    // Métodos para modificar y obtener la cantidad de productos
    public void setUserCantidad(int cantidad) {
        modelo.setCantidad(cantidad);
    }

    public int getUserCantidad() {
        return modelo.getCantidad();
    }

    // Métodos para modificar y obtener el precio del producto
    public void setUserPrecio(double precio) {
        modelo.setPrecio(precio);
    }

    public double getUserPrecio() {
        return modelo.getPrecio();
    }

    // Métodos para modificar y obtener si la compra es de contado
    public void setEsDeContado(boolean esDeContado) {
        modelo.setEsDeContado(esDeContado);
    }

    public boolean getEsDeContado() {
        return modelo.isEsDeContado();
    }

    // Método para actualizar la vista
    public void updateView() {
        // Calcular el total a pagar después de los descuentos
        double totalAPagar = modelo.calcularPago();
        
        // Imprimir los detalles del usuario, el tipo de pago y el total a pagar
        vista.printUserDetails(modelo.getName(), modelo.getAge(), modelo.getCantidad(), modelo.getPrecio(), modelo.isEsDeContado(), totalAPagar);
    }
}
