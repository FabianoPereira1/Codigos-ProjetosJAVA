import java.util.Scanner;

public class MainPodeDirigir{

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite sua idade");
		int idade = teclado.nextInt();
		
		if(idade>=18)
			System.out.println("pode dirigir");
		else
			System.out.println("nao pode dirigir");
        
    }
}