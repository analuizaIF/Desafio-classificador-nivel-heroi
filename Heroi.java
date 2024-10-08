package desafio_Heroi;
import java.util.Scanner;

//tal codigo nao possui verificacao caso o valor XP seja negativo
public class Heroi {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//Variaveis
		System.out.print("Digite seu nome: ");
		String nome = scanner.next();
		
		System.out.print("Digite sua quantidade de XP: ");
		double xp =  scanner.nextDouble();
		
		//Declarando variavel de niveis
		String nivel_xp;
		
		//Eestrutura de condicao e operadores logicos
		if (xp < 1000) {
			nivel_xp = "Ferro";
		} else if (xp >= 1001 && xp <= 2000) {
			nivel_xp = "Bronze";
		} else if (xp >= 2001 && xp <= 5000){
			nivel_xp = "Prata";
		} else if (xp >= 5001 && xp <= 7000) {
			nivel_xp = "Ouro";
		} else if (xp >= 7001 && xp <= 8000) {
			nivel_xp = "Platina";
		} else if (xp >= 8001 && xp <= 9000) {
			nivel_xp = "Ascendente";
		} else if (xp >= 9001 && xp <= 10000) {
			nivel_xp = "Mortal";
		} else {
			nivel_xp = "Radiante";
		}

		//Saida
		System.out.print("==== Classificador de Nível de Heroí(na) ===");
		System.out.print("\nO(A) Heroí(na) "+ nome + ", está no nível XP: "+ nivel_xp);
		System.out.print("\n============================================");
	}

}
