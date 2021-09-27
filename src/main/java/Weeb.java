public class Weeb implements Tradable, Drivable{
    private int speed;

    public Weeb(){
        this.speed = 20;
    }
    @Override
    public void upgradeSpeed() {
        this.speed += 20;
    }

    @Override
    public void downgradeSpeed() {
        this.speed -= 6;
    }

    @Override
    public int getMaxSpeed() {
        return speed;
    }

    @Override
    public int getPrice() {
        return 30;
    }
}
