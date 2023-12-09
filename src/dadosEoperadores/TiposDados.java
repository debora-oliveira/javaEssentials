package dadosEoperadores;

public class TiposDados {

	public static void main(String[] args) {
		
System.out.println("Dados primitivos");
		
		//valores inteiros ou negativos,usa 8bits, máx 127 e min -128
		byte meuByte = 127;
		
		System.out.println("byte "+ meuByte );
		
		//16 bits, min -32768 e max37767
		short meuShort = 32767;
		System.out.println("short "+ meuShort );
		
		//usa 32 bits, min -2147483648 e max 2147483647
		int idade = 27;
		System.out.println("int "+ idade );
		
		//64 bits
		long meuLong = 10L;
		System.out.println("long "+ meuLong );
		
		//dupla precisão, 64 bits
		double altura = 1.64;
		System.out.println("double "+ altura );
		
		//precisão simples, 32bits
		float salarioFloat = 800.50F;
		System.out.println("float "+ salarioFloat );
		
		//caracter Unicode, requer 16 bits 
		char letra = 'a';
		System.out.println("char "+ letra );
		
		//usa 1 bit
		boolean javaELegal = true;
		System.out.println("boolean "+ javaELegal );

	}

}
