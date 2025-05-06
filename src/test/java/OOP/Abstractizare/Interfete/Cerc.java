package OOP.Abstractizare.Interfete;

public class Cerc implements FormeGeometrice, FormeGeometrice2{

    private int raza;

        @Override
    public void deseneaza() {
        System.out.println("Deseneaza cercul");
    }

    @Override
    public void calcArie() {
        System.out.println("Aria cercului este egala cu: " + Math.PI * Math.pow(raza, 2));
    }

    public int getRaza() {
        return raza;
    }

    public void setRaza(int raza) {
        this.raza = raza;
    }
}
