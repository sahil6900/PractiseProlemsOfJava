package org.example.design.patterns.builder;

public class LaptopMain {
    public static void main(String[] args) {

        Laptop laptop1 = new LaptopBuilder().setCores(4).setDisplaySize("1080p")
                .setRam(8).setGraphicsCard("Nvdia").setThreads(6).build();

        Laptop laptop2 = new LaptopBuilder().setCores(6).setThreads(8).build();

        System.out.println(laptop1);

        System.out.println(laptop2);
    }
}
