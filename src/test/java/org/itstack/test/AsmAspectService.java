package org.itstack.test;

import org.itstack.sqm.asm.probe.ProfilingAspect;

public class AsmAspectService {

    public void testV() {
        long var0 = System.nanoTime();
        try {
            ApiTest apiTest = new ApiTest();
            apiTest.strToInt1("123445454");
            ProfilingAspect.point(var0, 0, (Object[]) null, (Object) null);
        } catch (Exception var3) {
            ProfilingAspect.point(var0, 0, (Object[]) null, var3);
            throw var3;
        }
    }

}
