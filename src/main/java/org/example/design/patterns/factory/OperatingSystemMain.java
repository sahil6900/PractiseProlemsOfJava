package org.example.design.patterns.factory;

public class OperatingSystemMain {
    public static void main(String[] args) {
        OperatingSystem OS = OperatingSystemFactory.getOS("djfs");
        OS.OS();
    }
}
