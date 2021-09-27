public class Donkey implements Tradable, Drivable, Domesticatable {
    private int maxSpeed;

    public Donkey(){ this.maxSpeed = 8; }

    // Method for Tradable interface
    @Override
    public int getPrice() {
        return 20;
    }


    // Methods for Drivable interface
    @Override
    public void upgradeSpeed() {
        this.maxSpeed++;
    }

    @Override
    public void downgradeSpeed() {
        this.maxSpeed--;
    }

    @Override
    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    // Methods for Domesticatable

    @Override
    public String sound() {
        return "Hee-haw!";
    }
}
