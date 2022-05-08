package site.muzhi.hero.core.api;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author lichuang
 * @date 2021/05/10
 * @description
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Result<T> {

    /**
     * 响应码
     */
    private Integer code;

    /**
     * 响应信息
     */
    private String message;

    /**
     * 响应数据
     */
    private T data;

    protected Result(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
