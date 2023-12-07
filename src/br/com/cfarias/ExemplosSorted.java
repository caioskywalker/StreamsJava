package br.com.cfarias;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

import br.com.cfarias.Pessoa;

public class ExemplosSorted {

    public static void main(String[] args) {

        List<Pessoa> pessoas = new Pessoa().populaPessoas();

        Stream stream1 = pessoas.stream()
                .filter(p -> p.getNacionalidade().equals("Brasileiro"))
                .sorted(Comparator.comparing(Pessoa::getNome));

        Stream stream2 = pessoas.stream()
                .filter(p -> p.getNacionalidade().equals("Brasileiro"))
                .sorted(Comparator.comparing(Pessoa::getIdade));

        Stream stream3 = pessoas.stream()
                .filter(p -> p.getNacionalidade().equals("Brasileiro"))
                .sorted((p1,p2) -> Integer.compare(p2.getIdade(),p1.getIdade()));

        //stream1.forEach(i -> System.out.println(i));
        stream2.forEach(System.out::println);
        stream3.forEach(System.out::println);


    }


}
