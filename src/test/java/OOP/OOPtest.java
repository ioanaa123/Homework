package OOP;

import org.testng.annotations.Test;

public class OOPtest {

    @Test
    public void metodaTest(){
        Student cristi = new Student("Pop", "Cristian", 23, "UBB", 2, false);
        cristi.infoStudent();

        Student anca = new Student("Popescu", "Anca", 22, "UBB", 2, true);
        anca.infoStudent();

        Angajat elena =  new Angajat("Petrescu", "Elena", 28, "Endava", "3 ani", 21);
        elena.infoAngajat();

    }
}
