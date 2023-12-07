package br.com.cfarias;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<String> lista = List.of("Caio","Farias");
        Stream<String> streamList = lista.stream();

        Set<String> set = Set.of("Gabriel","Farias");
        Stream<String> streamSet = set.stream();

        Map<String, String> map = Map.of("Sandra","Farias");
        Stream<String> streamMapValues = map.values().stream();
        Stream<String> streamMapKeys = map.keySet().stream();



    }
}