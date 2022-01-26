package print;

public class Document {
    private int numOfPages;
    private int pageSize;
    private String orientation;

    public Document(int numOfPages, int pageSize, String orientation) {
        this.numOfPages = numOfPages;
        this.pageSize = pageSize;
        this.orientation = orientation;
    }

    public void setNumOfPages(int numOfPages) {
        this.numOfPages = numOfPages;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public void setOrientation(String orientation) {
        this.orientation = orientation;
    }

    public int getNumOfPages() {
        return numOfPages;
    }

    public int getPageSize() {
        return pageSize;
    }

    public String getOrientation() {
        return orientation;
    }
}
