package exercTI2;
import java.util.*;

class SomarDoisNumeros {
	public static Scanner sc = new Scanner(System.in);
	
	
	
	public static void main(String args[]) {
		//declaração de variaveis
		int num1, num2, soma;
		
		//leituras
		System.out.println("Digite um numero");
		num1 = sc.nextInt();
		System.out.println("Digite outro numero");
		num2 = sc.nextInt();
		
		//somar
		soma = num1 + num2;
		
		//mostrar na tela
		System.out.println("Soma:"+soma);
	}
}
