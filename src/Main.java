public class Main {
    public static void main(String[] args) {

        BmiService service = new BmiService();
        double index = service.calculate(57, 1.64);
        System.out.println("Ваш индекс массы тела:");
        System.out.printf("%.2f",index);
    }
}