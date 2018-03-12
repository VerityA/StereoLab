public class CDPlayer extends Component {
    private int numberOfCDs;

    public CDPlayer (int numberOfCDs, String make, String model) {
        super(make, model);
        this.numberOfCDs = numberOfCDs;
    }

    public int getNumberOfCDs() {
        return this.numberOfCDs;
    }
}
