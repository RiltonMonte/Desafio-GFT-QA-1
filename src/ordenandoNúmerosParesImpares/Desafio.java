package ordenandoNúmerosParesImpares;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Desafio {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int N = leitor.nextInt();
		List<Integer> listaPar = new ArrayList<>();
		List<Integer> listaImpar = new ArrayList<>();
		
		for (int i = 0; i < N; i++) {
			int E = leitor.nextInt();
			if(E%2==0) {
				listaPar.add(E);
			}else listaImpar.add(E);
		}
		Collections.sort(listaPar);
		Collections.sort(listaImpar);	

		for(int i = 0; i <= (listaPar.size()-1); i++) {
			System.out.println(listaPar.get(i));
			}
		
		for(int i = (listaImpar.size()-1); i >= 0; i--) {
			System.out.println(listaImpar.get(i));
			}
		}

}
