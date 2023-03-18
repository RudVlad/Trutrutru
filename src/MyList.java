//package w10;

    class MyList {

    private ListElement head;

    public void add(Cookie cookie){
        if(head == null)
            head = new ListElement(cookie);
        else {
            ListElement le = new ListElement(cookie);
            le.setNext(head);
            this.head = le;
        }
    }

    public void show(){
        ListElement tmp = head;
        while(tmp != null){
            tmp.getData().show();
            tmp = tmp.getNext();
        }
    }

    public MyList filter(int weight){
        MyList myList = new MyList();
        ListElement tmp = head;
        while(tmp != null){
            Cookie cookieTmp = tmp.getData();
            if(cookieTmp.getWeight() == weight)
                myList.add(cookieTmp);
            tmp = tmp.getNext();
        }
        return myList;
    }
}
