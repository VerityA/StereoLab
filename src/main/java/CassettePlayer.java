public class CassettePlayer extends Component{

    private boolean tapeInDeck;

    public CassettePlayer(String make, String model) {
        super(make, model);
        this.tapeInDeck = false;
    }

    public boolean isTapeInDeck() {
        return this.tapeInDeck;
    }
}
