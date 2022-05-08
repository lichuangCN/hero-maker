package site.muzhi.hero.center.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import site.muzhi.hero.core.api.Result;
import site.muzhi.hero.core.api.ResultFactory;
import site.muzhi.hero.core.exception.BusinessException;

/**
 * @author lichuang
 * @date 2022/05/08
 * @description
 */
@Slf4j
@ControllerAdvice
public class GlobalExceptionHandler {

    /**
     * 处理自定义的业务异常
     */
    @ExceptionHandler(value = BusinessException.class)
    @ResponseBody
    public Result bizExceptionHandler(BusinessException e) {
        Result<Object> fail = ResultFactory.fail(e.getErrorMessage());
        return fail;
    }
}
