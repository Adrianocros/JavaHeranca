public class ContaSalario extends Conta{

    private int quantidadedeSaques;

    public ContaSalario(int numero, int agencia, String banco, double saldo, int quantidadedeSaques) {
        super(numero, agencia, banco, saldo);
        this.quantidadedeSaques = quantidadedeSaques;
    }

    @Override
    public String toString() {
        return super.toString() + "ContaSalario{" +
                ", quantidadedeSaques=" + quantidadedeSaques +
                '}';
    }

    @Override
    public double getSaldo() {
        return this.saldo;
    }

    @Override
    public boolean sacar(double quantia) {
        if(quantia>saldo){
            System.out.println("Saldo insulficiente!");
            return false;
        }else{
            if(this.quantidadedeSaques >0){
                this.quantidadedeSaques--;
                this.saldo -= quantia;
                return true;
            }else {
                System.out.println("Limite de saques atingido, quantida não sacada R$ " + quantia);
                return false;
            }
        }
    }

}
