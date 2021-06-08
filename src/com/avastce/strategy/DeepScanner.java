package com.avastce.strategy;

public abstract class DeepScanner implements IStrategy{

    @Override
    public void scan() {
        begin();
        scanMemory();
        scanKeyloggers();
        scanRootKits();
        scanPrograms();
        unzipFiles();
        stop();
    }

    abstract void begin();
    abstract void scanMemory();
    abstract void scanKeyloggers();
    abstract void scanRootKits();
    abstract void scanPrograms();
    abstract void unzipFiles();
    abstract void stop();

}
