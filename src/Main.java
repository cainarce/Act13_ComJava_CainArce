import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class Main {
    public static void main(String[] args){

        List<String> lista = new ArrayList<>();
        lista.add("Rodolfo");
        lista.add("Ricardo");
        lista.add("Isadora");
        lista.add("Ximena");
        lista.add("Andrea");
        lista.add("Cain");
        List<Integer> tamañosLista = new ArrayList<>();
        for(int i=0; i<lista.size();i++){
            tamañosLista.add(lista.get(i).length());
        }

        System.out.println("Por longitud - Clase anónima:");
        for(int i=0; i<lista.size();i++){
            System.out.println(lista.get(i));
        }

        System.out.println("Por longitud - Expresión Lambda:");
        for(int i=0; i<lista.size();i++){
            System.out.println(lista.get(i));
        }

        System.out.println("Por longitud - Método de referencia:");
        for(int i=0; i<lista.size();i++){
            System.out.println(lista.get(i));
        }

        System.out.println("--------------------");
        
        Collections.sort(lista);

        System.out.println("Alfabético - Clase anónima:");
        for(int i=0; i<lista.size();i++){
            System.out.println(lista.get(i));
        }

        System.out.println("Alfabético - Expresión Lambda:");
        for(int i=0; i<lista.size();i++){
            System.out.println(lista.get(i));
        }

        System.out.println("Alfabético - Método de referencia:");
        for(int i=0; i<lista.size();i++){
            System.out.println(lista.get(i));
        }


    }
}
