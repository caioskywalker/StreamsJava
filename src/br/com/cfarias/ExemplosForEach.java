package br.com.cfarias;

import java.util.List;


public class ExemplosForEach {

    public static void main(String[] args) {
        List<Pessoa> lista = new Pessoa().populaPessoas();

        lista.stream().forEach(p ->System.out.println(p.getNome()));
        lista.stream()
                .filter(p -> p.getNacionalidade().equalsIgnoreCase("brasileiro"))
                .forEach(System.out::println);
    }

}
