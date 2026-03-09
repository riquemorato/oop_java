package lista_1.ex1;

//TODO:
// Jogar as pessoas + churrasco em um vetor e implementar um loop for/foreach na hora de imprimir

public class Main {
    public static void main(String[] args) {

        Pessoa pessoas[] = new Pessoa[5];
        //Instanciando classe pessoa
        pessoas[0] = new Pessoa("Henrique","Masculino", 31, false);
        pessoas[1] = new Pessoa("Beatriz", "Feminino", 29, true);
        pessoas[2] = new Pessoa("Valentina", "Feminino", 12, false);
        pessoas[3] = new Pessoa("Enzo", "Masculino", 11, false);
        pessoas[4] = new Pessoa("Alice", "Feminino", 2, false);

        //instanciando classe Churrasco
        Churrasco churras = new Churrasco();

        //imprimindo
        for(int i = 0; i < 5; i++) {
            System.out.println(pessoas[i].toString());
            churras.verificarConsumo(pessoas[i]);
        }
    }
}
