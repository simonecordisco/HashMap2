//Creare un hashmap prendere tutti i valori, ordinarli e stamparli
import java.util.*;

import static java.util.Comparator.comparing;

public class Main {
    public static void main(String[] args) {

        Articolo articolo1 = new Articolo("pizza",1.5);
        Articolo articolo2 = new Articolo("coco cola",0.5);
        Articolo articolo3 = new Articolo("crostata",1.0);
        HashMap<String, Articolo> map1 = new HashMap<>();
            map1.put("cibo",articolo1);
            map1.put("bevanda",articolo2);
            map1.put("dolce",articolo3);
        System.out.println(map1);

        Collection<Articolo> val = map1.values();
        List<Articolo> valori = new ArrayList<>(val);
        valori.sort(Comparator.comparing(Articolo::getNome));
        System.out.println("Valori ordinati:"+ valori);

     }
    }
