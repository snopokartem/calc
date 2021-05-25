package Calculator;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите арифметическое выражение из двух целых чисел от 1 до 10");
        DataInput data = new DataInput();
        data.read();
        Converter converter = new Converter();

        int forFlag = data.getFlag();
        if (forFlag == 0) {
            int arabResult = Calculator.calculate(data.getNum1(), data.getNum2(), data.getOperation());
            System.out.println(arabResult);
        } else if (forFlag == 1) {
            int arabResult = Calculator.calculate(data.getNum1(), data.getNum2(), data.getOperation());
            String romanResult = converter.convert(arabResult);
            System.out.println(romanResult);
        }

    }
}
