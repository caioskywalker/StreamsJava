package br.com.cfarias;

import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MapExemplos {
    public static void main(String[] args) {

        List<Pessoa> pessoas = new Pessoa().populaPessoas();

        Stream<Integer> stream = pessoas.stream()
                .filter(p -> p.getNacionalidade().equals("Brasileiro"))
                .map(Pessoa::getIdade);



        IntStream streamInt = pessoas.stream()
                .filter(p -> p.getNacionalidade().equals("Brasileiro"))
                .mapToInt(Pessoa::getIdade);


        streamInt.forEach(System.out::println);
    }


}
