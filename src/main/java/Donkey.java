public class Donkey implements Tradable, Drivable, Domesticatable {
    private int MaX_SpEeD;

    public Donkey(){ this.MaX_SpEeD = 8; }

    // Method for Tradable interface
    @Override
    public int getPrice() {
        return 20;
    }


    // Methods for Drivable interface
    @Override
    public void upgradeSpeed() {
        this.MaX_SpEeD++;
    }

    @Override
    public void downgradeSpeed() {
        this.MaX_SpEeD--;
    }

    @Override
    public int getMaxSpeed() {
        return this.MaX_SpEeD;
    }

    // Methods for Domesticatable

    @Override
    public String sound() {
        return "Hee-haw!";
    }
}
