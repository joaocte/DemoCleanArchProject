package br.com.jror.DemoCleanArchProject.infrastructure.framework.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class ProblemDetails {
    private String type;
    private String title;
    private String detail;
    private int status;
    private Date date;

    public ProblemDetails(String type, String title, String detail, int status, Date date) {
        this.type = type;
        this.title = title;
        this.detail = detail;
        this.status = status;
        this.date = date;
    }
}
