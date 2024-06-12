
public class Main {

	public static void main(String[] args) {
		Cliente venilton = new Cliente();
		venilton.setNome("Venilton");
		Cliente guilhermy = new Cliente();
		guilhermy.setNome("Guilhermy");
		
		Conta cc = new ContaCorrente(venilton);
		Conta poupanca = new ContaPoupanca(venilton);
		Conta cc1 = new ContaCorrente(guilhermy);
		Conta poupanca1 = new ContaPoupanca(guilhermy);
		Banco banco = new Banco();
		banco.adicionarConta(cc);
        banco.adicionarConta(poupanca);
		banco.adicionarConta(cc1);
        banco.adicionarConta(poupanca1);
        banco.setNome("Banco XYZ");


        // List all accounts in the bank
        banco.listarContas();

        // Get the total balance of all accounts in the bank
        double saldoTotal = banco.getSaldoTotal();
        System.out.println(String.format("Saldo Total do Banco: %.2f", saldoTotal));

        // Find an account by its number
        Conta contaEncontrada = banco.encontrarContaPorNumero(cc.getNumero());
        if (contaEncontrada != null) {
            System.out.println("Conta encontrada:");
            contaEncontrada.imprimirExtrato();
        } else {
            System.out.println("Conta não encontrada.");
        }

        // Print statements for all accounts in the bank
        banco.imprimirExtratos();
    }

}
