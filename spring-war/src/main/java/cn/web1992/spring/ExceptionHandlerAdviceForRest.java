package cn.web1992.spring;

import cn.web1992.exception.RestException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author web1992
 * @date 2020/1/15  17:10
 */
@RestControllerAdvice
public class ExceptionHandlerAdviceForRest {

    @ExceptionHandler(RestException.class)
    public String customGenericExceptionHandler(RestException exception) {
        return "RestException " + exception.getMessage();
    }

    @ExceptionHandler(Throwable.class)
    public String throwable(Throwable exception) {
        return "Throwable " + exception.getMessage();
    }

}
