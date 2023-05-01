package br.com.jror.DemoCleanArchProject.infrastructure.framework.Filters;
import br.com.jror.DemoCleanArchProject.infrastructure.framework.model.ProblemDetails;
import br.com.jror.DemoCleanArchProject.infrastructure.framework.exceptions.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.Date;

@RestControllerAdvice
public class ExceptionAdvice extends ResponseEntityExceptionHandler {


    @ExceptionHandler(value = {BadRequestException.class})
    public ResponseEntity<ProblemDetails> resourceException(BadRequestException ex, WebRequest request) {
        ProblemDetails message = new ProblemDetails(
                "https://developer.mozilla.org/en-US/docs/Web/HTTP/Status/400",
                "Bad Request",
                ex.getMessage(),
                HttpStatus.BAD_REQUEST.value(),
                new Date());
        return new ResponseEntity<>(message, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(value = {AlreadyRegisteredException.class})
    public ResponseEntity<ProblemDetails> resourceException(AlreadyRegisteredException ex, WebRequest request) {
        ProblemDetails message = new ProblemDetails(
                "https://developer.mozilla.org/en-US/docs/Web/HTTP/Status/409",
                "The request could not be completed due to a conflict.",
                ex.getMessage(),
                HttpStatus.CONFLICT.value(),
                new Date());
        return new ResponseEntity<>(message, HttpStatus.CONFLICT);
    }
    @ExceptionHandler(value = {ForbiddenAccessException.class})
    public ResponseEntity<ProblemDetails> resourceException(ForbiddenAccessException ex, WebRequest request) {
        ProblemDetails message = new ProblemDetails(
                "https://developer.mozilla.org/en-US/docs/Web/HTTP/Status/403",
                "The client did not have permission to access the requested resource.",
                ex.getMessage(),
                HttpStatus.FORBIDDEN.value(),
                new Date());
        return new ResponseEntity<>(message, HttpStatus.FORBIDDEN);
    }
    @ExceptionHandler(value = {UnauthorizedException.class})
    public ResponseEntity<ProblemDetails> resourceException(UnauthorizedException ex, WebRequest request) {
        ProblemDetails message = new ProblemDetails(
                "https://developer.mozilla.org/en-US/docs/Web/HTTP/Status/401",
                "Access denied!",
                ex.getMessage(),
                HttpStatus.UNAUTHORIZED.value(),
                new Date());
        return new ResponseEntity<>(message, HttpStatus.UNAUTHORIZED);
    }
    @ExceptionHandler(value = {Exception.class})
    public ResponseEntity<ProblemDetails> resourceException(Exception ex, WebRequest request) {
        ProblemDetails message = new ProblemDetails(
                "https://developer.mozilla.org/en-US/docs/Web/HTTP/Status/500",
                "The server was unavailable.",
                ex.getMessage(),
                HttpStatus.INTERNAL_SERVER_ERROR.value(),
                new Date());
        return new ResponseEntity<>(message, HttpStatus.INTERNAL_SERVER_ERROR);
    }
    @ExceptionHandler(value = {InfrastructureException.class})
    public ResponseEntity<ProblemDetails> resourceException(InfrastructureException ex, WebRequest request) {
        ProblemDetails message = new ProblemDetails(
                "https://developer.mozilla.org/en-US/docs/Web/HTTP/Status/503",
                "The server was unavailable.",
                ex.getMessage(),
                HttpStatus.SERVICE_UNAVAILABLE.value(),
                new Date());
        return new ResponseEntity<>(message, HttpStatus.SERVICE_UNAVAILABLE);
    }

    @ExceptionHandler(value = {NoContentException.class})
    public ResponseEntity<ProblemDetails> resourceException(NoContentException ex, WebRequest request) {
        ProblemDetails message = new ProblemDetails(
                "https://developer.mozilla.org/en-US/docs/Web/HTTP/Status/204",
                "The server has fulfilled the request but does not need to return a response body.",
                ex.getMessage(),
                HttpStatus.NO_CONTENT.value(),
                new Date());
        return new ResponseEntity<>(message, HttpStatus.NO_CONTENT);
    }
    @ExceptionHandler(value = {NotFoundException.class})
    public ResponseEntity<ProblemDetails> resourceException(NotFoundException ex, WebRequest request) {
        ProblemDetails message = new ProblemDetails(
                "https://developer.mozilla.org/en-US/docs/Web/HTTP/Status/404",
                "The requested resource was not found.",
                ex.getMessage(),
                HttpStatus.NOT_FOUND.value(),
                new Date());
        return new ResponseEntity<>(message, HttpStatus.NOT_FOUND);
    }
}
