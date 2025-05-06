package OOP.Abstractizare.Interfete;

import org.testng.annotations.Test;

public class OOPAbstractizareTest {

    @Test
    public void metodatest(){
    Cerc cerc = new Cerc();
    cerc.deseneaza();
    cerc.setRaza(4);
    cerc.calcArie();

    Patrat patrat = new Patrat();
    patrat.setLatura(7);
    patrat.calcArie();

    }
}
