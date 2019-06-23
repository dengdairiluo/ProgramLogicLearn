package com.yuren.cls.c23;

/**
 * Created with Intellij IDEA.
 * Description:
 *
 * @author lujiang
 * @date 2019-06-23 23:41
 */
public class Demo {

    static void onChosen(Size size) {
        switch (size) {
            case SMALL:
                System.out.println("chosen small");
                break;
            case MEDIUM:
                System.out.println("chosen medium");
                break;
            case LARGE:
                System.out.println("chosen large");
                break;
        }
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }
}
