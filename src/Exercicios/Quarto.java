package Exercicios;
import Interfaces.Reservas;  // aqui importamos a interface pois esta em outro pacote

public class Quarto implements Reservas { // implementa a interface a classe

    private int numero;
    private String nome;
    private String tipoDeQuarto;
    private float precoPorNoite;
    private int dias ;
    private boolean ocupado;

    public Quarto ( int numero, String tipoQuarto){  // construtor que recebe o numero do quarto e ja o habilita para o atributo e ja verifica o tipo de quarto ja retornando o valor p atributo

        this.setNumero(numero);
        tipoQuarto = tipoQuarto.toUpperCase();
        setTipoDeQuarto(tipoQuarto);
        if (getTipoDeQuarto().equals("SIMPLES")){
            this.setPrecoPorNoite(100);
        }
        else if (getTipoDeQuarto().equals("DUPLO")) {
            this.setPrecoPorNoite(250);
        } else if (getTipoDeQuarto().equals("SUITE")) {
            this.setPrecoPorNoite(380);
        }
    }



    public int getNumero(){
        return this.numero;
    }
    public void setNumero(int n ){
        this.numero=n;
    }

    public String getNome(){
        return this.nome;
    }
    public void setNome(String n ){
        this.nome=n;
    }

    public String getTipoDeQuarto(){
        return this.tipoDeQuarto;
    }
    public void setTipoDeQuarto(String tipo){
        this.tipoDeQuarto=tipo;
    }

    public float getPrecoPorNoite(){
        return this.precoPorNoite;
    }
    public void setPrecoPorNoite(float preco){
        this.precoPorNoite=preco;
    }

    public int getDias(){
        return this.dias;
    }
    public void setDias(int d ){
        this.dias = d;
    }

    public boolean getOcupado(){
        return this.ocupado;
    }
    public void setOcupado(boolean o){
        this.ocupado=o;
    }

    public int calcularTotal(){  // aqui calculamos o total dos dias hospedados no hotel
        int diaria=0;
        int soma=0;
        int dias = getDias();
        if (getTipoDeQuarto().equals("SIMPLES")){
            diaria=+100;
            soma=diaria*dias;
            return soma;
        } else if (getTipoDeQuarto().equals("DUPLO")){
            diaria =250;
            soma=diaria*dias;
            return soma;
        }else if (getTipoDeQuarto().equals("SUITE")){
            diaria=380;
            soma=diaria*dias;
            return soma;
        }
        return 0;
    }

    public void situacaDoQuarto(){  // aqui mostramos toda a informação da situação do quarto no momento
        System.out.println("-------------informação------------------".toUpperCase());
        System.out.println("Numero do quarto: " + getNumero());
        System.out.println("Tipo de quarto: " + getTipoDeQuarto());
        System.out.println(" Preço por noite: " + getPrecoPorNoite());
        System.out.println("Esta oculpado ? " + getOcupado());
    }

    @Override
    public void fazerCheckin(String nomeHospede, int dias) { // o checkout recebe como parametro o nome do hospede e o dias para realizar hospedagem
        if (getOcupado() == false){
            setNome(nomeHospede);                 // nosso metodo recebe o nome do hospede e atualiza o atributo da classe
            setDias(dias);                       // aqui realizamos a mesma situação do atributo nome porem com atributo dias
            setOcupado(true);                   // apos o checkin atualizamos o nosso quarto para a situação ocupada
            System.out.println("Boas vindas senhor(a) " + getNome() + " ao nosso hotel ");
        }else {
            System.out.println("Infelizmente o quarto nao está disponivel");
        }

    }

    @Override
    public void fazerCheckout() {  // o checkout realiza a saida do hospede e faz os calculos para a realização do pagamento do uso do hotel
        if(getOcupado()){    // atualizamos todos os atributos para deixar o quarto disponivel para outro hospede
            setOcupado(false);
            setNome(" ");
            System.out.println("=====Resumo da hospedagem =========".toUpperCase());
            System.out.println("O valor total da hospedagem é: " + calcularTotal());
            setDias(0);
        }else{
            System.out.println("Quarto vazio ");
        }
    }
}
