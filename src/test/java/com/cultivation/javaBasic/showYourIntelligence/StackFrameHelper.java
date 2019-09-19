package com.cultivation.javaBasic.showYourIntelligence;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class StackFrameHelper {
    public static String getCurrentMethodName() {
        // TODO: please modify the following code to pass the test
        // <--start
        StackTraceElement stacktrace = Thread.currentThread().getStackTrace()[2];
        return stacktrace.getClassName() + '.' + stacktrace.getMethodName();
        // --end-->
    }
}
