package banco;
import java.util.Scanner;

public class TestaConta {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ContaBancaria conta1 = new ContaBancaria();
        System.out.println("Nome: ");
        conta1.nomeCorrentista = s.next();
        System.out.println("Saldo: ");
        conta1.saldo = s.nextDouble();
        System.out.println("MENU\n" +
                            "(1) Depositar\n" +
                            "(2) Sacar\n" +
                            "(3) Saldo\n" +
                            "(4) Sair\n" +
                            "Escolha uma opção: _");
            int op = s.nextInt();
        while (op != 4){
            if (op == 1){
                System.out.println("Insira a quantidade que deseja depositar: ");
                conta1.depositar(s.nextDouble());
            }
            else if (op == 2){
                System.out.println("Insira a quantidade que deseja sacar: ");
                conta1.sacar(s.nextDouble());
            }     
            else if (op == 3){
                System.out.println(conta1.saldo);
            }
            else{
                System.out.println("Saindo...");
            } 
            System.out.println("MENU\n" +
                            "(1) Depositar\n" +
                            "(2) Sacar\n" +
                            "(3) Saldo\n" +
                            "(4) Sair\n" +
                            "Escolha uma opção: _");
            op = s.nextInt();
        }
    }
}
