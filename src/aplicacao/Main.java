package aplicacao;

import exercicios.Contabanco;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

       /* caneta c1 = new caneta();
        c1.modelo = "Bic";
        c1.cor = "Vermelho";
        c1.carga = 10;
        c1.tampa = true;
        c1.ponta = 0.5f;
        c1.destampar();
        c1.status();
        c1.rabiscar();
        c1.tampar();

        pessoa p1 = new pessoa("pedro",21,83.5f,1.79f);
        p1.apresentar();*/


        Contabanco pessoa1 = new Contabanco(001,"CC","Joao");
        pessoa1.abrirConta();
        pessoa1.depositar(100);
        pessoa1.pagarMensalidade();
        pessoa1.saldoDaConta();
        pessoa1.stadoDaConta();
    }
}