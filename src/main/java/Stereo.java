public class Stereo {
    private String name;
    private CDPlayer cdPlayer;
    private CassettePlayer cassettePlayer;
    private Radio radio;

    public Stereo(String name, CDPlayer cdPlayer, CassettePlayer cassettePlayer, Radio radio) {
        this.name = name;
        this.cdPlayer = cdPlayer;
        this.cassettePlayer = cassettePlayer;
        this.radio = radio;
    }

    public String tuneRadio() {
        return this.radio.tune();
    }
}
