import javax.swing.JOptionPane;

public class MediaNumerosPositivos{

   public static void main (String [] args){
   
      int soma = 0;
      int contador = 0;
      
      int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));
      
      while (numero > 0){
         soma += numero;
         contador++;
         JOptionPane.showMessageDialog(null, String.format("media: %d", soma/contador));
      
         numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));
      }
   }
}