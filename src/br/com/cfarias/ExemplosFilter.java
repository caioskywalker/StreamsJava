package br.com.cfarias;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class ExemplosFilter {

    public static void main(String[] args) {
        List<Pessoa> lista = new Pessoa().populaPessoas();
        Stream<Pessoa> stream = lista.stream().filter(pessoa -> pessoa.getNacionalidade().equals("Brasileiro"));
        Stream<Pessoa> stream3 = lista
                .stream()
                .filter(new Predicate<Pessoa>() {
                     @Override
                    public boolean test(Pessoa pessoa) {
                    return pessoa.getNacionalidade().equals("Coreana");
                }
        });

                Predicate < Pessoa > pred = pessoa -> pessoa.getNacionalidade().equals("Brasieiro");
        Stream<Pessoa> stream1 = lista.stream().filter(pred);

        Predicate<Pessoa> pred1 = new Predicate<Pessoa>(){
            public boolean test(Pessoa p){
                return p.getNacionalidade().equals("Brasileiro");
            }

        };
        Stream<Pessoa> stream2 = lista.stream().filter(pred1);
    }
}
