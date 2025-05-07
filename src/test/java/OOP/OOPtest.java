package OOP;

import org.testng.annotations.Test;

public class OOPtest {

    @Test
    public void metodaTest() {
        Student cristi = new Student("Pop", "Cristian", 23, "UBB", 2, false);
        cristi.infoStudent();
//        cristi.facultate = "UTCN";
//        cristi.infoStudent();
        cristi.mananca();

        Student anca = new Student("Popescu", "Anca", 22, "UBB", 2, true);
        anca.infoStudent();

        Angajat elena = new Angajat("Petrescu", "Elena", 28, "Endava", "3 ani", 21);
//        elena.infoAngajat();
//        elena.promovare();

        elena.mananca();
        elena.marire();
        elena.marire(5);
        elena.marire("EN");

        AngajatStudent marcel = new AngajatStudent("Pop", "Tudor",25,
                "Endava", "1", 21, "UTCN", 4, false );
    }
}
