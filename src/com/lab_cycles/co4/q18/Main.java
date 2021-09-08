package com.lab_cycles.co4.q18;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Map<Integer,String> hm=new LinkedHashMap<>();
        hm.put(1,"England");
        hm.put(1,"Spain");
        hm.put(2,"France");
        hm.put(5,"Brazil");
        hm.put(2,"Argentina");
        System.out.println("HashMap:"+hm);
        Map<Integer,String> tm=new TreeMap<>(hm);
        System.out.println("\n ******* Convert HashMap to TreeMap *******\n");
        System.out.println("TreeMap:"+tm);
    }
}