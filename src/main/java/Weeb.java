public class Weeb implements Tradable, Drivable{
    private int sPeDe;

    public Weeb(){
        this.sPeDe = 20;
    }
    @Override
    public void upgradeSpeed() {
        this.sPeDe += 20;
    }

    @Override
    public void downgradeSpeed() {
        this.sPeDe -= 6;
    }

    @Override
    public int getMaxSpeed() {
        return sPeDe;
    }

    @Override
    public int getPrice() {
        return 30;
    }
}
