package OOP;

public class AngajatStudent extends Persoana implements AngajatInt, StundentInt{

    private String facultate;
    private Integer an;
    private Boolean bursa;
    String firma;
    String experienta;
    Integer zileConcediu;

    public AngajatStudent(String nume, String prenume, Integer varsta, String firma, String experienta,
                          Integer zileConcediu, String facultate, Integer an, Boolean bursa) {
        super(nume, prenume, varsta);
        this.firma = firma;
        this.experienta = experienta;
        this.zileConcediu = zileConcediu;
        this.facultate = facultate;
        this.an = an;
        this.bursa = bursa;
    }

    @Override
    public void mergeLaMunca() {
        System.out.println("Studentul angajat merge la munca");
    }

    @Override
    public void primesteSalariu() {
        System.out.println("Studentul angajat primeste salariu");
    }

    @Override
    public void mergeInPauza() {
        System.out.println("Studentul angajat merge in pauza");
    }

    @Override
    public void prezintaDemisia() {
        System.out.println("Studentul angajat nu isi prezinta demisia");
    }

    @Override
    public void mergeLaCurs() {
        System.out.println("Studentul angajat merge si la cursuri");
    }

    @Override
    public void sustineExamene() {
        System.out.println("Studentul angajat sustine examene");
    }

    @Override
    public void mergeLaCafea() {
        System.out.println("Studentul angajat merge la cafea");
    }
}
