package Calculator;

import java.util.Scanner;

public class DataInput {
    private int num1;
    private int num2;
    private String operation;
    public int flag;

    public void read() {
        String[] romanNumbers = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        Scanner sc = new Scanner(System.in);
        String exp = sc.nextLine();
        this.operation = exp.replaceAll("[\\w\\s]+", ""); //получаем арифметические оператор в String
        String[] numbers = exp.split("[+-/*|\\s\\W_]+"); //получаем массив из сроковых чисел или букв.
        try {
        for (int i = 1; i < romanNumbers.length; i++) {
            if (romanNumbers[i].equals(numbers[0]) || romanNumbers[i].equals(numbers[1])) { //проверка введены  арабские или римские
                flag = 1;
                break;
            }
        }

            if (flag == 1) {
                this.num1 = romanToNumber(numbers[0]);
                this.num2 = romanToNumber(numbers[1]);
            } else {
                this.num1 = Integer.parseInt(numbers[0]);
                this.num2 = Integer.parseInt(numbers[1]);
            }
        } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
            System.err.println("Неверные данные. Введите заново числа в арабской или римской системах счисления");
            System.exit(0);
        }

        if ((num1 > 10 || num1 < 1) || (num2 > 10 || num2 < 1)) {
            throw new RuntimeException("Введите число в диапазоне от 1 до 10");
        }
        if (numbers.length > 2) {
            throw new RuntimeException("Необходимо ввести только 2 целых числа");
        }
    }

    private int romanToNumber(String roman) {
        switch (roman) {
            case "I":
                return 1;
            case "II":
                return 2;
            case "III":
                return 3;
            case "IV":
                return 4;
            case "V":
                return 5;
            case "VI":
                return 6;
            case "VII":
                return 7;
            case "VIII":
                return 8;
            case "IX":
                return 9;
            case "X":
                return 10;
            default:
                throw new IllegalArgumentException("Введите либо оба арабских числа, либо оба римских числа");
        }
    }

    public int getNum1() {
        return this.num1;
    }

    public int getNum2() {
        return this.num2;
    }

    public String getOperation() {
        return this.operation;
    }

    public int getFlag() {
        return this.flag;
    }
}
