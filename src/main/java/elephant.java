public class elephant implements Tradable, Domesticatable {
    @Override
    public int getPrice() {
        //Returns the price of elephant.
        return 420;
    }

    @Override
    public String sound() {
        //Returns the sound of elephant.
        return "eEEEEEEEEee";
    }
}

