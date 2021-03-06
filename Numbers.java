public class Numbers {
    int redNumber;
    // 2 more
    int greenNumber;
    int blueNumber;

    GraphView gView;

    public Numbers(int n1, int n2, int n3) {
        this.redNumber = n1;
        // initialize 2 more
        this.greenNumber=n2;
        this.blueNumber=n3;
    }

    public void attach(GraphView gView) {
        this.gView = gView;
    }

    public void updateValues(int n1, int n2, int n3) {
        this.redNumber = n1;
        // update 2 more
        this.greenNumber=n2;
        this.blueNumber=n3;
        gView.updateGraph(n1, n2, n3);
        // call method on graphView object to update itself
    }
}