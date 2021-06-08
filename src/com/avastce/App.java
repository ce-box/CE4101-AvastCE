package com.avastce;

import com.avastce.strategy.Context;
import com.avastce.strategy.FreeAntivirus;
import com.avastce.strategy.ProAntivirus;

public class App {
    public static void main(String[] args) {
        Context avastCE = new Context(new ProAntivirus());
        avastCE.runScan();
    }
}
