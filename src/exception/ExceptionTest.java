package exception;

import java.io.EOFException;

public class ExceptionTest {
    public static void main(String[] args) throws EOFException {
        String gripe = "shiny - Exception: EOFException";
        throw new EOFException(gripe);
    }
}
