package OOP;

public class Persoana {

    // 4 principii: mostenire, incapsulare, polimorfism si abstractizare
    // Mostenire: conceptul prin care o clasa (copil_ mosteneste o alta clasa (parinte)
    // in java putem mosteni o singura clasa
    // in momentul in care o clasa mosteneste o alta clasa, cls copil trebuie sa apeleze constructorul din parinte
    // in momentul in care se aplica mostenirea, copilul are vizibilitate asupra variabilelor/ metodelor din parinte

    public String nume;
    public String prenume;
    public Integer varsta;

    public Persoana(String nume, String prenume, Integer varsta) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
    }

    public void infoPersoana(){
        System.out.println("Numele este: " + nume);
        System.out.println("Prenumele este: " + prenume);
        System.out.println("Varsta este: " + varsta);
    }
}
