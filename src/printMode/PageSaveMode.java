package printMode;

import print.Document;

public class PageSaveMode extends PrintMode
{
    public PageSaveMode(int colorIntensity, int costPerPage)
    {
        super(colorIntensity, costPerPage);
    }

//    void renderPreview() {}       //moved to PagePreview Class to abide Single responsibility principle

    public void savePage(Document document)
    {
        /* algorithm to reduce number of pages required */
        System.out.println("**** Saving pages ****");
    }


}