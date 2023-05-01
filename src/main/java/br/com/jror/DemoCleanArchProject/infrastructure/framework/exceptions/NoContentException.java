package br.com.jror.DemoCleanArchProject.infrastructure.framework.exceptions;

public class NoContentException extends Exception {
    public NoContentException(String message) {
        super(message);
    }
    public NoContentException(String message, Throwable cause) {
        super(message, cause);
    }
    public NoContentException(Throwable cause) {
        super(cause);
    }
    public NoContentException() {
        super();
    }
}
