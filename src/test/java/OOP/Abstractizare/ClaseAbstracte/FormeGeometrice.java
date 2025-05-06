package OOP.Abstractizare.ClaseAbstracte;

public abstract class FormeGeometrice {

    public abstract void calcArie();
    private String culoare;

    public void deseneaza(){
        System.out.println("Deseneaza forma");
    }

    public String getCuloare() {
        return culoare;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }
}
