package br.com.cfarias;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class ExemplosCollect {
    public static void main(String[] args) {
        List<Pessoa> pessoas = new Pessoa().populaPessoas();


        List<Pessoa> listaBrasileiros = pessoas.stream()
                .filter(p -> p.getNacionalidade().equals("Brasileiro"))
                .collect(Collectors.toList()); //Stream para List

        listaBrasileiros.forEach(System.out::println);
        listaBrasileiros.add(new Pessoa("p9","João","Brasileiro",28));
        listaBrasileiros.forEach(p -> System.out.println("Lista de Brasileiros " + p));
        pessoas.forEach(p -> System.out.println("Lista original " + p));

        Set<Pessoa> listaSetBrasileiros = pessoas.stream()
                .filter(p -> p.getNacionalidade().equals("Brasileiro"))
                .collect(Collectors.toSet()); //Stream para Set

        ArrayList<Pessoa>  arrayListBrasileiros = pessoas.stream()
                .filter(p -> p.getNacionalidade().equals("Brasileiro"))
                .collect(Collectors.toCollection(() -> new ArrayList<>())); //Stream para ArrayList
                //pode ser feito .collet(Collectors.toCollection(ArrayList::new));

        listaSetBrasileiros.forEach(p -> System.out.println("Lista Set" + p));
        arrayListBrasileiros.forEach(p -> System.out.println("Lista Array" + p));

       Map<String, Pessoa> map = pessoas.stream()
                .filter(p -> p.getNacionalidade().equals("Coreana"))
                        .collect(Collectors.toMap(p -> p.getId(),p -> p)); //método totalmente Lambda Collectors.toMap(Chave,valor)
                //.collect(Collectors.toMap(Pessoa::getId , Pessoa::new)); Método com referência


       map.forEach((k,v)-> System.out.println("valores" + v + " " + " identificador " + k));


       Map<Integer,List<Pessoa>> agrupaPorIdade = pessoas.stream() // Neste caso, os valores getIdade são comparados, se achar mais de uma pessoa com a mesma idade, será agrupado pela mesma idade.
               //.filter(p -> p.getNacionalidade().equals("Americano"))
               .collect(Collectors.groupingBy(p -> p.getIdade()));
                //pode ser feito collect(Collectors.groupingBy(Pessoa::getIdade));, método referencial

       agrupaPorIdade.forEach((k,v) -> System.out.println(k + " " + v));

       Map<String,Integer> grupoPorNacionalidadeSomadoIdade = pessoas.stream()
               .collect(Collectors.groupingBy(p -> p.getNacionalidade(), Collectors.summingInt(p -> p.getIdade())));
       //pode ser escrito como Collect(Collectors.groupingBy(Pessoa:: getNacionalidade, Collectors.summingInt(Pessoa::getIdade())));


        grupoPorNacionalidadeSomadoIdade.forEach((k,v) -> System.out.println(k + " // "+ v ));
    }




}
