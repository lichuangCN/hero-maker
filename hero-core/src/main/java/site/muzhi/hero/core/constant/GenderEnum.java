package site.muzhi.hero.core.constant;

import lombok.Getter;

/**
 * @author lichuang
 * @date 2022/05/08
 * @description
 */
@Getter
public enum GenderEnum {
    BOY(1,"BOY"),
    GIRL(2,"GIRL"),
    ;

    private Integer code;
    private String desc;

    GenderEnum(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }
}
