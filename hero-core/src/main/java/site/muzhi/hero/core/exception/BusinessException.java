package site.muzhi.hero.core.exception;

import lombok.Data;
import site.muzhi.hero.core.api.ResultCode;

/**
 * @author lichuang
 * @date 2021/05/10
 * @description 通用异常
 */
@Data
public class BusinessException extends RuntimeException {
    static final long serialVersionUID = 1L;

    private Integer errorCode ;
    private String errorMessage ;

    public BusinessException(Integer errorCode, String errorMessage) {
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

    public BusinessException(ResultCode code) {
        this.errorCode = code.getCode();
        this.errorMessage = code.getMessage();
    }

    public Integer getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
