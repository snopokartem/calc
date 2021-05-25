package Calculator;

public class Calculator  {
    private static int result = 0;
    public static int calculate(int num1, int num2, String oper) {
        DataInput forFlag = new DataInput();
        int flag = forFlag.getFlag();


        if (flag == 0) {
            switch (oper) {
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                case "*":
                    result = num1 * num2;
                    break;
                case "/":
                    result = num1 / num2;
                    break;
                default: throw new RuntimeException("Необходимо ввести верный арифметический оператор. Введите +, -, /, или *.");
            }

        }
        return result;
    }


}
