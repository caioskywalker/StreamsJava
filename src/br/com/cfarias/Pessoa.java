package br.com.cfarias;

import java.util.List;

public class Pessoa {

    private String id;
    private String nome;
    private String nacionalidade;
    private int idade;



    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }




    public Pessoa(String id, String nome, String nacionalidade, int idade){
        this.id = id;
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
    }
    public Pessoa(){
    }

    public Pessoa(Pessoa pessoa){
        this(pessoa.getId(), pessoa.getNome(), pessoa.getNacionalidade(), pessoa.getIdade());

    }

    public List<Pessoa> populaPessoas(){
         Pessoa pessoa1 = new Pessoa("p1","Caio Farias","Brasileiro",28) ;
         Pessoa pessoa2 = new Pessoa("p2","Gabriel Farias","Brasileiro",26);
         Pessoa pessoa3 = new Pessoa("p3","Ari","Coreana",30);
         Pessoa pessoa4 = new Pessoa("p4","John","Americano",18);
        Pessoa pessoa8 = new Pessoa("p8","Kristy","Americano",18);
        Pessoa pessoa9 = new Pessoa("p9","Joe","Americano",18);
        Pessoa pessoa10 = new Pessoa("p10","Robert","Americano",18);
         Pessoa pessoa5 = new Pessoa("p5","Jam","Filipina",20);
         Pessoa pessoa6 = new Pessoa("p6","Mariana","Francesa",19);
        Pessoa pessoa7 = new Pessoa("p7","Maria","Angolana",30);

         return List.of(pessoa1,pessoa2,pessoa3,pessoa4,pessoa5,pessoa6,pessoa7,pessoa8,pessoa9,pessoa10);
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "id='" + id + '\'' +
                ", nome='" + nome + '\'' +
                ", nacionalidade='" + nacionalidade + '\'' +
                ", idade=" + idade +
                '}';
    }
}
