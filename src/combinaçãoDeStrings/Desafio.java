package combinaçãoDeStrings;

import java.util.Scanner;

public class Desafio {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int N = leitor.nextInt();
		leitor.nextLine();
		for (int i = 0; i < N; i++) {
			String[] Separado = leitor.nextLine().split("[^\\w]+");
			String resultado = combina(Separado[0],Separado[1]);
			System.out.println(resultado);
		}
		leitor.close();
	}
	public static String combina(String a, String b){
		char[] Primeiro =a.toCharArray(); 
		char[] Segundo =b.toCharArray();
		String combinado = "";
		
		if (Primeiro.length>=Segundo.length) {
			for(int J = 0; J < Primeiro.length; J++ ) {
				if(J>=Segundo.length) {
					combinado += Primeiro[J];
				}else {
					combinado += Primeiro[J];
					combinado += Segundo[J];	
				}
				
			}	
		}else{
			for(int J = 0; J < Segundo.length; J++ ) {
				if(J>=Primeiro.length) {
					combinado += Segundo[J];
				}else {
					combinado += Primeiro[J];
					combinado += Segundo[J];	
				}
				
			}
		}
		
		
	return combinado;
	}

}