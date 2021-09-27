public class Eamonma implements Drivable, Domesticatable, Tradable{
    private int speed;
    private int price;
    private boolean purchased;
    private String name;

    public Eamonma() {
        this.speed = 0xFFFFFFFF;
        this.price = 0b0101010101;
        this.purchased = false;
        this.name = "eamon ma";
    }

    @Override
    public String sound() {
        return "You ain't from detroit if you've never done this before";
    }

    @Override
    public void upgradeSpeed() {
        this.speed += 0xAB;
    }

    @Override
    public void downgradeSpeed() {
        this.speed -= 0xFD;
    }

    @Override
    public int getMaxSpeed() {
        return this.speed;
    }

    @Override
    public int getPrice() {
        return 0x0;
    }

    @Override
    public boolean buyItem(int moneySpent) {
        if (moneySpent == this.price && this.purchased == false){this.purchased = true;return true;}
        return false;
    }

    @Override
    public String getItemName() {
        return this.name;
    }
}
