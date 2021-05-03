package com.lab_cycles.co1.q5;

public class CPU {

    int price;
    Processor processor = new Processor();
    RAM ram = new RAM();

    static class Processor
    {
        int cores;
        String manufacturer;
    }

    static class RAM
    {
        int memory;
        String manufacturer;
    }

    CPU(int cpuPrice,int cores,String cpuManufacturer,int memory,String ramManufacturer){
        this.price = cpuPrice;
        this.processor.cores = cores;
        this.processor.manufacturer = cpuManufacturer;
        this.ram.memory = memory;
        this.ram.manufacturer = ramManufacturer;
    }

    void printCPUSpecifications()
    {
        System.out.println("CPU Specifications");
        System.out.println("---------------------------------------------");
        System.out.println("CPU price : "+this.price);
        System.out.println("Processor cores : "+this.processor.cores);
        System.out.println("Processor manufacturer : "+this.processor.manufacturer);
        System.out.println("RAM memory : "+this.ram.memory);
        System.out.println("RAM manufacturer : "+this.ram.manufacturer);
        System.out.println("---------------------------------------------");
    }

}
