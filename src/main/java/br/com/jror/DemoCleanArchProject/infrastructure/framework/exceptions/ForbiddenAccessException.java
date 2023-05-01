package br.com.jror.DemoCleanArchProject.infrastructure.framework.exceptions;

public class ForbiddenAccessException extends Exception {
    public ForbiddenAccessException(String message) {
        super(message);
    }
    public ForbiddenAccessException(String message, Throwable cause) {
        super(message, cause);
    }
    public ForbiddenAccessException(Throwable cause) {
        super(cause);
    }
    public ForbiddenAccessException() {
        super();
    }
    
}
