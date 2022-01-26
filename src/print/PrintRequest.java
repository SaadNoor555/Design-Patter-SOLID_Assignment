package print;

import printMode.BoosterMode;
import printMode.PageSaveMode;
import printMode.PrintMode;
import printMode.TonerSaveMode;

public class PrintRequest {
    Document doc;
    PrintMode printMode;
    PrioritySetting prioritySetting;    // priority set for  each request, follows single responsibility principle
//    TonerSaveMode tonerSaveMode;      // replaced the separate objects of PrintMode class with an object of superclass
//    PageSaveMode pageSaveMode;        // because this inheritance follows liskov substitution principle
//    BoosterMode boosterMode;


    public PrintRequest(Document doc, PrintMode printMode) {
        this.doc = doc;
        this.printMode = printMode;
    }

    public Document getDoc() {
        return doc;
    }

    public PrintMode getPrintMode() {
        return printMode;
    }

    public void setDoc(Document doc) {
        this.doc = doc;
    }

    public void setPrintMode(PrintMode printMode) {
        this.printMode = printMode;
    }
}
