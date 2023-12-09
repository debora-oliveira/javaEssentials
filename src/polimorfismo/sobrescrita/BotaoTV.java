package polimorfismo.sobrescrita;

public class BotaoTV extends Botao{

    @Override
    public void ligar() {

        System.out.println("ligando a tv");
    }

    @Override
    public void desligar() {
        System.out.println("chega de tv por hoje, vai descansar");
    }
}
