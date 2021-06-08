package com.avastce.strategy;

public abstract class QuickScanner implements IStrategy{

    @Override
    public void scan() {
        begin();
        skipZipFiles();
        stop();
    }

    abstract void begin();
    abstract void skipZipFiles();
    abstract void stop();
}
