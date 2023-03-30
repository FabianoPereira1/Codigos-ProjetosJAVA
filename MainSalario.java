import java.util.Scanner;

public class MainSalario {
    public static void main(String[] args){
		
		Scanner teclado = new Scanner(System.in);
    
    
    
        System.out.println("Informe seu nome:");
		String nome = teclado.next(); 
		System.out.println("Horas diarias de trabalho:");
		String HDT = teclado.next();
		double h = Double.parseDouble(HDT);
		System.out.println("Informe o seu salario:");
		String salario = teclado.next();
		double s = Double.parseDouble(salario);

        double horasSemanais = h*6;
        double horasMensais = horasSemanais*5;
        double valorDaHora = s/horasMensais;

        System.out.printf("%s você ganha %.2f por cada hora trabalhada", nome, valorDaHora);

        

    }
}
