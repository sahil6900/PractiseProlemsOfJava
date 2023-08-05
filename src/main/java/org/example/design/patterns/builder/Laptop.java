package org.example.design.patterns.builder;

public class Laptop {

    private int ram;
    private String displaySize;
    private int cores;
    private int threads;
    private String graphicsCard;

    public Laptop(int ram, String displaySize, int cores, int threads, String graphicsCard) {
        this.ram = ram;
        this.displaySize = displaySize;
        this.cores = cores;
        this.threads = threads;
        this.graphicsCard = graphicsCard;
    }

    public Laptop() {
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("Laptop{");
        if (ram != 0) {
            stringBuilder.append("ram=").append(ram).append(", ");
        }
        if (displaySize != null) {
            stringBuilder.append("displaySize='").append(displaySize).append('\'').append(", ");
        }
        if (cores != 0) {
            stringBuilder.append("cores=").append(cores).append(", ");
        }
        if (threads != 0) {
            stringBuilder.append("threads=").append(threads).append(", ");
        }
        if (graphicsCard != null) {
            stringBuilder.append("graphicsCard='").append(graphicsCard).append('\'');
        }
        // Remove the trailing comma and space if any
        if (stringBuilder.charAt(stringBuilder.length() - 2) == ',') {
            stringBuilder.delete(stringBuilder.length() - 2, stringBuilder.length());
        }
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
