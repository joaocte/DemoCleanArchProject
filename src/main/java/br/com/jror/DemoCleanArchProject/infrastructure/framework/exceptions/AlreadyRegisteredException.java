package br.com.jror.DemoCleanArchProject.infrastructure.framework.exceptions;

public class AlreadyRegisteredException extends Exception {
    public AlreadyRegisteredException(String message) {
        super(message);
    }
    public AlreadyRegisteredException(String message, Throwable cause) {
        super(message, cause);
    }
    public AlreadyRegisteredException(Throwable cause) {
        super(cause);
    }
    public AlreadyRegisteredException() {
        super();
    }
    
}
