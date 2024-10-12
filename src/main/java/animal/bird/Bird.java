package animal.bird;

import animal.Animal;

public class Bird extends Animal {
    protected boolean canFly;
    protected boolean hasFeathers;

    public Bird() {
        height=1;
        weight=10;
        animalType="bird";
        bloodType="hot";
        this.canFly = true;
        this.hasFeathers = true;
    }

    @Override
    public String toString() {
        return "Bird{" +
                "canFly=" + canFly +
                ", hasFeathers=" + hasFeathers +
                ", height=" + height +
                ", weight=" + weight +
                ", animalType='" + animalType + '\'' +
                ", bloodType='" + bloodType + '\'' +
                '}';
    }
}
