package br.com.cfarias;

import java.util.List;

public class ExemploAllMatch {
    public static void main(String[] args) {
        List<Pessoa> pessoas = new Pessoa().populaPessoas();

        boolean resultado = pessoas.stream()
                .allMatch(p -> p.getNacionalidade().equals("Brasileiro"));//todos na lista são brasileiros? falso

        System.out.println(resultado);

        //metodo convencional
        boolean re = true;
        for(Pessoa p : pessoas){
            if(!p.getNacionalidade().equals("Brasileiro")){
                re = false;
                break;
            }
        }


        System.out.println(re);

    }
}
