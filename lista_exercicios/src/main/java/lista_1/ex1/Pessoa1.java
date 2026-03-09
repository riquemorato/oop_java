package lista_1.ex1;

//Summary:
//Classes responsável pelos atributos e métodos de um objeto do tipo Pessoa
//TODO: Reimplementar a classe Pessoa utilizando Records

//ESTA CLASSE FOI SUBSTITUIDA POR UM RECORD CHAMADO 'PESSOA'


public class Pessoa1 {
    private String nome;
    private String sexo;
    private int idade;
    private boolean vegetariana;

    //Constructor
    public Pessoa1(String nome, String sexo, int idade, boolean vegetariana) {
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
