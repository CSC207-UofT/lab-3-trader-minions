public class Motorcycle implements Drivable{

    private int max_speed;

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


}
