package com.sfalcigno;

import java.io.File;
import com.sun.management.OperatingSystemMXBean;
import java.lang.management.ManagementFactory;

public class Main {

    public static void main(String[] args) 
    {
        getArchitectureStats();
        getFileSystemStats();
    }
    private static void getArchitectureStats()
    {
        double BING = 1073741824.0;
    	System.out.println("\n === Architecture Detail ===\n");
        OperatingSystemMXBean osBean = ManagementFactory.getPlatformMXBean(
                OperatingSystemMXBean.class);
        System.out.println("architecture    : " + osBean.getArch()); 
        System.out.println("processors      : " + osBean.getAvailableProcessors()); 
        System.out.println("version         : " + osBean.getVersion());
        System.out.println("system load avg : " + osBean.getSystemLoadAverage());
        System.out.println("physical memory : " + osBean.getTotalPhysicalMemorySize()/BING);
        System.out.println("free phy memory : " + osBean.getFreePhysicalMemorySize()/BING);
    }
    private static void getFileSystemStats() 
    {
    	File file = new File("/");
    	long totalSpace = file.getTotalSpace(); //total disk space in bytes.
    	long usableSpace = file.getUsableSpace(); ///unallocated / free disk space in bytes.
    	long freeSpace = file.getFreeSpace(); //unallocated / free disk space in bytes.

    	System.out.println("\n === Partition Detail ===\n");

    	System.out.println("Total  size : " + totalSpace /1024 /1024 + " mb");
    	System.out.println("Usable free : " + usableSpace /1024 /1024 + " mb");
    	System.out.println("Space  free : " + freeSpace /1024 /1024 + " mb");
    }
}
