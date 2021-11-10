public class ContaCorrente extends Conta implements Tributavel {

    private double chequeEspecial;

    public ContaCorrente(int numero, int agencia, String banco, double saldo, double chequeEspecial) {
        super(numero, agencia, banco, saldo);
        this.chequeEspecial = chequeEspecial;
    }

    @Override
    public String toString() {
        return super.toString() + "ContaCorrente{" +
                "chequeEspecial=" + chequeEspecial +
                '}';
    }

    @Override
    public boolean sacar(double quantia){
        double disponivel = this.chequeEspecial + this.saldo;
        if(quantia > disponivel){
            System.out.println("Sera aplicado imposto ");
            this.saldo -= quantia;
            return true;
        }else{
            this.saldo -= quantia;
            return false;
        }
    }

    public double getSaldo(){
        return this.chequeEspecial + this.saldo;
    }


    @Override
    public double getValorImposto() {
        return this.getSaldo() * 0.10;
    }
}
