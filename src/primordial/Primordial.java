/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primordial;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class Primordial {

    /**
     * @param args the command line arguments
     */
   
       
        
        
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner entrada = new Scanner(System.in);
        char respuesta;
        int respuesta1 = 0,num;
        do{
        byte menu;
        System.out.println("Digite la opcion que desea realizar ");
        System.out.println("");
        System.out.println("1.Datos paquetes margarita");
        System.out.println("2.Datos paquetes galletas");
        System.out.println("3.Datos paquetes chitos");
        System.out.println("4.Datos paquetes chocorramo");
        System.out.println("5.Datos paquetes margarita");
        menu = entrada.nextByte();
        
        while(menu<=0 || menu>5){
        System.out.println("Digite la opcion que desea realizar ");
        System.out.println("");
        System.out.println("1.Datos paquetes margarita");
        System.out.println("2.Datos paquetes galletas");
        System.out.println("3.Datos paquetes chitos");
        System.out.println("4.Datos paquetes chocorramo");
        System.out.println("5.Datos paquetes margarita");
            menu = entrada.nextByte();
            
        }
        switch(menu){
            case 1:
                Producto obj1= new Producto("margarita",2000,30);
                obj1.precioTotal();
                System.out.println(obj1.precioTotal);
                System.out.println("\nDatos: "+obj1.datos()+"\n");
                System.out.println("---------------------------------");
                System.out.println("¿1.desea comprar un paquete?");
                System.out.println("¿2.desea insetar paquete?");
                System.out.println("-------------------------------");
                respuesta1= entrada.nextInt();
             if(respuesta1==1){
                 System.out.println("ha comprado un paquete de margarita");
                 obj1.vendidos=1;
             }
             if(respuesta1==2){
                 System.out.println("cuantos desea agregar: ");
                 num= entrada.nextInt();
                 num=obj1.agregados;
             }
                
            break;
            case 2:
                Producto obj2=new Producto("Galletas", 1000, 10);
                obj2.precioTotal();
                System.out.println(obj2.precioTotal);
                System.out.println("\nDatos: "+obj2.datos()+"\n");
                System.out.println("---------------------------------");
                System.out.println("¿1.desea comprar un paquete?");
                System.out.println("¿2.desea insetar paquete?");
                System.out.println("-------------------------------");
                respuesta1= entrada.nextInt();
             if(respuesta1==1){
                 System.out.println("ha comprado un paquete de margarita");
                 obj2.vendidos=1;
             }
             if(respuesta1==2){
                 System.out.println("cuantos desea agregar: ");
                 num= entrada.nextInt();
                 num=obj2.agregados;
             }
             
            break;
            case 3:
                Producto obj3=new Producto("Chitos", 2000, 10);
                obj3.precioTotal();
               System.out.println(obj3.precioTotal);
               System.out.println("\nDatos: "+obj3.datos()+"\n");
                System.out.println("---------------------------------");
                System.out.println("¿1.desea comprar un paquete?");
                System.out.println("¿2.desea insetar paquete?");
                System.out.println("-------------------------------");
                respuesta1= entrada.nextInt();
             if(respuesta1==1){
                 System.out.println("ha comprado un paquete de margarita");
                 obj3.vendidos=1;
             }
             if(respuesta1==2){
                 System.out.println("cuantos desea agregar: ");
                 num= entrada.nextInt();
                 num=obj3.agregados;
             }
              break; 
            case 4:
            Producto obj4=new Producto("Chocorramo", 1500, 10);
              obj4.precioTotal();
              System.out.println(obj4.precioTotal);
              System.out.println("\nProblema: "+obj4.datos()+"\n");
              System.out.println("---------------------------------");
                System.out.println("¿1.desea comprar un paquete?");
                System.out.println("¿2.desea insetar paquete?");
                System.out.println("-------------------------------");
                respuesta1= entrada.nextInt();
             if(respuesta1==1){
                 System.out.println("ha comprado un paquete de margarita");
                 obj4.vendidos=1;
             }
             if(respuesta1==2){
                 System.out.println("cuantos desea agregar: ");
                 num= entrada.nextInt();
                 num=obj4.agregados;
             }
       
            break;
                
        }
        System.out.println("¿Desea volver al menu principal?");
         System.out.println(" Digite (n) para no o (s) para si");
         respuesta=entrada.next().charAt(0);
        }while(respuesta!='n' && respuesta!='N');
    }
}
   
    

