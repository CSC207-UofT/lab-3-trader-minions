public class EamonMa implements Tradable, Domesticatable {
    @Override
    public int getPrice() {
        // As Eamon is worth 1.
        return 1;
    }

    @Override
    public String sound() {
        // Sounds like a Pokemon saying its own name
        return "Eamon Ma";
    }
}
