package org.designmodel.proxy.staticproxy;

/**
 * 测试，在不修改目标对象的功能前提下，对目标功能扩展
 */
public class TestStaticProxy {
    public static void main(String[] args) {
        ZYLStar zyl = new ZYLStar();
        ChanManager chan = new ChanManager(zyl);
        chan.sing();
    }
}
