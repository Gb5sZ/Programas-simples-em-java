import javax.swing.JOptionPane;
public class DeclaracaoVariaveis {
 public static void main(String args[]){
 double n1,n2,n3,n4,media;
 int nome;
String auxx,String = null;
 System.out.println("Entre com o nome e as notas do Aluno");
 auxx=JOptionPane.showInputDialog("Nome do aluno");
 nome=Integer.parseInt(String);
 auxx=JOptionPane.showInputDialog("Primeira nota");
 n1=Integer.parseInt(auxx);
 auxx=JOptionPane.showInputDialog("Segunda nota");
 n2=Integer.parseInt(auxx);
 auxx=JOptionPane.showInputDialog("Terceira nota");
 n3=Integer.parseInt(auxx);
 auxx=JOptionPane.showInputDialog("Quarta nota");
 n4=Integer.parseInt(auxx);
 media = (n1+n2+n3+n4)/4;
 System.out.printf("A media de "+nome+" foi de %.2f\n",media);
 if   (media >= 6) {
	 System.out.print("Aprovado");
 }
 else{
	 System.out.println("Reprovado");
 }
		 
 }
}


