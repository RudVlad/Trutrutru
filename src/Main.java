import java.io.*;
import java.util.Scanner;

//package w10;
//import w10Storage.MyStorage;
public
    class Main {

    public static void main(String[] args){
        /*int weight0 = 5;
        String ingr0 = "cynamon";

        int weight1 = 5;
        String ingr1 = "cynamon";

        int weight2 = 5;
        String ingr2 = "cynamon";

        int weight3 = 5;
        String ingr3 = "cynamon";

        int[]weightTab = { 5, 5, 5, 5};
        String[] ingrTab = {"cynamon","cynamon","cynamon","cynamon"};

        weightTab[0] = 10;
        ingrTab[0] = "rodzynki";*/

/*        Cookie[] cookies = {
            new Cookie(10),
            new Cookie(12),
            new Cookie(8, "cynamon"),
            new Cookie(10, "maliny")
        };

        for(Cookie cookie : cookies)
            cookie.show();*/

/*        Cookie[] cookies = new Cookie[10];

        for(int i=0; i<5; i++){
            cookies[i] = new Cookie( 10 + ( (int)(Math.random()*10) - 5));
            cookies[i].show();
        }


        System.out.println("========================");

        for(Cookie cookie : cookies)
            if(cookie != null)
                cookie.show();
            else
                System.out.println(cookie);
 */
//        MyStorage storage = new MyStorage();
//        for(int i=0; i<5; i++) {
//            Cookie cookie = Cookie.make();
//            storage.add(cookie);
//        }
//
//        storage.show();
//
//
//        // ==========================================
//        System.out.println("===============");
//        MyList list = new MyList();
//        for(int i=0; i<10; i++)
//            list.add(Cookie.make());
//        list.show();
//
//        System.out.println("+++++++++++++++++++");
//
//        list.filter(6).show();


        // Kolokwium prygotowanie

        //System.out.println((char)('a'+4));
//        Abac abac = new Abac(8);
//        abac.show();
//        Bac tab = new Bac();
//        tab.show();
//        File
//        AAA[] tab = new AAA[]{
//                new BBB(), new BBB(6>>1,1), new AAA()
//                ,new AAA(6&2)
//        };
//        for (int i = 0; i< tab.length;i++){
//            tab[i].met1((char) ('a' + i));
//            tab[i].met2();
//            System.out.println();
//        }
//        AAA ob1 = new AAA();
//        ob1.met2();
//        Dwa dwa = new Dwa();
//        dwa.show();
//        for(int i =0; i< 5; i++)
//            System.out.println(dwa.getSum());
//        dwa.show();
//        A[] arr = new A[]{new A(), new A(3), new B(2), new B()};
//        for(int i =0; i < arr.length; i++){
//            arr[i].set(2);
//            arr[i].change();
//            try{
//                arr[i].check();
//            }catch (Exc e){
//                System.out.println(e.getMessage());
//            }
//            System.out.println();
//        }
//        System.out.println("\n" + (arr[0].change().length>>1));
//        for (int i =0; i < 26; i++){
//            System.out.print((char)('A'+i) + " ");
//            if(i%5==0){
//                System.out.println();
//            }
//        }
//        File file = new File("data.txt");
//        try{
//            file.createNewFile();
//            FileOutputStream fos = new FileOutputStream(file.getPath());
//            fos.write('a');
//        }catch (IOException e){
//            e.printStackTrace();
//        }


        //Scanner scanner = new Scanner(System.in);

    }

}
class  A{
    private int[] arr;

    public A(int size) {
        arr = new int[2*size];
    }
    public A(){
        this(1);
    }
    public void set(int c){
        for(int i =0; i< arr.length; i++){
            arr[i] = c + i;
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }
    public char[] change(){
        char[] result = new char[arr.length];

        for(int i =0; i< arr.length; i++){
            int mm = arr[i];

            for(int j = i+1; j< arr.length; j++){
                mm = (i%2==0)? Math.max(mm,arr[j]) : Math.min(mm,arr[j]);
            }
            arr[i] = mm;
            result[i] = (char)(mm/2 + 'A' + i);
            System.out.print(mm +" ");
        }
        System.out.println();
        return result;
    }
    protected void check() throws Exc{
        if(arr.length <=4)
            throw new Exc("Za mało.");
    }
}
class B extends A{
    private int s;
    public B(int s){
        this.s = s;
    }
    public B(){
        super(2);
    }
    @Override
    public void set(int c){
        super.set(c + s);
    }
    public char[] change (){
        char[] result = super.change();

        result[0] = (char)('A'+s);
        for(int i =0; i < result.length/2; i++){
            char tmp = result[i];
            result[i] = result[result.length - i -1];
            result[result.length - i -1] = tmp;
            System.out.print(result[i] + " ");
        }
        System.out.println();
        return result;
    }
}
class Exc extends Exception{
    public Exc(String msg){
        super(msg);
    }
}
class AAA {
    private char[][] arr;
    public AAA(int size){
       arr = new char[size][size];
    }
    public AAA(){
        this(3);
    }
    public void met1(char c){

        for(int i =0;i < arr.length;i++){
            for(int j =0; j< arr[i].length;j++){
                arr[i][j] = (char)(c + (j%2==0?i*j:j));
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    protected void met2(){
//        for(int i =0; i< arr.length;i++){
//            char m = arr[i][0];
//            for(int j = 1; j< arr[i].length;j++){
//                if(m<arr[i][j]) m = arr[i][j];
//                System.out.print((char)(m+1) + " ");
//            }
//            System.out.println();
//        }
        System.out.println("ITS AAA");
    }
}
class BBB extends AAA{
    private int s;
    public BBB(){
        super(1);
    }
    public BBB(int s, int size){
        this.s =s;
    }
    protected char[] mm(){
        char[] result = new char[s];
        for(int i =0;i < result.length; i++){
            result[i] = (char)(result[i]+(s+2));
            System.out.println(result[i] + " ");
        }
        System.out.println();
        return result;
    }
    @Override
    protected void met2(){
        System.out.println("Its BBB");
    }
}