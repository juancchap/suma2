
package suma2;
import javax.swing.JOptionPane;
public class Suma2 {

   
    public static void main(String[] args) {
    int n1,n2,resultado;
    n1= Integer.parseInt(JOptionPane.showInputDialog("Ingresa la primera cantidad"));
    n2= Integer.parseInt(JOptionPane.showInputDialog("Ingresa la segunda cantidad"));
    resultado = n1+ n2;
     JOptionPane.showMessageDialog(null, "El resulta es:  " + resultado);
    
    
    }
    
}
