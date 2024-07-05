package dev.thesloth.mac;

import com.sun.jna.Library;
import com.sun.jna.Native;

interface CLibrary extends Library {
    CLibrary INSTANCE = Native.load("System", CLibrary.class);
    void printf(String format, Object... args);
}

public class Main {
    public static void main(String[] args) {
        CLibrary.INSTANCE.printf("Hello, %s!\n", "macOS World");
    }
}