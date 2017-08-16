/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase4;

/**
 *
 * @author ESTUDIANTE
 */
public class Clase4 {

    /**
     * @param args the command line arguments
     */
    
    
    // atributos
   public String Usuario ;
   public  int NumCuenta ;
    public int ClaveActual ;
     public double saldo ;
    
    
    
    //metodos:
    
    
    public boolean consignar (double monto){
        if ( monto > 0 ){
            this.saldo += monto;
            return true;
            
        }
        else {
            return false ;
        }
    }
    
    public boolean retirar ( double monto){
        if (monto > 0 && monto >= this.saldo ){
            this.saldo -= monto;
            return true;
        }
        else {
            return false;
        }     
    }
    
    public boolean cambiarClave (int claveActual, int claveNueva){
        if (claveActual == this.ClaveActual){
             this.ClaveActual = claveNueva ;
            return true;
        }
        else {
            return false ;
        }
    }
    
    public double consultarSaldo (){
        return this.saldo;
    }
    
    
   
    
}
