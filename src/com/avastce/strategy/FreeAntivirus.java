package com.avastce.strategy;

public class FreeAntivirus extends QuickScanner {
    @Override
    void begin() {
        System.out.println("AvastCE is running a Fast Scan Routine ...");
    }

    @Override
    void skipZipFiles(){
        try {
            System.out.println("Scanning ...");
            Thread.sleep(2500);
            System.out.println("The AvastCE free plan does not allow you to scan zip files.");
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    @Override
    void stop() {
        System.out.println("Fast Scan Routine Finished.");
    }
}
