package br.com.jror.DemoCleanArchProject.infrastructure.framework.exceptions;

public class UnauthorizedException extends Exception {
    public UnauthorizedException(String message) {
        super(message);
    }
    public UnauthorizedException(String message, Throwable cause) {
        super(message, cause);
    }
    public UnauthorizedException(Throwable cause) {
        super(cause);
    }
    public UnauthorizedException() {
        super();
    }
}
