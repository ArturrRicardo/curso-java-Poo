package exercicios;

public class Contabanco {
    public int numconta;
    protected String tipodaconta;
    private String nome;
    private float saldo;
    private boolean status;

    public Contabanco(int num, String tipo, String n){ //nosso construtor esta recebendo os valores necessarios para estanciar um objeto

        tipo = tipo.toUpperCase();
        this.setNumconta(num);
        this.setTipodaconta(tipo);
        this.setNome(n);

        setStatus(false);
        setSaldo(0);
    }

    public int getNumconta(){
        return this.numconta;
    }
    public void setNumconta(int n){
        this.numconta=n;
    }

    public String getTipodaconta(){
        return this.tipodaconta;
    }
    public void setTipodaconta(String t){
        this.tipodaconta=t;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSaldo() {
        return this.saldo;
    }

    public void setSaldo(float s) {
        this.saldo=s;
    }

    public boolean getStatus(){
        return this.status;
    }
    public void setStatus(boolean st){
        this.status=st;
    }


    public void abrirConta(){ // aqui estamos forçando para que o objeto use o metodo para abrir a conta
        if(getTipodaconta().equals("CC")){
            setSaldo( getSaldo() + 50 );
            setStatus(true);
            System.out.println("Conta aberta com sucesso\n Adicionamos um bonus de R$ 50,00 a sua conta corrente");
        }
        else if (getTipodaconta().equals("CP")){
            setSaldo(getSaldo() + 150);
            setStatus(true);
            System.out.println("Conta aberta com sucesso\n Adicionamos um bonus de R$150,00 a sua conta poupança");
        }else{
            System.out.println(" Tipo de conta invalido. favor informar\n conta corrente: ( CC ) \n conta poupança: ( CP )");
        }
    }


    public void fecharConta(){ // se ele qusier fechar a conta usa este metodo
        if(getSaldo()>0){
            System.out.println(" Realize o saque para fechar a conta ");

        }else if (getSaldo()<0){
            System.out.println("Realize o pagamento em debito para fechar a conta ");
        }else{
            System.out.println("Conta fechada com sucesso");
            setStatus(false);
        }
    }

    public void depositar(float valor ){//metodo de depositar um valor
        if (getStatus( ) == false){
            System.out.println(" Esta conta esta fechada ");
        }else{
            setSaldo(getSaldo()+ valor);
            System.out.println(" Recebemos um deposito na conta de : " + this.getNome());
        }

    }
    public void sacar(float valor){//metodo sacando um valor
        if(valor>getSaldo()){
            System.out.println("Saldo insuficiente para saque ");
        }else{
            setSaldo(getSaldo()-valor);
        }
    }

    public void pagarMensalidade(){ // metodo de mensalidade do banco
        if(getTipodaconta().equals("CC")){
            if(getSaldo()>=12){
                setSaldo(getSaldo()-12);
                System.out.println("Mensalidade paga! ");

            }else{
                System.out.println("Saldo insuficiente para realizar pagamento da mensalidade ");
            }
        } else if (getTipodaconta().equals("CP")){
            if (getSaldo()>=20){
                setSaldo(getSaldo()-20);
                System.out.println("Mensalidade paga ! ");
            }else {
                System.out.println("Saldo insuficiente para realizar pagamento da mensalidade ");
            }

        }

    }

    public void stadoDaConta(){
        System.out.println(" Conta : " + getNumconta());
        System.out.println("Tipo de conta   : " + getTipodaconta());
        System.out.println("Nome : " + getNome());
        System.out.println("Saldo: " + getSaldo() );
        System.out.println("Status da conta: " + getStatus());
    }

    public void saldoDaConta(){ // acessando o saldo
        System.out.println("O seu saldo é de R$"+getSaldo());
    }


}
