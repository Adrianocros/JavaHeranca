public class Conta {/*Abstract não pode ser instanciada*/
    private int numero;
    private int agencia;
    private String banco;
    protected double saldo;/*protected para ser acessivel a todas que fazem parte da hierarquia*/


    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public double getSaldo(){
        return  this.saldo;
    };/*Abstract não pode haver retornos*/

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Conta(int numero, int agencia, String banco, double saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.banco = banco;
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "numero=" + numero +
                ", agencia=" + agencia +
                ", banco='" + banco + '\'' +
                ", saldo=" + saldo +
                '}';
    }

    public boolean sacar(double quantia){
        return false;
    };

    public void depositar(double qunatia){
        this.saldo += qunatia;
    }


}
