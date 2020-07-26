package org.designmodel.proxy.staticproxy;

/**
 * 一个最简单的例子：
 * 明星与经纪人（被代理类和代理类），明星作为目标对象，
 * 明星只需要执行商演活动的内容，其余事情由经纪人来做
 */
public interface IStar {
    public abstract void sing();
}
