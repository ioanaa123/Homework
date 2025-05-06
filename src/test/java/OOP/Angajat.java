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
    // suprascriem metida din parinte (polimorfism dinamic)

    public void mananca(){
        System.out.println("Angajatul mananca cand are pauza de masa");
    }

    // polimorfism static
    public void marire(){
        System.out.println("Nu avem buget de mariri!");
    }

    public void marire(Integer procent){
        System.out.println("Angajatul a primit o marire de " + procent + " %");
    }

    public void marire(String grad){
        System.out.println("Angajatul a primit gradul " + grad);
    }

    public void promovare(){
        System.out.println("Angajatul cu numele: " + getNume() + " a fost promovat");
    }

    public String getFirma() {
        return firma;
    }

    public String getExperienta() {
        return experienta;
    }

    public Integer getZileConcediu() {
        return zileConcediu;
    }

    public void setFirma(String firma) {
        this.firma = firma;
    }

    public void setExperienta(String experienta) {
        this.experienta = experienta;
    }

    public void setZileConcediu(Integer zileConcediu) {
        this.zileConcediu = zileConcediu;
    }
}
