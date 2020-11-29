public class Main {
    public static void main(String[] args) {
        BmiService obj = new BmiService();
        double weight = 75.5;
        double height = 1.75;
        double index = obj.calculate(weight, height);
        System.out.printf("%2f", index);
    }
}
