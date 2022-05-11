package site.muzhi.hero.core.constant;

import lombok.Getter;
import org.apache.commons.lang3.StringUtils;

/**
 * @author lichuang
 * @date 2022/05/11
 * @description 世界职业
 */
@Getter
public enum WorldOccupationEnum {
    WARRIOR(1, "战士"),
    SORCERER(2, "术士"),
    ;

    private Integer code;
    private String desc;

    WorldOccupationEnum(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public static Integer code(String desc) {
        for (WorldOccupationEnum value : values()) {
            if (value.getDesc().equals(desc)) {
                return value.getCode();
            }
        }
        return null;
    }

    public static String desc(Integer code) {
        for (WorldOccupationEnum value : values()) {
            if (value.getCode().equals(code)) {
                return value.getDesc();
            }
        }
        return StringUtils.EMPTY;
    }
}
