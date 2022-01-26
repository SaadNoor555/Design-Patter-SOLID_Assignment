package printMode;

public class PrintMode
{
//    private int numOfPages;       // moved to Document class to abide single responsibility principle
//    private int pageSize;         // these fields do not contain information related to it's responsibility
//    private String orientation;
    private int colorIntensity;
    private int costPerPage;

    public PrintMode(int colorIntensity, int costPerPage) {
        this.colorIntensity = colorIntensity;
        this.costPerPage = costPerPage;
    }

    public void setColorIntensity(int colorIntensity)
    {
        this.colorIntensity = colorIntensity;
    }
    public void setCostPerPage(int costPerPage)
    {
        this.costPerPage = costPerPage;
    }

    public int getColorIntensity()
    {
        return this.colorIntensity;
    }
    public int getCostPerPage()
    {
        return this.costPerPage;
    }

    /*
     * abstract methods removed because each of them are only used in
     * a single subclass, so the methods are moved to that subclass
     * now it follows Liskov  substitution principle
     * it also follows Interface segregation principle, as no child has
     * to use any abstract function that it doesn't use anymore
     */
//    abstract public void saveToner();     //moved to TonerSaveMode class
//    abstract public void savePage();      //moved to PageSaveMode class
//    abstract public void boost();         //moved to BoosterMode class
}
