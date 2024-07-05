package dev.thesloth.windows;

import com.sun.jna.Native;
import com.sun.jna.Library;

interface CLibrary extends Library {
    CLibrary INSTANCE = Native.load("msvcrt", CLibrary.class);
    void printf(String format, Object... args);
}

public class Main {
    public static void main(String[] args) {
        CLibrary.INSTANCE.printf("Hello, %s!\n", "Windows World");
    }
}