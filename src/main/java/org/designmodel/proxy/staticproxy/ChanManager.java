package org.designmodel.proxy.staticproxy;

/**
 * 经纪人李婵
 */
public class ChanManager implements IStar {
    private IStar star;
    public ChanManager(){}
    public ChanManager(IStar star) {
        this.star = star;
    }
    @Override
    public void sing() {
        System.out.println("唱歌前的准备");
        star.sing();
        System.out.println("演出完后的事务");
    }
}
