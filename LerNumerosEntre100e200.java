import javax.swing.JOptionPane;

public class LerNumerosEntre100e200{

   public static void main (String [] args){
   
      int quantidade = 0;
   
      int valor = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));
   
      while (valor !=0){
         if((valor > 100) && (valor < 200)){
            quantidade += 1;
         }
         valor = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));
      }
      JOptionPane.showMessageDialog(null, String.format("Foram digitados %d valores", quantidade));
   }
}