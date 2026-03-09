package lista_1.ex1;

//Summary:
//Classes responsável por calcular o consumo de carne das pessoas conforme a regra:
//      0 a 3 anos - não consome
//      vegetarianos - não consome
//      4 a 12 anos - 1 kg
//      13 acima - 2 kg

public class Churrasco {
    private double qtdCarne;

    //Constructor
    public Churrasco(double qtdCarne) {
        this.qtdCarne = qtdCarne;
    }

    public Churrasco() {}

    //Getters and Setters

    //Métodos
    public void verificarConsumo(Pessoa pessoa) {

        if(pessoa.isVegetariana() || pessoa.getIdade() <= 3) {
            this.qtdCarne = 0;
            System.out.println("Isento do consumo de carne. \n");
            return;
        }
        else if (pessoa.getIdade() >= 4 || pessoa.getIdade() <= 12) {
            this.qtdCarne = 1;
        }
        else if(pessoa.getIdade() > 12) {
            this.qtdCarne = 2;
        }

        System.out.println("Consumo de carne: \" + qtdCarne + \" quilos. \n");
    }
}
