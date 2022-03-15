package aRespostaDeTheon;

import java.io.IOException;
import java.util.Scanner;

public class Resposta{
	
    public static void main(String[] args) throws IOException {
		Scanner leitor = new Scanner(System.in);
		int N = leitor.nextInt();
		int T, menor = 20, posMenor = 1;
		for (int I=1;I<=N;I++) {
			T = leitor.nextInt();
			if (T<menor) {
				posMenor=I;
				menor=T;
			} else if (T==menor) {
				menor=T;
			}
		}
		System.out.println(posMenor);
    }
	
}
