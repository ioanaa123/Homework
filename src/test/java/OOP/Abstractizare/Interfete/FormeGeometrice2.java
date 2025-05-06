package OOP.Abstractizare.Interfete;

public interface FormeGeometrice2 {

    // permite doar constante nu si field-uri/ prop care nu sunt initializate
    // toate metodele declarate sunt by defalut abstracte

    public static final String culoare = "mov";

    void calcArie();

    void deseneaza();


}
