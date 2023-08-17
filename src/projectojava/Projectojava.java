
package projectojava;

import java.util.Scanner;

public class Projectojava {

    public static void main(String[] args) {
        int n1, n2, suma, resta, operacion;
        Scanner teclado = new Scanner(System.in);
        
        while(true){
            System.out.println("SUMA==1 ");
            System.out.println("RESTA==2 ");
            System.out.print("Ingresa la opcion -> ");
            operacion = teclado.nextInt();

            if (operacion == 1){
                System.out.print("Introdusca el primer numero: ");
                n1 = teclado.nextInt();
                System.out.print("Introdusca el segundo numero: ");
                n2 = teclado.nextInt();

                suma = n1 + n2;
                System.out.println("la suma es "+ suma);
                break;
                
            }else if(operacion == 2){
                System.out.print("Introdusca el primer numero: ");
                n1 = teclado.nextInt();
                System.out.print("Introdusca el segundo numero: ");
                n2 = teclado.nextInt();

                resta = n1 - n2;
                System.out.println("la resta es "+ resta);
                break;
                
            }else{
                System.out.println("ESCOJA EL NUMERO CORRECTO");
            }
        }
        
    }
    
}
