package site.muzhi.hero.center.util;

import site.muzhi.hero.core.util.DateUtils;

import java.time.LocalDateTime;

/**
 * @author lichuang
 * @date 2022/05/08
 * @description
 */
public class HeroNameUtils {

    private static String DEFAULT_NAME = "hero-";

    public static String makeRandomName() {
        String format = DateUtils.format(LocalDateTime.now(), DateUtils.DATE_FULL_STR_3);
        return DEFAULT_NAME + format;
    }
}
