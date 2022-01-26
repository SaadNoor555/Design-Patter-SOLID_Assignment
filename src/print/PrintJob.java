package print;

import java.util.Queue;

public class PrintJob
{
    private Queue<PrintRequest> printRequests;
//    private PrioritySetting prioritySetting;      // priority should be set when print is requested, as per single responsibility principle


    public PrintJob(Queue<PrintRequest> printRequests) {
        this.printRequests = printRequests;
    }

    public Queue<PrintRequest> getPrintRequests() {
        return printRequests;
    }


    public void setPrintRequests(Queue<PrintRequest> printRequests) {
        this.printRequests = printRequests;
    }

    public void pullJob(Document document)
    {
        /* some algorithm */
        System.out.println("Pull job done");
    }
//    public void changePriority(){}    // moved to PrioritySetting class to abide single responsibility principle
}
