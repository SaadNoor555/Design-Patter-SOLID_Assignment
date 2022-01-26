package printMode;

public class BoosterMode extends PrintMode{
    public int intensityThreshold;

    public BoosterMode(int colorIntensity, int costPerPage) {
        super(colorIntensity, costPerPage);
    }

    public int getIntensityThreshold() {
        return intensityThreshold;
    }

    public void setIntensityThreshold(int intensityThreshold) {
        this.intensityThreshold = intensityThreshold;
    }

    public void boost()
    {
        setColorIntensity(getIntensityThreshold());
        System.out.println("Increased color intensity using boost mode");
    }
}
