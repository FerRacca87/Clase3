
package clase3;

// @author Fernando Racca

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Clase3 {

    public static void main(String[] args) {
        
        /*List<String> colores = Arrays.asList("Verde claro", "Rojo",
                "Azul","Amarillo", "Verde Oacuro");
        
        //RECORRO CON FOR
        for (String color : colores){
            if (color == "Rojo"){
                System.out.println(color);
            }
        }
        
        //RECORRO CON STREAM
        colores.stream()
                .filter(color -> color == "Rojo")
                //.forEach(colorFiltrado -> System.out.println(colorFiltrado));
                .forEach(System.out::println);
        
        List<Integer> numeros = Arrays.asList(1,6,12,98,2,4,45);
        
        System.out.println("Los larga nomas");
        numeros.stream().forEach(System.out::println);
        System.out.println("Si o si los larga por orden de ingreso:");
        numeros.stream().forEachOrdered(System.out::println);
        
*/
        
        //anyMatch
        
        List<Integer> listaAny = Arrays.asList(3,4,6,12,20);
        
        boolean respuestaAny = listaAny.stream()
                .anyMatch(n -> (n * (n + 1)) / 4 == 5);
        System.out.println(respuestaAny);//true
        
        //allMatch
        
        List<Integer> listAll = Arrays.asList(3,4,6,12,20);
        boolean respuestaAll = listAll.stream().allMatch(n -> n % 3 == 0);
        System.out.println(respuestaAll);//false
        
        Stream<String> nombres = Stream.of("Juan", "Pedro", 
                "Gonzalo", "Emiliano");
        boolean respuesta = nombres.allMatch(str -> str.length() > 2);
        System.out.println(respuesta);//true
        
        //filter
        
        List <Integer> listaNros = Arrays.asList(3,4,6,12,20,100);
        
        List <Integer> listaNrosDivisiblesPor5 = listaNros.stream()
                .filter(n -> n % 5 == 0).collect(Collectors.toList());
        System.out.println(listaNrosDivisiblesPor5);
        
        //BUSCAR MAYOR O MENOR
        Integer menor = Collections.min(listaNros);
        System.out.println(menor);
        Integer mayor = Collections.max(listaNros);
        System.out.println(mayor);
        
        
    }

}
