package org.example.design.patterns.builder;

public class LaptopBuilder {

    private int ram;
    private String displaySize;
    private int cores;
    private int threads;
    private String graphicsCard;

    public int getRam() {
        return ram;
    }

    public LaptopBuilder setRam(int ram) {
        this.ram = ram;
        return this;
    }

    public String getDisplaySize() {
        return displaySize;
    }

    public LaptopBuilder setDisplaySize(String displaySize) {
        this.displaySize = displaySize;
        return this;
    }

    public int getCores() {
        return cores;
    }

    public LaptopBuilder setCores(int cores) {
        this.cores = cores;

        return this;
    }

    public int getThreads() {
        return threads;
    }

    public LaptopBuilder setThreads(int threads) {
        this.threads = threads;

        return this;
    }

    public String getGraphicsCard() {
        return graphicsCard;
    }

    public LaptopBuilder setGraphicsCard(String graphicsCard) {
        this.graphicsCard = graphicsCard;

        return this;
    }

    public Laptop build(){
       return new Laptop(this.ram,this.displaySize,this.cores,this.threads,this.graphicsCard);
    }
}
