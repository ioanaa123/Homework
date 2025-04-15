package ObiectConstructor;

public class Avion {

    // constructor:  are ca rol sa initializeze variabilele unei clase
    // recunoastem un constructor dupa numele clasei
    // intr-o clasa putem avem n constructori
    // se diferenteaza dupa numarul sau tipul de parametrii
    // exista 2 tipuri de constructori: cu sau fara paramentrii
    // intr-o clasa avem tot timpul un constructor default (fara paramentrii)
    // constructorul trebuie sa fie public
    // obiect = instanta unei clase
    // dintr-o clasa putem face mai multe obiecte

    public String tip;
    public String marca;
    public String model;
    public Integer capacitatePasageri;
    public String tipCombustibil;
    public Integer nrBagaje;

    public Avion(String tip, String marca, String model, Integer capacitatePasageri, String tipCombustibil) {
        this.tip = tip;
        this.marca = marca;
        this.model = model;
        this.capacitatePasageri = capacitatePasageri;
        this.tipCombustibil = tipCombustibil;
    }

    public void prezentareAvion() {
        System.out.println("Tipul avionului este: " + tip);
        System.out.println("Marca avionului este: " + marca);
        System.out.println("Modelul avionului este: " + model);
        System.out.println("Capacitatea avionului este: " + capacitatePasageri);
        System.out.println("Tipul combustibilului avionului este: " + tipCombustibil);

        if (nrBagaje != null) {
            System.out.println("Numarul bagajelor este: " + nrBagaje);
        } else {
            System.out.println("Avionul nu are bagaje");
        }
    }

    public Avion(String tip, String marca, String model, Integer capacitatePasageri, String tipCombustibil, Integer nrBagaje) {
        this.tip = tip;
        this.marca = marca;
        this.model = model;
        this.capacitatePasageri = capacitatePasageri;
        this.tipCombustibil = tipCombustibil;
        this.nrBagaje = nrBagaje;
    }
}
