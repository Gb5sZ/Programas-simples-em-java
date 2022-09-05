import java.util.Scanner;

public class graus{
	graus var = new graus();
	
	   public static void main(String[] args){
	  int opcao;
	  Scanner valor = new Scanner(System.in);
	      System.out.println("Digite 1 para converter radianos e 2 para converter graus");
	  opcao = valor.nextInt();
	  if(opcao==1){
		var x = new Scanner(System.in);	
	  float radianos;
		   System.out.println("Insira o valor em Radianos");
		radianos = x.nextFloat();

      float graus = (float) (radianos * (180 / Math.PI));
      System.out.println(+ radianos + "Radianos convertidos para graus é " + graus);
    
	  }else{         	
	    float graus;
		var x = new Scanner(System.in);	
		   System.out.println("Insira o valor em Graus");
		graus = x.nextFloat();		
	    double radianos = graus * (Math.PI / 180);
 
    System.out.println(+ graus + "Graus convertidos para Radianos é " + radianos);
	  }
  }
}
