package banco;

public class ContaBancaria {
    protected String nomeCorrentista;
    protected double saldo;
    
    public ContaBancaria(){
        
    }
    
    public ContaBancaria(String nome){
        this.nomeCorrentista = nome;
    }
    public ContaBancaria(String nome, double saldo){
        this.nomeCorrentista = nome;
        this.saldo = saldo;
    }
    
    public double getSaldo(){
        return saldo;
    }
    
    public void depositar(double valor){
        saldo += valor;
    }
    
    public boolean sacar (double valor){
        if(valor <= saldo){
            saldo -= valor;
            return true;
        }
        else{
            return false;
        }
    }
    
    public String toString(){
        return "Nome: "+this.nomeCorrentista+"\n Saldo: "+this.saldo;
    }
}
