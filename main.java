public class main {
    public static void main (String[] args) {
        hiFunc("Timurka");
        double a = 5;
        double b = 3;
        System.out.println(ploshad(a,b));

    }
    public static void hiFunc(String broName) {
        System.out.println("Hello, " + broName);
    }
    public static double ploshad(double a, double b) {
        return a*b;
    }
}
