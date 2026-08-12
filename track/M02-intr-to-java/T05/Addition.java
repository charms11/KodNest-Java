
public class Addition {

    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    double add(int a, double b) {
        return a + b;
    }

    double add(double a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Addition a = new Addition();
        System.out.println(a.add(20, 30));        //no.of parameters 1st method
        System.out.println(a.add(20.6, 30.9));     // type of parameters 2nd method
        System.out.println(a.add(20, 30.9));     // order of parameters 3rd method
        System.out.println(a.add(20.6, 30));     //no duplications 4th method

    }
}
