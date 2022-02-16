package com.grogu.distributary.framework.distributaryframework.exception;

/**
 * TOOD
 *
 * @author long
 * @date 2022-02-17 2:10
 */
public class CacheLockException extends Throwable{
    private String msg;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public CacheLockException(String msg) {
        this.msg = msg;
    }

    public CacheLockException() {
    }

}
