package desafio_Heroi;
import java.util.Scanner;

public class Heroi {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//VARIAVEIS
		System.out.print("Digite seu nome: ");
		String nome = scanner.next();
		
		System.out.print("Digite sua quantidade de XP: ");
		double xp =  scanner.nextDouble();
		
		//DECLARA VARIAVEL
		String nivel_xp;
		
		//ESTRUTURAS DE DECICOES E OPERADORES
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

		System.out.print("==== Classificador de Nível de Heroí(na) ===");
		System.out.print("\nO(a) Heroí(na) "+ nome + ", está no nível XP: "+ nivel_xp);
		System.out.print("\n============================================");
	}

}
