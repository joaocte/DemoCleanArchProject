package br.com.jror.DemoCleanArchProject.infrastructure.framework.exceptions;

public class InfrastructureException extends Exception {
    public InfrastructureException(String message) {
        super(message);
    }
    public InfrastructureException(String message, Throwable cause) {
        super(message, cause);
    }
    public InfrastructureException(Throwable cause) {
        super(cause);
    }
    public InfrastructureException() {
        super();
    }
}
