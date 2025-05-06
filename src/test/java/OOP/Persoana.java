package OOP;

public class Persoana {

    // 4 principii: mostenire, incapsulare, polimorfism si abstractizare
    // Mostenire: conceptul prin care o clasa (copil_ mosteneste o alta clasa (parinte)
    // in java putem mosteni o singura clasa
    // in momentul in care o clasa mosteneste o alta clasa, cls copil trebuie sa apeleze constructorul din parinte
    // in momentul in care se aplica mostenirea, copilul are vizibilitate asupra variabilelor/ metodelor din parinte

    // Incapsulare = procesul prin care tinem departe anumite info ca ele sa nu poata fi modificate
    // facem var/ metodele din public in private
    // private = access control care restrictioneaza accesul doar in cls respectiva
    // ca sa extragem/ modificam o val a unei var private ne folosim de meth get/ set

    // polimorfism = procesul prin care definim mai multe implementari pt o metoda
    // de 2 feluri - dinamic(override) si static (overload)
    // polimorfismul dinamic = intr-o ierarhie de clase obtinute prin mosternire, o metoda poate avem implemenari diferite
    // polimorfismul static = posibilitatea prin care o metoda are mai multe implementari prin diferentierea nr sau tipul de param

    // Abstractizare = reducerea unui element complex la un elem mai simplu
    // reducerea completa a implementarii metodelor, lasand doar numele functiilor, param si tipul returnat
    // se poate obt prin cls abstracte sau interfete
    // cls abstracta nu poate fi instantiata
    // ea poate fi utilizata doar ca si superclasa pt alte clase care extind cls abstracta
    // cls abstracta poate fi definita folosind "abstract"
    // o cls abstracta poate contine atribute si met pe langa cls abstracta




    private String nume;
    private String prenume;
    private Integer varsta;

    public Persoana(String nume, String prenume, Integer varsta) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
    }

    public void infoPersoana() {
        System.out.println("Numele este: " + nume);
        System.out.println("Prenumele este: " + prenume);
        System.out.println("Varsta este: " + varsta);
    }

    // definim prima imeplementare pt o metoda (polimorfism dinamic)
    public void mananca(){
        System.out.println("Persoana mananca cand ii este foame");
    }


    public String getNume() {
        return nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public Integer getVarsta() {
        return varsta;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setVarsta(Integer varsta) {
        this.varsta = varsta;
    }


}
