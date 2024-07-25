package com.student.student.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class AppError {
    private String errorDescription;
    private int statusCode;
    private Date date;

    public AppError(String invalid, Date date, int i) {
    }
}
