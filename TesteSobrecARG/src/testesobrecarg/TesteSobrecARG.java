
package testesobrecarg;

import javax.swing.JOptionPane;

public class TesteSobrecARG {
    public static void main(String[] args) {
       double n1, n2, n3, maior;
       n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro numero: "));
       n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segunda numero: "));
       
      ExemploSobrecarga e1 = new ExemploSobrecarga();
      maior = e1.calcularNumeroMaior(n1, n2);
       JOptionPane.showMessegeDialog(null, "Maior numero digitado: " +  maior);
       
       n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro numero: "));
       n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segunda numero: "));
      n3 = Double.parseDouble(JOptionPane.showInputDialog("Digite o terceiro nuero"));
  
        ExemploSobrecarga e2 = new ExemploSobrecarga();
       maior = e2.calcularNumeroMaior(n1 , n2, n3);
       JOptionPane.showMessegeDialog(null, "Maior numero digitado: " +  maior);
    }
    
}
