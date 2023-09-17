package Lab2c;

interface Chargeable{
    void charge();
}
public class Charger {
    public void charge(Chargeable c){
        c.charge();
    }
}
