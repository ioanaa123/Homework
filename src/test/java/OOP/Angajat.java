package OOP;

public class Angajat extends Persoana{
    String firma;
    String experienta;
    Integer zileConcediu;

    public Angajat(String nume, String prenume, Integer varsta, String firma, String experienta, Integer zileConcediu) {
        super(nume, prenume, varsta);
        this.firma = firma;
        this.experienta = experienta;
        this.zileConcediu = zileConcediu;
    }

    public void infoAngajat(){
        infoPersoana();
        System.out.println("Firma este: " + firma);
        System.out.println("Experienta: " + experienta);
        System.out.println("Nr zile de concediu: " + zileConcediu);
    }
}
