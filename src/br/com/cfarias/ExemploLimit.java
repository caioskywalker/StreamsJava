package br.com.cfarias;

import java.util.List;
import java.util.stream.Stream;

public class ExemploLimit {
    public static void main(String[] args) {
        List<Pessoa> pessoas = new Pessoa().populaPessoas();
        Stream<Pessoa> stream = pessoas.stream()
                .limit(4);

        stream.forEach(System.out::println);
    }
}
