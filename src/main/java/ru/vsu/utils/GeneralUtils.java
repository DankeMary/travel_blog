package ru.vsu.utils;

public class GeneralUtils {
    public static final int MAX_PAGE_RESULT = 10;
    public static final String EMPTY_RESPONSE_OK = "{}";
    public static Integer parseIntForPage(String str, int min, int max) {
        Integer pageInt;
        try {
            pageInt = Integer.valueOf(str);

            if (pageInt < min)
                pageInt = min;
            else if (pageInt > max)
                pageInt = max;
        } catch (NumberFormatException e) {
            pageInt = null;
        }
        return pageInt;
    }
}