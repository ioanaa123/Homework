package varMethod;


import org.testng.annotations.Test;

public class Student {

    public String nume;
    public String prenume;
    public Integer varsta;
    public String adresa;
    public Double inaltime;
    public Float greutate;
    public Character sex;
    public Boolean areDiploma;

    @Test
    public void prezentareStudent() {
        nume = "Doe";
        prenume = "Jane";
        varsta = 21;
        adresa = "Horea";
        inaltime = 1.70;
        greutate = 52.0f;
        sex = 'F';
        areDiploma = false;

        System.out.println("Datele studentului sunt:");
        System.out.println(nume + ' ' + prenume + ' ' + varsta);

        calculMedie();

    }

    @Test
    public void calculMedie() {
        Integer nota1 = 8;
        Integer nota2 = 9;
        Integer nota3 = 10;
        Integer medie = (nota1 + nota2 + nota3) / 3;

        System.out.println("Media studentului este: " + medie);

    }

}
