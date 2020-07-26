package org.jvm;

/**
 * 动态对象年龄判断
 */
public class TenuringThreshold {
    private static final int _1MB = 1024*1024;
    /**
     * VM参数：-verbose:gc -Xmx20M -Xmn10M
     * -XX:+PrintGCDetails -XX:SurvivorRatio=8
     * -XX:MaxTenuringThreshold=15
     * -XX:+PrintTenuringDistribution
     */
    public static void testTenuringShresholdhold(){
        byte[] allocation1,allocation2,allocation3,allocation4;
        allocation1 = new byte[_1MB/4];
        allocation2 = new byte[_1MB/4];
        allocation3 = new byte[4*_1MB];
        allocation4 = new byte[4*_1MB];
        allocation4 = null;
        allocation4 = new byte[4*_1MB];
    }

    public static void main(String[] args) {
        TenuringThreshold .testTenuringShresholdhold();
    }
}
