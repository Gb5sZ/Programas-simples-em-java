import javax.swing.JOptionPane;
public class Triangulo {	
 public int formaTriangulo(int ladoA, int ladoB, int ladoC){
 if(ladoA<ladoB+ladoC && ladoB<ladoA+ladoC && ladoC<ladoA+ladoB)
 return 0;
 else
 return 1;
 }
 public void tipoTriangulo(int ladoA, int ladoB, int ladoC){
 if(ladoA==ladoB && ladoA==ladoC)
 JOptionPane.showMessageDialog(null, "triângulo equilátero");
 else{
 if(ladoA==ladoB || ladoA==ladoC || ladoB==ladoC)
 JOptionPane.showMessageDialog(null, "triângulo isósceles");
 else
 JOptionPane.showMessageDialog(null, "triângulo escaleno");
 }
 }
}
