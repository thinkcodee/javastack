package cn.javastack.test.designpattern.bridge;

/**
 * 直线
 * 公众号：Java技术栈
 */
public class StraightLine implements Shape {

    @Override
    public String draw() {
        return "直线";
    }

}