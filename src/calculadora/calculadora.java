/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;
import java.util.Scanner;

public class Calculadora {
private double operador1;
private double operador2;
Calculadora(int op1, int op2){
 operador1=op1;
 operador2=op2;
}
public double suma(){
    double operacion;
    operacion = operador1 + operador2;
    return operacion; 
}
public double resta(){
    double operacion;
    operacion= operador1 - operador2;
    return operacion;
}

public double multiplicar(){
    double operacion;
    operacion= operador1 * operador2;
    return operacion;
}
public double dividir(){
    double operacion;
    operacion= operador1 / operador2;
    return operacion;
}
public double maximo(){
        if (operador1>operador2){
         return operador1;  
          
       }
       else{               
           return operador2;  
                  
               }
    
}
public double minimo(){ 
     
       if (operador1<operador2){
           return operador1; 
           
       }
         else{
                 return operador2;                    
       }
    
}
public double intercambiar(){
     double aux=operador1;
    operador1=operador2;
    operador2=aux;
    System.out.println("Operador1 cambió a : " + operador1+ "  y el Operador2 cambió a  : " +operador2 );
    return aux;
}
public void resultado(){
    int metodo;
    Scanner sc = new Scanner (System.in);
    System.out.println("Introduzca el el metodo (1:Sumar;2:Restar;3:Multiplicar;4:Dividir;5:Maximo;6:Minimo;7:Intercambiar)"); 
        metodo=sc.nextInt();
        switch(metodo){
            case 1:System.out.println("La suma es:" +suma());
            break;
            case 2:System.out.println("La resta es:" +resta());
            break;
            case 3:System.out.println("La multiplicacion es:" +multiplicar());
            break;
            case 4:System.out.println("La divion es:" +dividir());
            break;
            case 5:System.out.println("Devuelve maximo: " + maximo());
            break;
            case 6:System.out.println("Devuelve minimo: " +minimo());
            break;
            case 7: System.out.println("Intercambio: " +intercambiar());
            break;
            default: System.out.println(" No existe este metodo."); 
        }  
}
    public static void main(String[] args) {
        int metodo;
        int op1;
        int op2;
        do{
        Scanner sc = new Scanner (System.in);
        System.out.println("Introduzca el primer valor.");
        op1=sc.nextInt();
        System.out.println("Introduzca el segundo valor."); 
        op2=sc.nextInt();
        Calculadora obj=new Calculadora(op1, op2);
        obj.resultado();
        System.out.println("¿Desea introducir otra operacion?   1:Si;2:No");
        metodo=sc.nextInt();
        }while(metodo==1);
        //Esto es un comentario.
    }
}

