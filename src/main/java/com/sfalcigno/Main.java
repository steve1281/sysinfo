package com.sfalcigno;

import com.sun.management.OperatingSystemMXBean;
import java.lang.management.ManagementFactory;

public class Main {

    public static void main(String[] args) {
        double BING = 1073741824.0;
        System.out.println("Hello, World");
        OperatingSystemMXBean osBean = ManagementFactory.getPlatformMXBean(
                OperatingSystemMXBean.class);
        System.out.println("architecture    : " + osBean.getArch()); 
        System.out.println("processors      : " + osBean.getAvailableProcessors()); 
        System.out.println("version         : " + osBean.getVersion());
        System.out.println("system load avg : " + osBean.getSystemLoadAverage());
        System.out.println("physical memory : " + osBean.getTotalPhysicalMemorySize()/BING);
        System.out.println("free phy memory : " + osBean.getFreePhysicalMemorySize()/BING);
    }
}
