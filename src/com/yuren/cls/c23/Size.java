package com.yuren.cls.c23;

/**
 * Created with Intellij IDEA.
 * Description:
 *
 * @author lujiang
 * @date 2019-06-23 23:41
 */
public enum Size {
    /**
     * 小
     */
    SMALL("S", "小号"),
    /**
     * 中
     */
    MEDIUM("M", "中号"),
    /**
     * 大
     */
    LARGE("L", "大号"),
    ;


    private String abbr;
    private String title;

    Size(String abbr, String title) {
        this.abbr = abbr;
        this.title = title;
    }

    public static Size fromAbbr(String abbr) {
        for (Size size : Size.values()) {
            if (size.getAbbr().equals(abbr)) {
                return size;
            }
        }
        return null;
    }

    public String getAbbr() {
        return abbr;
    }

    public String getTitle() {
        return title;
    }
}
