package lista_1.ex1;

//TODO:
// Jogar as pessoas + churrasco em um vetor e implementar um loop for/foreach na hora de imprimir

public class Main {
    public static void main(String[] args) {

        //Instanciando classe pessoa
        Pessoa pessoa1 = new Pessoa("Henrique","Masculino", 31, false);
        Pessoa pessoa2 = new Pessoa("Beatriz", "Feminino", 29, true);
        Pessoa pessoa3 = new Pessoa("Valentina", "Feminino", 12, false);
        Pessoa pessoa4 = new Pessoa("Enzo", "Masculino", 11, false);
        Pessoa pessoa5 = new Pessoa("Alice", "Feminino", 2, false);

        //instanciando classe Churrasco
        Churrasco churras = new Churrasco();

        //imprimindo
        System.out.println(pessoa1.toString());
        churras.verificarConsumo(pessoa1);

        System.out.println(pessoa2.toString());
        churras.verificarConsumo(pessoa2);

        System.out.println(pessoa3.toString());
        churras.verificarConsumo(pessoa3);

        System.out.println(pessoa4.toString());
        churras.verificarConsumo(pessoa4);

        System.out.println(pessoa5.toString());
        churras.verificarConsumo(pessoa5);


    }
}
