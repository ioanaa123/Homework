package OOP;

public class Student extends Persoana{

    public String facultate;
    public Integer an;
    public Boolean bursa;

    public Student(String nume, String prenume, Integer varsta, String facultate, Integer an, Boolean bursa) {
        super(nume, prenume, varsta);
        this.facultate = facultate;
        this.an = an;
        this.bursa = bursa;
    }

    public void infoStudent(){
        infoPersoana();
        System.out.println("Facultatea este: " + facultate);
        System.out.println("Anul in care se afla studentul este: " + an);
        System.out.println("Are studentul bursa? " + bursa);
    }


}
