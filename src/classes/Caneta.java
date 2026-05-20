package classes;

public class Caneta {
    // estou criando os atributos ( caracteristicas que o objeto precisa ter)

    private String modelo;
    private String cor;
    private boolean tampa;
    private int carga;
    private float ponta;

    // aqui criamos todos os getter e seters de cada atributo

    public String getModelo(){
        return this.modelo;
    }
    public void setModelo(String m ){
        this.modelo = m ;
    }

    public String getCor (){
        return this.cor;
    }
    public void setCor(String c){
        this.cor = c;
    }

    public boolean getTampa(){
        return this.tampa;
    }
    public void setTampa(boolean t){
        this.tampa=t;
    }

    public int getCarga(){
        return this.carga;
    }
    public void setCarga(int c){
        this.carga=c;
    }

    public float getPonta(){
        return this.ponta;
    }
    public void setPonta(float p){
        this.ponta=p;
    }

    // abaixo eu crio os metodos ( o que o objeto faz )

    public void status(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: "+ this.cor);
        System.out.println("Tampa: " + this.tampa);
        System.out.println("Carga: " + this.carga);
        System.out.println("Ponta: " + this.ponta);
    }

    // o (this) e o nome do objeto que chamou, ou seja o this qunado criamos o objeto e substituido pelo nome do objeto criado

    public void tampar(){
        if (tampa==false){
            this.tampa = true;
        }
    }
    public void destampar(){
        if (tampa){
            this.tampa=false;
        }
    }
    public void rabiscar(){
        if (carga<=0){
            System.out.println("Error\n classes.caneta não possui carga");
        }
        System.out.println("Rabiscando com a classes.caneta " + this.modelo);
    }


    // Todos os  objetos são criados dentro do main

}

