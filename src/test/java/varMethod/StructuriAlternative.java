package varMethod;

import org.testng.annotations.Test;

public class StructuriAlternative {
    // StructuriAlternative = if - then - else;
    // switch-case

    @Test
    public void metodaTest() {

        // Verificam un nr mai are decat 5
        metodaVerificareNr(8, 5);
        metodaVerificareNr(3, 7);
        metodaVerificareNumere(7);
        metodaVerificareNumere(2);
        metodaVerificareNumere(5);

        medodaVerificareNrParPozitiv(6);
        medodaVerificareNrParPozitiv(3);
        medodaVerificareNrParPozitiv(-2);
        medodaVerificareNrParPozitiv(-9);
        medodaVerificareNrParPozitiv(0);


    }

    public void metodaVerificareNr(int a, int b) {

        if (a > b) {
            System.out.println("Numarul " + a + " este mai mare decat " + b);
        } else {
            System.out.println("Numarul " + a + " este mai mic decat " + b);
        }
    }

    public void metodaVerificareNumere(int a) {

        if (a > 5) {
            System.out.println("Numarul " + a + " este mai mare decat 5");
        } else if (a < 5) {
            System.out.println("Numarul " + a + " este mai mic decat 5");
        } else {
            System.out.println("Numarul " + a + " este egal cu 5 ");

        }
    }

    // verificam daca un nr e par pozitiv sau par negativ
    public void medodaVerificareNrParPozitiv(int a) {
        if (a > 0) {
            if (a % 2 == 0) {
                System.out.println("Numarul " + a + " este par pozitiv");
            } else {
                System.out.println("Numarul " + a + " este impar pozitiv");
            }
        } else if (a < 0) {
            if (a % 2 == 0) {
                System.out.println("Numarul " + a + " este par negativ");
            } else {
                System.out.println("Numarul " + a + " este impar negativ");
            }
        } else if (a == 0) {
            System.out.println("Numarul este 0");
        }
    }

}

