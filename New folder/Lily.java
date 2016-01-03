public class Lily extends Violet {
    public void method1() {
        super.method1();
        System.out.print("Lily 1 ");
    }
    
    public void method2() {
        System.out.print("Lily 2 ");
        method1();
    }
    
    public String toString() {
        return "Lily";
    }
}