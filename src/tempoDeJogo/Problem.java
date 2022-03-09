package tempoDeJogo;
import java.util.Scanner;

public class Problem {
	public static void main(String[] args){
		
               //complete os espaços em branco com sua solução para o problema           

                Scanner scan = new Scanner(System.in);
		int inicio, fim, horas;
		inicio = scan.nextInt();
		fim = scan.nextInt();
		horas = 24-(inicio - fim)              ;

		if(horas == 24){
			System.out.print("O JOGO DUROU 24 HORA(S)\n");
		}else if(horas<24){
			System.out.print("O JOGO DUROU " + (horas) + " HORA(S)\n");
		}else if(horas>24){
			System.out.print("O JOGO DUROU " + (horas-24) + " HORA(S)\n");

		}		
	}
}