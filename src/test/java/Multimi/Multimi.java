package Multimi;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Multimi {
    // multimi: array, list, map;

    @Test
    public void testMethod() {
        // colegiCurs();
        // colegiLista();
        // categorieObiecte();

        tariOrase();
    }

    public void colegiCurs() {
        String[] colegi = new String[6];
        colegi[0] = "Ana-Maria";
        colegi[1] = "Cristina";
        colegi[2] = "Mihai";
        colegi[3] = "Lucian";
        colegi[4] = "Alex";
        colegi[5] = "Bogdan";

        for (int index = 0; index < colegi.length; index++) {
            System.out.println("Colegul este: " + colegi[index]);
        }
    }

    // exemplu lista

    public void colegiLista() {
        List<String> colegi = new ArrayList<>();
        colegi.add("Ana-Maria");
        colegi.add("Cristina");
        colegi.add("Mihai");
        colegi.add("Lucian");
        colegi.add("Alex");
        colegi.add("Bogdan");

        int index = 0;
        while (index < colegi.size()) {
            System.out.println("Colegul este: " + colegi.get(index));
            index++;
        }
    }

    // exemplu map
    // map - cheie = valoare
    public void categorieObiecte() {
        HashMap<String, String> obiecte = new HashMap<>();
        obiecte.put("obiect", "laptop");
        obiecte.put("fruct", "mar");
        obiecte.put("flori", "trandafiri");
        obiecte.put("flori", "lalea");

        for (String key : obiecte.keySet()) {
            System.out.println("Cheia este: " + key);
            System.out.println("Valoarea este: " + obiecte.get(key));
        }
    }

    public void tariOrase() {
        HashMap<String, List<String>> clasificare = new HashMap<>();
        List<String> oraseRomania = new ArrayList<>();
        oraseRomania.add("Cluj_napoca");
        oraseRomania.add("Sibiu");
        oraseRomania.add("Alba-Iulia");

        List<String> oraseItalia = new ArrayList<>();
        oraseItalia.add("Roma");
        oraseItalia.add("Venetia");
        oraseItalia.add("Napoli");

        List<String> oraseSpania = new ArrayList<>();
        oraseSpania.add("Barcelona");
        oraseSpania.add("Madrid");
        oraseSpania.add("Malaga");

        clasificare.put("Romania", oraseRomania);
        clasificare.put("Italia", oraseItalia);
        clasificare.put("Spania", oraseSpania);

        for (String key : clasificare.keySet()) {
            System.out.println("Tara este: " + key);
            System.out.println("Orasele sunt: " + clasificare.get(key));
        }
    }
}
