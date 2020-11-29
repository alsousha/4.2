public class BmiService {
    public double calculate(double weight, double height) {
        return (double) (weight / (height * height));
    }
}
