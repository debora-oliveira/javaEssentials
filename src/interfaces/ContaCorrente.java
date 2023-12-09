package interfaces;

class ContaCorrente implements Conta {

    @Override
    public void consultarSaldo() {
        System.out.println("seu saldo é 123499");
    }

    @Override
    public void fazerPix() {
        System.out.println("digite o valor que voce deseja transferir");

    }
}