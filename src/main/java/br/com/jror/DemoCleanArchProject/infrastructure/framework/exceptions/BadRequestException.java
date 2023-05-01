package br.com.jror.DemoCleanArchProject.infrastructure.framework.exceptions;

public class BadRequestException extends Exception {
    public BadRequestException(String message) {
        super(message);
    }
    public BadRequestException(String message, Throwable cause) {
        super(message, cause);
    }
    public BadRequestException(Throwable cause) {
        super(cause);
    }
    public BadRequestException() {
        super();
    }
    
}
