package banco;
import java.util.Scanner;

public class TesteBanco {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        Banco tecBanco = new Banco();
        
        System.out.println("MENU\n" +
                            "(1) Criar nova conta no banco\n" +
                            "(2) Soma dos saldos das contas \n" +
                            "(3) Informações do banco\n" +
                            "(4) Sair\n" +
                            "Escolha uma opção: _");
        int op = s.nextInt();
        if (op == 1){
            System.out.println("Para criar uma conta uma conta, insira o nome e o saldo inicial: ");
            tecBanco.criarConta(s.next(), s.nextDouble());
        }
        else if (op == 2){
            System.out.println("Soma do saldo das contas: ");
            tecBanco.getSomaSaldos();
        }     
        else if (op == 3){
            System.out.println("Informações do banco: ");
            tecBanco.toString();
        }
        else{
            System.out.println("Saindo...");
        }
        
    }
}
