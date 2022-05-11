package site.muzhi.hero.core.constant;

import lombok.Getter;
import org.apache.commons.lang3.StringUtils;

/**
 * @author lichuang
 * @date 2022/05/11
 * @description 世界种族
 */
@Getter
public enum WorldRaceEnum {

    HUMAN(1, "战士"),
    SPRITE(2, "精灵"),
    DEMI_HUMAN(3, "亚人"),
    ;
    
    private Integer code;
    private String desc;

    WorldRaceEnum(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public static Integer code(String desc) {
        for (WorldRaceEnum value : values()) {
            if (value.getDesc().equals(desc)) {
                return value.getCode();
            }
        }
        return null;
    }

    public static String desc(Integer code) {
        for (WorldRaceEnum value : values()) {
            if (value.getCode().equals(code)) {
                return value.getDesc();
            }
        }
        return StringUtils.EMPTY;
    }

}
