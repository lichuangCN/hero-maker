package site.muzhi.hero.core.api;

import lombok.Getter;

/**
 * @author lichuang
 * @date 2021/05/10
 * @description
 */
@Getter
public enum ResultCode {

    SUCCESS(20000, "请求成功"),
    SERVER_INTERNAL_ERROR(50000, "服务器内部异常"),
    ;

    /**
     * 响应码
     */
    private Integer code;
    /**
     * 响应信息
     */
    private String message;

    ResultCode(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
