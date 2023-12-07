package br.com.cfarias;

import java.util.List;

public class ExemploCount {



    public static void main(String[] args) {
        List<Pessoa> pessoas = new Pessoa().populaPessoas();


        int count = (int) pessoas.stream()
                .filter(p -> p.getNome().startsWith("M"))
                .count(); //só aceita long, mas pode castear com int
        System.out.println(count);
    }



}
