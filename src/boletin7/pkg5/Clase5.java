
package boletin7.pkg5;

import javax.swing.JOptionPane;

/**
 *
 * @author Javii
 */
public class Clase5 {
   static public int pedirNumeroMaior(){
   int numero;
   String res = JOptionPane.showInputDialog("Teclea los Numeros :");
   numero=Integer.parseInt(res);
   return numero;
}
   static public void numeromaior (int num1,int num2,int num3){
           if (num1>num2)
           System.out.println("Maior :"+num1);
           else if (num2>num3)
           System.out.println("Maior :"+num2);
           else if (num3>num1)
           System.out.println("Maior :"+num3);
}
}
