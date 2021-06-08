package com.avastce.strategy;

public class ProAntivirus extends DeepScanner{
    @Override
    void begin() {
        System.out.println("AvastCE is running a Deep Scan Routine ...");
    }

    @Override
    void scanMemory() {
        try {
            System.out.println("Scanning Memory...");
            Thread.sleep(1000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    @Override
    void scanKeyloggers() {
        try {
            System.out.println("Looking for keyloggers ...");
            Thread.sleep(1000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    @Override
    void scanRootKits() {
        try {
            System.out.println("Looking for RootKits...");
            Thread.sleep(1000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    @Override
    void scanPrograms() {
        try {
            System.out.println("Scanning Programs...");
            Thread.sleep(2500);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    @Override
    void unzipFiles() {
        try {
            System.out.println("Scanning ZIP Files...");
            Thread.sleep(1000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    @Override
    void stop() {
        System.out.println("Deep Scan Routine Finished.");
    }
}
