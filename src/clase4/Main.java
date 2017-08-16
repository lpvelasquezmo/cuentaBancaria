/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase4;

import java.util.*;
/**
 *
 * @author ESTUDIANTE
 */
public class Main {
    public static void main(String[] args) {
        boolean resultado;
        resultado = false;
        Clase4 magdalena=new Clase4(); 
        magdalena.Usuario = "magdalena Sanchez" ;
        magdalena.ClaveActual = 1234;
        magdalena.NumCuenta =  1012;
        magdalena.saldo = 0;
        
        
        resultado = magdalena.consignar (100000);
        if (resultado  == true){
            System.out.println("consignacion exitosa, nuevo saldo");
            
        }
        else{
        System.out.println(" consignacion fallida");
        
    }
    }
   
    
    
}
