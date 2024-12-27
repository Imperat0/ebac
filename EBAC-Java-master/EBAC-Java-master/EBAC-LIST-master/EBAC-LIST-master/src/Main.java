import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        exemploPessoasLista();
        exemploPessoasGeneros();
    }

    private static void exemploPessoasGeneros() {
        System.out.println("****** Lista de Pessoas ******");
        List<String> nomes = Arrays.asList("Daniel-M", "Laura-F", "Carlos-M", "Isadora-F");
        List<String> nomesMasculinos = new ArrayList<>();
        List<String> nomesFemininos = new ArrayList<>();

        for (String nome : nomes) {
            String[] user = nome.split("-");
            if (user[1].equals("M")) {
                nomesMasculinos.add(user[0]);
            } else {
                nomesFemininos.add(user[0]);
            }
        }

        System.out.println("Nomes masculinos:");
        for (String nome : nomesMasculinos) {
            System.out.println(nome);
        }

        System.out.println("Nomes femininos:");
        for (String nome : nomesFemininos) {
            System.out.println(nome);
        }

    }

    private static void exemploPessoasLista() {
        System.out.println("****** Lista de Pessoas e Generos ******");
        List<String> lista = new ArrayList<String>();

        lista.add("Daniel");
        lista.add("Carlos");
        lista.add("Laura");
        lista.add("Sandra");
        lista.add("Isadora");
        lista.add("Robson");
        lista.add("Ana");
        Collections.sort(lista);
        System.out.println(lista);

    }
}