package Classes;

public class Paciente {

    private String nome;
    private int idade;
    private float pesoKg;
    private float altura;

    public Paciente( String n, int i, float p,float a ){
        this.setNome(n);
        this.setIdade(i);
        this.setPesoKg(p);
        this.setAltura(a);
    }


    public String getNome(){
        return this.nome;
    }
    public void setNome(String n ){
        this.nome=n;
    }
    public int getIdade(){
        return this.idade;
    }
    public void setIdade(int i){
        this.idade=i;
    }
    public float getPesoKg(){
        return this.pesoKg;
    }
    public void setPesoKg(float p ){
        this.pesoKg=p;
    }
    public float getAltura(){
        return this.altura;
    }
    public void setAltura(float a){
        this.altura=a;
    }

    public  void calcularIMC(){
        float imc = getPesoKg() / (getAltura() * getAltura());
        System.out.println("IMC: " + imc );
    }


    public void verificarIdade(){
        if (getIdade()>=0 && getIdade()<=12){
            System.out.println("Criança");
        }
        else if (getIdade()>=13 && getIdade()<=17) {
            System.out.println("Adolescente");

        } else if (getIdade()>=18 && getIdade()<=59) {
            System.out.println("Adulto");
        }else{
            System.out.println("Idoso");
        }
    }

    public void exibirFicha(){
        System.out.println("==============informaçoes===============".toUpperCase());
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade()) ;
        System.out.println("Peso: " + getPesoKg() + "Kg");
        System.out.printf("Altura: %.2f%n", getAltura());
    }

}
