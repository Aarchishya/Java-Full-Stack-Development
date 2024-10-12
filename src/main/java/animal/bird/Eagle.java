package animal.bird;

public class Eagle extends Bird{

    public Eagle() {
        super();
        height=2;
    }

    @Override
    public String toString() {
        return "Eagle{" +
                "canFly=" + canFly +
                ", hasFeathers=" + hasFeathers +
                ", height=" + height +
                ", weight=" + weight +
                ", animalType='" + animalType + '\'' +
                ", bloodType='" + bloodType + '\'' +
                '}';
    }
}
