package banco;

public class Banco {
    private String nome;
    private int numContas;
    private ContaBancaria[] contas;
    
    public Banco(){
        
    }
    
    public Banco (String nome, int maxContas){
        this.nome = nome;
        this.numContas = maxContas;
    }
    
    public boolean criarConta(String correntista, double saldoInicial){
        int maxContas = 0;
        
        if(numContas<maxContas){
            return true;   
        }
        else
            return false;
    }
    
    public double getSomaSaldos(){
        
        
        return 0;
    }
    
    @Override
    public String toString(){
        String texto="";
        texto+=nome +"\t"+ numContas;
        for(int i=0;i<numContas;i++)
            texto+=contas[i].toString();
        return texto;  
    }
}