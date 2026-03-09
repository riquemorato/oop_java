package lista_1.ex1;

public class Pessoa {
    private String nome;
    private String sexo;
    private int idade;
    private boolean vegetariana;

    //Constructor
    public Pessoa (String nome, String sexo, int idade, boolean vegetariana) {
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
        this.vegetariana = vegetariana;
    }

    //Getters and Setters
    public int getIdade() {
        return idade;
    }

    public boolean isVegetariana() {
        return vegetariana;
    }

    //Methods
    @Override
    public String toString(){
        return "Nome: " + nome +
                ", idade: " + idade +
                ", sexo: " + sexo +
                ", vegeratiana: " + vegetariana;
    }
}
