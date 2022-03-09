package encaixaNaoEncaixa;
import java.util.Scanner;

public class Problem {

	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		
		int count = scan.nextInt();
		
		for (int i = 0; i < count; i++) {
			//complete a resolução do problema com sua solução 
			int A = scan.nextInt();
			int B = scan.nextInt();
			
			boolean resultado = verifica(A,B);
		
			
			if (resultado==true) System.out.println("encaixa");
			else System.out.println("nao encaixa");
		}

	}
	public static boolean verifica(int A,int B) {
		String a = Integer.toString(A);
		String b = Integer.toString(B);
		if(A<=0 || B<=0) return false;
		int Digito = b.length();
		float sobra;
		float D = A-B;
		
		if(a.length()<b.length()) {
			return false;
		}else {
				int Contador = 0;
				do {
					Contador++;
					sobra = D%10;
					D=D/10;
					if (sobra != 0)	return false;
				   }while(Contador<Digito);
			}return true;
		}	
		
	}
