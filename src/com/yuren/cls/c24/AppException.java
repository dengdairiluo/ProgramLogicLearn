package com.yuren.cls.c24;

/**
 * Created with Intellij IDEA.
 * Description:
 *
 * @author lujiang
 * @date 2019-06-23 23:47
 */
public class AppException extends Exception {

    private static final long serialVersionUID = 1L;

    public AppException() {
        super();
    }

    public AppException(String message,
                        Throwable cause) {
        super(message, cause);
    }

    public AppException(String message) {
        super(message);
    }

    public AppException(Throwable cause) {
        super(cause);
    }
}
