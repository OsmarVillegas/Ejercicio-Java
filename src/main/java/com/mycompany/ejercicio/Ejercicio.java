/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ejercicio;

import controller.Controller;

import java.util.Scanner;

/**
 *
 * @author empan
 */
public class Ejercicio {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int opcion = 0;
        String nuevo;
        
        
        Controller todoController = new Controller();

        do{
        System.out.println("****************************************************************");
        System.out.println("*                      Ingresa un número                       *");
        System.out.println("****************************************************************");
        System.out.println("* 9 * Agregar una nueva tarea                                  *");
        System.out.println("* 8 * ver la lista de tareas                                   *");
        System.out.println("* 7 * Salir                                                    *");
        System.out.println("****************************************************************");
        System.out.print("\n Ingresa un valor: ");
        opcion = leer.nextInt();
        
        switch(opcion) {
            case 9:
                System.out.print("\n Ingresa una nueva tarea: ");
                nuevo = leer.next();
                todoController.addTodo(nuevo);
                break;
            case 8:
                System.out.print("\n\n\n\n");
                todoController.getTodo();
                System.out.print("\n\n\n\n");
                break;
            case 0:
                System.out.println("Apagando aplicación");
        }
        
        }while(opcion != 0);
    }
}
