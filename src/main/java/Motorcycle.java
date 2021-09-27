public class Motorcycle implements Drivable, Tradable{

    private int max_speed;
    private int price;

    // Method for Drivable
    @Override
    public void upgradeSpeed() {
       this.max_speed++;
    }

    @Override
    public void downgradeSpeed(){
        this.max_speed--;
    }

    @Override
    public int getMaxSpeed(){
        return this.max_speed;
    }

    // Implement methods from Tradable
    @Override
    public int getPrice(){
       return 10;
    }
}
