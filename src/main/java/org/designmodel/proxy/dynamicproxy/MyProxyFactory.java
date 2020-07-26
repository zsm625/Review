package org.designmodel.proxy.dynamicproxy;

import java.lang.reflect.Proxy;

public class MyProxyFactory {
    public static Object getProxy(Object target){
        MyInvocationHandle handle = new MyInvocationHandle();
        handle.setTarget(target);
        Object proxy = Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),handle);
        return proxy;
    }
}
