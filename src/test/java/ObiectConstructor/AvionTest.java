package ObiectConstructor;

import org.testng.annotations.Test;

public class AvionTest {

    @Test
    public void methodaTest(){

        Avion avion1 = new Avion("Pasageri", "Boeing",
                "A-321", 210, "Kerosen");
        avion1.prezentareAvion();

        Avion avion2 = new Avion("Pasageri", "Boeing",
                "B-410", 320, "Kerosen");
        avion2.prezentareAvion();

        Avion avion3 = new Avion("Pasageri", "Boeing",
                "B-410", 320, "Kerosen", 200);
        avion3.prezentareAvion();

    }
}
