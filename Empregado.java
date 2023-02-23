public class Empregado{
    //variavel de instancia (objeto)
    private String nome;
    //variavel de instancia (objeto)
    private int idade;

    public String getNome(){    //obter nome
        return nome;            //retornar nome
    }

    public void setNome(String nome){
        this.nome = nome;       //this se refere a uma variavel de instancia (String nome)
    }

    public int getIdade(){      //obter idade
        return idade;           //retornar idade
    }

    public void setIdade(int idade){
        this.idade = idade; 
    }

}