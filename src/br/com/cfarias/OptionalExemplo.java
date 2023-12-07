package br.com.cfarias;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class OptionalExemplo {
    public static void main(String[] args) {
        List<Pessoa> pessoas = new Pessoa().populaPessoas();

        Optional<Pessoa> max = pessoas.stream()
                .max(Comparator.comparing(pessoa -> pessoa.getIdade()));
        if(max.isPresent()){
            System.out.println(max.get() + " resultado do IF");
        }

        max.ifPresent(m -> System.out.println(m));//mesma coisa que a função if acima...
    }

}
