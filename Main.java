package Homework2;

public class Main {
    static final String[][] normalArray = {{"1", "2", "1", "1"}, {"2", "2", "1", "2"}, {"2", "1", "1", "1"}, {"2", "2", "1", "2"}};
    static final String[][] dataExceptionArray = {{"1", "2", "3"}, {"4", "5", "6"}, {"7", "8", "9"}, {"10", "11", "12"}};
    static final String[][] sizeExceptionArray = {{"1", "1", "1", "1"}, {"2", "2", "er2", "2"}, {"3", "3", "3", "3"}, {"4", "4", "4", "4"}};

    public static void main(String[] args) {
        try {
            System.out.println("Array sum: " + getSum(normalArray));
        } catch (Exceptions.MyArraySizeException | Exceptions.MyArrayDataException ex) {
            System.out.println(ex.getMessage());
        }
        ;

        try {
            System.out.println("Array sum: " + getSum(dataExceptionArray));
        } catch (Exceptions.MyArraySizeException | Exceptions.MyArrayDataException ex) {
            System.out.println(ex.getMessage());
        }
        ;

        try {
            System.out.println("Array sum: " + getSum(sizeExceptionArray));
        } catch (Exceptions.MyArraySizeException | Exceptions.MyArrayDataException ex) {
            System.out.println(ex.getMessage());
        }
    }

    ;

    static int getSum(String[][] array) throws Exceptions.MyArrayDataException, Exceptions.MyArraySizeException {
        if (array.length != 4 || array[0].length != 4) throw new Exceptions.MyArraySizeException();
        int res = 0, i = 0, j = 0;
        try {
            for (; i < array.length; i++) {
                j = 0;
                for (; j < array.length; j++) {
                    res += Integer.parseInt(array[i][j]);
                }
            }
        } catch (NumberFormatException ex) {
            throw new Exceptions.MyArrayDataException("Error in position: " + i + ' ' + j);
        }

        return res;
    }
}
