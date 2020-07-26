package org.designmodel.proxy.staticproxy;

/**
 * 具体的艺人，只需要做其分内的事
 */
public class ZYLStar implements IStar{

    @Override
    public void sing() {
        System.out.println("朱一龙唱歌啦");
    }
}
