package com.v51das.dobin.core.exception;

/**
 * 自定义异常
 * @author dobin
 * @date March 12, 2021
 */
public class DobinException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	
    private String msg;
    private int code = 500;
    
    public DobinException(String msg) {
		super(msg);
		this.msg = msg;
	}
	
	public DobinException(String msg, Throwable e) {
		super(msg, e);
		this.msg = msg;
	}
	
	public DobinException(String msg, int code) {
		super(msg);
		this.msg = msg;
		this.code = code;
	}
	
	public DobinException(String msg, int code, Throwable e) {
		super(msg, e);
		this.msg = msg;
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}
	
}
