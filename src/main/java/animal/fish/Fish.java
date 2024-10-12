package animal.fish;

import animal.Animal;

public class Fish extends Animal {
    protected boolean gills;
    protected boolean livesInWater;

    public Fish() {
        height=10;
        weight=20;
        animalType="fish";
        bloodType="hot";
        this.gills = true;
        this.livesInWater = true;
    }

    @Override
    public String toString() {
        return "Fish{" +
                "gills=" + gills +
                ", livesInWater=" + livesInWater +
                ", height=" + height +
                ", weight=" + weight +
                ", animalType='" + animalType + '\'' +
                ", bloodType='" + bloodType + '\'' +
                '}';
    }
}
