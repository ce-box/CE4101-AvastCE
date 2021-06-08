package com.avastce.strategy;

public class Context {

    private IStrategy strategy;

    public Context(IStrategy strategy){
        this.strategy = strategy;
    }

    public void runScan(){
        this.strategy.scan();
    }
}
