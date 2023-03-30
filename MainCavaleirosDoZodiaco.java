import java.util.Scanner;


public class MainCavaleirosDoZodiaco {

	public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um nome");
		String NDC = teclado.next();
		
		if(NDC.equals("Seiya"))
			System.out.println("Pegasus");
			else if(NDC.equals("Ikki"))
				System.out.println("Fenix");
			else if(NDC.equals("Shun"))
				System.out.println("Andromeda");
			else if(NDC.equals("Hyoga"))
				System.out.println("Cisne");
			else if(NDC.equals("Shiryu"))
				System.out.println("Dragao");
			else
				System.out.println("nome nao reconhecido");
    }

    
}
