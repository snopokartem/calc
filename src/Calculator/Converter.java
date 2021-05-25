package Calculator;


public class Converter {
    public String convert(int result) {
        if (result <= 0) {
            throw new RuntimeException("Результат не является натуральным числом");
        }
        String[] romanNums = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        String romanNumber = null;

        if (result <= 99 && result != 50) {
            for (int i = 1; i <= 10; i++) {
                if (i == result) {
                    romanNumber = romanNums[i - 1];
                } else if (i + 10 == result) {
                    romanNumber = "X" + romanNums[i - 1];
                } else if (i + 20 == result) {
                    romanNumber = "XX" + romanNums[i - 1];
                } else if (i + 30 == result) {
                    romanNumber = "XXX" + romanNums[i - 1];
                } else if (i + 40 == result) {
                    romanNumber = "XL" + romanNums[i - 1];
                } else if (i + 50 == result) {
                    romanNumber = "L" + romanNums[i - 1];
                } else if (i + 60 == result) {
                    romanNumber = "LX" + romanNums[i - 1];
                } else if (i + 70 == result) {
                    romanNumber = "LXX" + romanNums[i - 1];
                } else if (i + 80 == result) {
                    romanNumber = "LXXX" + romanNums[i - 1];
                } else if (i + 90 == result) {
                    romanNumber = "XC" + romanNums[i - 1];
                }
            }
        } else if (result == 50) {
            romanNumber = "L";
        } else if (result == 100) {
            romanNumber = "C";
        }
        return romanNumber;
    }

}




