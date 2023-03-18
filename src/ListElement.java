//package w10;

    class ListElement {

    private Cookie data;
    private ListElement next;

    public ListElement(Cookie data){
        this.data = data;
        this.next = null;
    }

    public void setNext(ListElement next) {
        this.next = next;
    }

    public ListElement getNext() {
        return next;
    }

    public Cookie getData() {
        return data;
    }
}
