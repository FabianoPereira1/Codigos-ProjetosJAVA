
import java.util.Scanner;

public class MainNomeMaiorValor{

	public static void main(String[] args){
		
		Scanner teclado = new Scanner(System.in);
        
        	String maior;
		
			System.out.println("Digite um nome");
			String no1 = teclado.next();
			System.out.println("Digite um nome");
			String no2 = teclado.next();
			System.out.println("Digite um nome");
			String no3 = teclado.next();
		
		
			if(no1.compareTo(no2)>0) {maior = no1;}
			else {maior = no2;}
		
			if(maior.compareTo(no3)>0) {maior = no3;}
			else {maior = no2;}
		
			System.out.println(maior);
    }
}