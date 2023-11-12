package clase3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//@author Fernando Racca
public class EjercicioClase3 {

    public static void main(String[] args) {

        //EJERCICIO 1
        System.out.println("Ejercicio 1:");
        List<String> listaStrings = Arrays.asList
        ("hola mundo", "chau", "argentina programa", "java");

        List<String> listaStringMayuscula = listaStrings.stream()
                .map(s -> s.toUpperCase())
                .collect(Collectors.toList());
        
        listaStringMayuscula.stream().forEach(System.out::println);

        System.out.println("*********************");
        
        //EJERCICIO 2
        System.out.println("Ejercicio 2");
        int n = 4;
        
        String concatenador = listaStrings.stream()
                .filter(Str -> Str.length() > n)
                .collect(Collectors.joining(", "));
      
        System.out.println(concatenador);
        
    }

}
