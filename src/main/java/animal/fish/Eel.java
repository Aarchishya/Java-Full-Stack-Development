package animal.fish;

public class Eel extends Fish{
    protected boolean electricCharge;

    public Eel() {
        super();
        this.electricCharge = true;

    }

    @Override
    public String toString() {
        return "Eel{" +
                "electricCharge=" + electricCharge +
                ", gills=" + gills +
                ", livesInWater=" + livesInWater +
                ", height=" + height +
                ", weight=" + weight +
                ", animalType='" + animalType + '\'' +
                ", bloodType='" + bloodType + '\'' +
                '}';
    }
}
