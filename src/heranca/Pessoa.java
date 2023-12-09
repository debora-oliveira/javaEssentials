package heranca;

public class Pessoa {

	 public static void main(String[] args) {

	        PessoaDevBackend pessoaDesenvolderaBackend =
	                new PessoaDevBackend("kamilabackend", "java e spring", 20000.0);
	        pessoaDesenvolderaBackend.codar();



	        PessoaDevFrontEnd pessoaDesenvolvedoraFrontEnd =
	                new PessoaDevFrontEnd("kamilafrontend", "javascript e angular", 10000.0);
	        pessoaDesenvolvedoraFrontEnd.codar();


	    }

}
