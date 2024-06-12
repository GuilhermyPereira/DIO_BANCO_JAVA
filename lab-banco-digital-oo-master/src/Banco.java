import java.util.ArrayList;
import java.util.List;

public class Banco {

    private String nome;
    private List<Conta> contas;

    public Banco() {
        this.contas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }
    
    // Add a new account to the bank
    public void adicionarConta(Conta conta) {
        this.contas.add(conta);
    }

    // List all accounts in the bank
    public void listarContas() {
        System.out.println("=== Lista de Contas ===");
        for (Conta conta : contas) {
            System.out.println(String.format("Titular: %s | Agencia: %d | Numero: %d | Saldo: %.2f",
                    conta.cliente.getNome(), conta.getAgencia(), conta.getNumero(), conta.getSaldo()));
        }
    }
    
    public double getSaldoTotal() {
        double saldoTotal = 0;
        for (Conta conta : contas) {
            saldoTotal += conta.getSaldo();
        }
        return saldoTotal;
    }
    
    public Conta encontrarContaPorNumero(int numero) {
        for (Conta conta : contas) {
            if (conta.getNumero() == numero) {
                return conta;
            }
        }
        return null;
    }

    public void imprimirExtratos() {
        System.out.println("=== Extratos do Banco ===");
        for (Conta conta : contas) {
            conta.imprimirExtrato();
        }
    }
}
