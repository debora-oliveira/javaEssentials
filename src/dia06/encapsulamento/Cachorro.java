package dia06.encapsulamento;

public class Cachorro {
	private Double peso;
    private Integer idade;

    public Double pesopublic;
    public Integer idadePublic;

    protected Double pesoProtected;
    protected Integer idadeProtected;


    public void latir() {
    	System.out.println("AuAU");
        
        
    }

    protected void dormir() {
    	System.out.println("zzzzz");
        
        
    }

    private String comer() {
    	return "hora da racao";

    }
}
