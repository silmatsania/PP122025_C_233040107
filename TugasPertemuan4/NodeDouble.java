package TugasPertemuan4;

class NodeDouble {
    private double data;
    private NodeDouble next;

    public NodeDouble(double data) {
        this.data = data;
        this.next = null;
    }

    public double getData() {
        return data;
    }

    public void setData(double data) {
        this.data = data;
    }

    public NodeDouble getNext() {
        return next;
    }

    public void setNext(NodeDouble next) {
        this.next = next;
    }
}

