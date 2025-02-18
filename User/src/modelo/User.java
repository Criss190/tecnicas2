package modelo;

public class User {
    
    private String name;
    private int age;
    private int cantidad;
    private double precio;
    private boolean esDeContado;  


    public User(String name, int age, int cantidad, double precio, boolean esDeContado) {
        this.name = name;
        this.age = age;
        this.cantidad = cantidad;
        this.precio = precio;
        this.esDeContado = esDeContado;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isEsDeContado() {
        return esDeContado;
    }

    public void setEsDeContado(boolean esDeContado) {
        this.esDeContado = esDeContado;
    }


    public double calcularDescuento() {
        double descuento = 0.0;


        if (cantidad < 8) {
            descuento = 4.0;  
        } else if (cantidad >= 8) {
            descuento = 7.0; 
        }

        if (esDeContado) {
            descuento += 10.0;  
        }

   
        if (!esDeContado) {
            System.out.println("No se aplica descuento adicional por ser a crédito.");
        }

        System.out.println("Descuento total aplicado: " + descuento + "%");
        return descuento;
    }

    public double calcularPago() {
        double descuentoTotal = calcularDescuento(); 
        double totalAntesDeDescuento = cantidad * precio;  
        double montoDescontado = totalAntesDeDescuento * (descuentoTotal / 100);  
        double totalAPagar = totalAntesDeDescuento - montoDescontado;  

        System.out.println("Total a pagar después del descuento: " + totalAPagar);
        return totalAPagar; 
    }
}
