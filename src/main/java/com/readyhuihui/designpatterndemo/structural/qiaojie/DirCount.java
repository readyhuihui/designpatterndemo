package com.readyhuihui.designpatterndemo.structural.qiaojie;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @description
 * @author liyonghui@cdvcloud.com
 * @date 2021/4/15 8:24 
 **/
public class DirCount {

    private volatile long total;

    public void add(long addNum) {
        total += addNum;
    }

    public long getCount() {
        return total;
    }
}

class DemoRun implements Runnable {


    private DirCount dirCount;
    private String dirPath;
    private ReentrantLock lock;
    private CountDownLatch latch;

    public DemoRun(DirCount dirCount, String dirPath, ReentrantLock lock,CountDownLatch latch) {
        this.dirCount = dirCount;
        this.dirPath = dirPath;
        this.lock = lock;
        this.latch = latch;
    }

    @Override
    public void run() {
        lock.lock();
        try {
            dirCount.add(FileUtils.sizeOfDirectory(new File(dirPath)));

        } finally {
            latch.countDown();
            lock.unlock();
        }

    }
}

class CounThread implements Runnable {

    private DirCount dirCount;

    public CounThread(DirCount dirCount) {
        this.dirCount = dirCount;
    }

    @Override
    public void run() {
        System.out.println("总数：" + dirCount.getCount());
    }
}

class Test1 {
    public static void main(String[] args) throws InterruptedException {
        DirCount dirCount = new DirCount();
        ReentrantLock lock = new ReentrantLock();
        CountDownLatch latch = new CountDownLatch(3);
        new Thread(new DemoRun(dirCount, "D:\\data\\1", lock,latch)).start();
        new Thread(new DemoRun(dirCount, "D:\\data\\2", lock,latch)).start();
        new Thread(new DemoRun(dirCount, "D:\\data\\3", lock,latch)).start();

//        Thread.sleep(1000);
        latch.await();
        new Thread(new CounThread(dirCount)).start();
        //4651063
//        long result = FileUtils.sizeOfDirectory(new File("D:\\data\\1"))+FileUtils.sizeOfDirectory(new File("D:\\data\\2"))+FileUtils.sizeOfDirectory(new File("D:\\data\\3"));
//        System.out.println(result);
    }
}