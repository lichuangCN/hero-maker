package site.muzhi.hero.core.api;

/**
 * @author lichuang
 * @date 2021/05/10
 * @description
 */
public class ResultFactory {

    public static <T> Result<T> ok() {
        Result<T> result = new Result<>(ResultCode.SUCCESS.getCode(), ResultCode.SUCCESS.getMessage());
        return result;
    }

    public static <T> Result<T> ok(T data) {
        Result<T> result = new Result<>(ResultCode.SUCCESS.getCode(), ResultCode.SUCCESS.getMessage(), data);
        return result;
    }

    public static <T> Result<T> fail() {
        Result<T> result = new Result<>(ResultCode.SERVER_INTERNAL_ERROR.getCode(), ResultCode.SERVER_INTERNAL_ERROR.getMessage());
        return result;
    }

    public static <T> Result<T> fail(String message) {
        Result<T> result = new Result<>(ResultCode.SERVER_INTERNAL_ERROR.getCode(), message);
        return result;
    }
}
