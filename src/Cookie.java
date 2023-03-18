//package w10;


    class Cookie {

    public static Cookie make(){
        return new Cookie( 10 + ( (int)(Math.random()*10) - 5));
    }

    private int weight;
    private String ingr;

    private Cookie(int weight, String ingr){
        this.weight = weight;
        this.ingr = ingr;
    }

    private Cookie(int weight){
        this( weight, "rodzynki");
    }

    public void show(){
        System.out.println(this+" "+this.weight+" "+this.ingr);
    }

    public int getWeight() {
        return weight;
    }
}
