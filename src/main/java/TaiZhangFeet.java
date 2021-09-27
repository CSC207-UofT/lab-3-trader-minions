public class TaiZhangFeet implements Tradable, Domesticatable {
    @Override
    public int getPrice() {
        return -100;
    }

    @Override
    public String sound() {
        return 'moo';
    }
}
