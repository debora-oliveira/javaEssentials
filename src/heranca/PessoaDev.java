package heranca;

public class PessoaDev {

    private String nome;
    private String stack;
    private Double salario;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getStack() {
        return stack;
    }

    public void setStack(String stack) {
        this.stack = stack;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }


    public PessoaDev(String nome, String stack, Double salario) {
    }

    public void codar() {
        System.out.println("bora codar" );
    }

}