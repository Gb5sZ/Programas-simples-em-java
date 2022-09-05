import javax.swing.JOptionPane;
public class Interface {
 public static void main(String[] args) {
 Triangulo var = new Triangulo();
 int a,b,c,valor;
 String aux;
 aux=JOptionPane.showInputDialog("Entre com o primeiro lado");
 a=Integer.parseInt(aux);
 aux=JOptionPane.showInputDialog("Entre com o segundo lado");
 b=Integer.parseInt(aux);
 aux=JOptionPane.showInputDialog("Entre com o terceiro lado");
 c=Integer.parseInt(aux);
 valor=var.formaTriangulo(a,b,c);
 if(valor==0)
 var.tipoTriangulo(a,b,c);
 else
	 JOptionPane.showMessageDialog(null, "Não pode formar um triângulo");
 }
}

