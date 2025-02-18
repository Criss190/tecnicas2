package com.mycompany.mvc;

import Vista.Vista;
import Controlador.Controlador;
import modelo.User;

public class MVC {

    public static void main(String[] args) {
        

        User user = new User("Juan Pérez", 25, 5, 50.0, true);


        Vista view = new Vista();

        Controlador controller = new Controlador(user, view);


        controller.updateView();

    
        controller.setUserName("Carlos Gómez");
        controller.setUserAge(30);
        controller.setUserCantidad(10); 
        controller.setUserPrecio(60.0); 
        controller.setEsDeContado(false); 

        // Mostrar los datos actualizados
        System.out.println("\nDatos actualizados:");
        controller.updateView();
    }
}
