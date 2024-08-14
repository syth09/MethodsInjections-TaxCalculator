public class Main {
    public static void main(String[] args) {
        var calculator =  new TaxCalculator2018(10_000);
        var report = new TaxReport();
        report.show(calculator);
        report.show(new TaxCalculator2019());
    }
}