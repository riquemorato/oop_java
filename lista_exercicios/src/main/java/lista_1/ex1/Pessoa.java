package lista_1.ex1;

public record Pessoa(String nome, String sexo, int idade, boolean vegetariana) {

    //Validação de idade
    public Pessoa {
        if(idade < 0){
            throw new IllegalArgumentException("A idade não pode ser negativa!");
        }
    }

    @Override
    public String toString(){
        return "Nome: " + nome +
                ", idade: " + idade +
                ", sexo: " + sexo +
                ", vegeratiana: " + vegetariana;
    }
}
