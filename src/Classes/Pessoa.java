package Classes;

public class Pessoa {
        private String nome;
        private int idade;
        private float peso;
        private float altura;

        // aqui criamos todos os atributos da classe classes.pessoa


        public Pessoa(String n, Integer i, Float p, Float a){   // O construtor está recebendo como paramentro todos os atributos da classe

            this.setNome (n);     // aqui no lugar de recebermos os atributos, ja usamos os metodos modificadores
            this.setIdade(i);
            this.setPeso(p);
            this.setAltura(a);

            apresentar();
        }

        // os metodos Getters e Setters servem como proteção dos atributos das classes
        // para nao mecher diretamente nos atributos

        public String getNome(){
            return this.nome;
        }

        public void setNome(String n ){
            this.nome=n;
        }

        public Integer getIdade(){
            return this.idade;
        }

        public void setIdade(Integer i){
            this.idade=i;
        }

        public Float getPeso() {
            return this.peso;
        }

        public void setPeso(Float p){
            this.peso=p;
        }

        public Float getAltura(){
            return this.altura;
        }

        public void setAltura(Float a){
            this.altura=a;
        }

        // um metodo para mostrar todas as informaçoes do objeto

        public void apresentar(){
            System.out.println("Dados coletados:  " + this.getNome()); // no metodo de apresentação do objeto, usamos o metodo acessor para nao precisarmos usar o atributo direto
            System.out.println("Idade: " + this.getIdade());
            System.out.println("Peso: " + this.getPeso());
            System.out.println("Altura: " + this.getAltura());
            System.out.println("---------------------------------------------------------------------------------------");
        }
}