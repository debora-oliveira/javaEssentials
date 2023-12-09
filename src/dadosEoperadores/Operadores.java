package dadosEoperadores;

public class Operadores {

	public static void main(String[] args) {
		System.out.println("Operador de atribuição");
		int idade = 25;
		System.out.println("valor atribuido "+idade);				
		
		System.out.println("Operadores matemáticos");
		int soma = idade +5;
		System.out.println("soma "+soma);
		
		int multiplicacao = soma *2 ;
		System.out.println("multiplicação "+ multiplicacao);
		
		int divisao = multiplicacao / 2 ;
		System.out.println("divisao "+ divisao);
		
		int mod = divisao%4;
		System.out.println("modulo "+ mod);
		
		System.out.println("Incremento e decremento");
		int incremento =15;
		System.out.println("valor original "+incremento);
		incremento++;
		System.out.println("valor após incremento "+incremento);
		
		int decremento =15;
		System.out.println("valor original "+decremento);
		decremento--;
		System.out.println("valor após decremento "+decremento);
		
		System.out.println("Operadores de igualdade");
		long valor1 = 1L;
		long valor2 = 2L;
		if(valor1 == valor2) {
			System.out.println("valores iguais");
		}else{
			System.out.println("valores diferentes");
		}
		
		long valor3 = 2L;
		if(valor3 != valor2) {
			System.out.println("valores diferentes");
		}else{
			System.out.println("valores iguais");
		}
		
		if(valor2 > valor1) {
			System.out.println(valor2+" é maior que "+valor1);
		}
		if(valor1 < valor3) {
			System.out.println(valor1+" é menor que "+valor3);
		}
		if(valor3 >= valor2) {
			System.out.println(valor3+" é maior ou igual que "+valor2);
		}
		if(valor1 <= valor3) {
			System.out.println(valor1+" é menor ou igual que "+valor3);
		}
		
		System.out.println("Operadores lógicos");
		
		boolean verdadeiro = true;
		boolean falso = false;
		
		System.out.println(verdadeiro || falso);
		System.out.println(verdadeiro && falso);
		
	}

}
