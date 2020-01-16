package cn.web1992.exception;

/**
 * @author web1992
 * @date 2020/1/16  10:50
 */
public class UnauthorizedException extends RuntimeException {

    public UnauthorizedException(String message) {
        super(message);
    }
}
