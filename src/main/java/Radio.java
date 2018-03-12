public class Radio extends Component{
    private String radioStation;

    public Radio (String radioStation, String make, String model) {
        super(make, model);
        this.radioStation = radioStation;
    }

    public String tune() {
        return "Tuned into " + this.radioStation;
    }
}
