public class One {
    public int val = 1;
}
class Dwa extends One{
    public int val = super.val;
    {
        super.val = 4;
    }
    public int getSum(){
        super.val++;
        return val+this.val+super.val;
    }
    public void show(){
        System.out.println(super.val + "pzdc ");
    }
}
