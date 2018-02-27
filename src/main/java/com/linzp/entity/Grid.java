package com.linzp.entity;

import java.util.ArrayList;
import java.util.List;

public class Grid implements java.io.Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 5851869818110647734L;
    private Long total = 0L;
    private List<?> rows = new ArrayList<>();
    private String errorMsg;
    private String message;
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public List<?> getRows() {
        return rows;
    }

    public void setRows(List<?> rows) {
        this.rows = rows;
    }

}
