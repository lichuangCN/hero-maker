package site.muzhi.hero.core.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * @author lichuang
 * @date 2022/05/08
 * @description
 */
public class DateUtils {

    /**
     * 定义常量
     */
    public static final String DATE_FULL_STR_1 = "yyyy-MM-dd HH:mm:ss";
    public static final String DATE_FULL_STR_2 = "yyyy-MM-dd HH:mm:ss.SSS";
    public static final String DATE_FULL_STR_3 = "yyyyMMddHHmmssSSS";

    public static Date parse(String dateStr, String pattern) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat(pattern);
        Date date = format.parse(dateStr);
        return date;
    }

    public static Date parse(String dateStr) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat(DATE_FULL_STR_1);
        Date date = format.parse(dateStr);
        return date;
    }

    public static String format(Date date, String pattern) {
        SimpleDateFormat format = new SimpleDateFormat(pattern);
        String dateStr = format.format(date);
        return dateStr;
    }

    public static String format(Date date) {
        SimpleDateFormat format = new SimpleDateFormat(DATE_FULL_STR_1);
        String dateStr = format.format(date);
        return dateStr;
    }

    public static String format(LocalDateTime date) {
        DateTimeFormatter format = DateTimeFormatter.ofPattern(DATE_FULL_STR_1);
        String dateStr = format.format(date);
        return dateStr;
    }

    public static String format(LocalDateTime date, String pattern) {
        DateTimeFormatter format = DateTimeFormatter.ofPattern(pattern);
        String dateStr = format.format(date);
        return dateStr;
    }
}
