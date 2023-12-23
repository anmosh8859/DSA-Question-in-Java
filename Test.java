interface i1{
    public void test();
}
interface i2{
    public void test();
}
public class Test implements i1,i2{
    public void test(){
        System.out.println("I am here");
    }

    public static void main(String[] args) {
        Test t = new Test();
        t.test();
    }
}