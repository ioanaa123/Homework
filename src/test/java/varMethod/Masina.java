package varMethod;

import org.testng.annotations.Test;

public class Masina {

    @Test
    public void metodaTest(){
        dateMasina("Audi","Q5",2024);
        dateMasina("BMW","X5",2020);
        calculMedie(8.5,9.0);

    }

    public void dateMasina(String marca, String model, Integer anulFabricatiei){

        System.out.println("Marca masini este: " + marca);
        System.out.println("Modelul masinii este: " + model);
        System.out.println("Anul fabricatiei este: " + anulFabricatiei);

    }

    //Calc media 2 nr

    public void calculMedie(Double nota1, Double nota2){
        Double avg=(nota1+nota2)/2;
        System.out.println("Media celor 2 numere este: " + avg);
    }
}
