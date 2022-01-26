package printMode;

public class TonerSaveMode extends PrintMode
{
    private String tonerSavingLevel;

    public TonerSaveMode(int colorIntensity, int costPerPage) {
        super(colorIntensity, costPerPage);
    }

    public String getTonerSavingLevel() {
        return tonerSavingLevel;
    }

    public void setTonerSavingLevel(String tonerSavingLevel) {
        this.tonerSavingLevel = tonerSavingLevel;
    }

    public void saveToner()
    {
        if(tonerSavingLevel.equals("high"))
        {
            /*standard algo to reduce colorIntensity*/
        }
        else if(tonerSavingLevel.equals("medium"))
        {
            /*another standard algo to reduce colorIntensity*/
        }
        else if(tonerSavingLevel.equals("low"))
        {
            /*another standard algo to reduce colorIntensity*/
        }

        System.out.println("Color intensity reduced using Toner save mode");
    }
}