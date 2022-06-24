public class Main {
    public class NumberContainer {
        public int number;
    }
    public static void main(String[] args) {
        NumberContainer myNumber = NumberContainer();
        multiplyNumbers(myNumber,12,3);
        System.out.println("Result = " + myNumber.number);
    }
    
    private static Main.NumberContainer NumberContainer() {
        return null;
    }

    public static void multiplyNumbers(NumberContainer result, int firstNumber, int secondNumber) {
        result.number = firstNumber * secondNumber;
    }
}


