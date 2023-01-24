public class Main {

    public static void main(String[] args) {

        Ints intsCalc = new IntsCalculator();
        System.out.println(intsCalc.sum(2, 2));
        System.out.println(intsCalc.sub(5, 2));
        System.out.println(intsCalc.mult(5, 12));
        System.out.println(intsCalc.div(25, 5));
        System.out.println(intsCalc.pow(2, 10));
    }
}
