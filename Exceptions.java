package Homework2;

public class Exceptions {
    public static class MyArraySizeException extends Exception {
        public MyArraySizeException() {
            super("MyArraySizeException");
        }
    };

    public static class MyArrayDataException extends Exception {
        public MyArrayDataException(String message) {
            super(message);
        }
    };
}
