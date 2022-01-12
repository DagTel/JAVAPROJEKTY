package Kolekcje.DYSPOZYTORNIA;

import java.util.*;
import java.util.stream.Collectors;

public class Dyspozytornia extends Zgloszenie{


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }



    public void setZgloszenia(LinkedHashMap zgloszenia) {
        this.zgloszenia = zgloszenia;
    }

    private String id;
    List<Zgloszenie> najaktualniejszeZgloszenia = new ArrayList<>();


    //private LinkedHashMap zgloszenia;
    Map<String,Zgloszenie> zgloszenia = new LinkedHashMap();

    public Dyspozytornia(String trescZgloszenia, double czasZgloszenia, TypZgloszenia typZgloszenia,String id,Map<String,Zgloszenie> zgloszenia) {
        super(trescZgloszenia, czasZgloszenia, typZgloszenia);
        this.id = id;
        this.zgloszenia = zgloszenia;
    }



    private void dodajZgloszenie(String trescZgloszenia, TypZgloszenia typZgloszenia){
        zgloszenia.put(getId(),new Zgloszenie(getTrescZgloszenia(),getCzasZgloszenia(),getTypZgloszenia()));

    }

    private int zwrocjaktualniejszeZgloszenia(int iloscZgloszen) {

        List<Zgloszenie> najaktualniejszeZgloszenia = new ArrayList<>(zgloszenia.values());

                najaktualniejszeZgloszenia.sort(new Comparator<Zgloszenie>() {
                    @Override
                    public int compare(Zgloszenie zgloszenie, Zgloszenie t1) {
                        return iloscZgloszen;
                    }
                });



        return iloscZgloszen;
    }

    public List<Zgloszenie>zwróćZgloszeniaTypu(TypZgloszenia typ) {

       List<Zgloszenie> zgloszeniaa= new ArrayList<>(zgloszenia.values());
       zgloszeniaa.stream()
               .filter((n)-> getTypZgloszenia().equals(typ))
               .collect(Collectors.toList());

        return zgloszeniaa;
    }

    @Override
    public String toString() {
        return "Dyspozytornia{" +
                "zgloszenia=" + zgloszenia +
                '}';
    }
}
