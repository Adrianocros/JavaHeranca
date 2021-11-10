public class TestaConta {
    public static void main(String[] args) {

        Conta contas[] = new Conta[3];



        ContaPoupanca cp = new ContaPoupanca(22,1,"Itau",100,20,0.05);
        ContaCorrente cc = new ContaCorrente(21,1,"Itau",100,100);
        ContaSalario cs = new ContaSalario(23,1,"Itau",100,3);

        System.out.println("-----Conta Poupança----");
        System.out.println(cp);
        cp.depositar(100);
        cp.sacar(100);
        System.out.println("O Saldo atual é R$ "+ cp.getSaldo(19));
        System.out.println("----------------------------");

        System.out.println("-------Conta Corrente______");

        System.out.println(cc);
        cc.sacar(250);
        System.out.println("O Saldo em CC é com Imposto  R$ " + (cc.getSaldo()));
        System.out.println("----------------------------");

        System.out.println("-------Conta Salario______");
        System.out.println(cs);
        cs.sacar(10);
        cs.sacar(10);
        cs.sacar(10);
        cs.sacar(10);
        cs.sacar(10);
        cs.sacar(10);
        cs.sacar(10);
        System.out.println("O Saldo em CS é de R$ " + cs.saldo);
        System.out.println("----------------------------");



    }

}
