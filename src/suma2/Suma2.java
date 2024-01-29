
package suma2;
//Importamos la libreria
import javax.swing.JOptionPane;
public class Suma2 {

   
    public static void main(String[] args) {
 //Declaramos las variables a usar
    int n1,n2,resultado;
 //le pedimos al usuario que nos diguite la primera cantidad
    n1= Integer.parseInt(JOptionPane.showInputDialog("Ingresa la primera cantidad"));
//le pedimos al usuario que nos diguite la segunda cantidad
    n2= Integer.parseInt(JOptionPane.showInputDialog("Ingresa la segunda cantidad"));
//mrealisamos la suma de nuestras variables n1 y n2
    resultado = n1+ n2;
//imprimimos en un cuadro de texto el resultado
     JOptionPane.showMessageDialog(null, "El resultado es de :  " + resultado);
    
    
    }
    
}
