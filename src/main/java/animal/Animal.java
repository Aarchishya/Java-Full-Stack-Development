package animal;

public class Animal {
    public int height;
    public int weight;
    public String animalType;

    public Animal() {
        this.height = 0;
        this.weight = 0;
        this.animalType = "unknown";
        this.bloodType = "unknown";
    }

    public String bloodType;

    @Override
    public String toString() {
        return "Animal{" +
                "height=" + height +
                ", weight=" + weight +
                ", animalType='" + animalType + '\'' +
                ", bloodType='" + bloodType + '\'' +
                '}';
    }
}
