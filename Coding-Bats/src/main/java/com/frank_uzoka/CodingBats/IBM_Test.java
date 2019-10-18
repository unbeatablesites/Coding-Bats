package com.frank_uzoka.CodingBats;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class IBM_Test {

    public static void maximumContainers(List<String> scenarios) {

        for(int i = 1; i <= Integer.parseInt(scenarios.get(0)); i++){
            //System.out.println(scenarios.get(i));
            String[] parts = scenarios.get(i).split("\\s+");

            int n = Integer.parseInt(parts[0]);
            int cost = Integer.parseInt(parts[1]);
            int m = Integer.parseInt(parts[2]);
            int totalContainer = n/cost;
            int containers = totalContainer;
            while(containers>=m){
                int free = containers/m;
                if(free > 0){
                    containers = containers - (free * m) + free;
                    totalContainer += free;
                }
            }
            System.out.println(totalContainer);
        }
        // Write your code here

    }

    public static void main(String[] args) {
        List<String> scenarios = new ArrayList<>();

        scenarios.add("3");
        scenarios.add("10  2 5");
        scenarios.add("12 4 4");
        scenarios.add("6 2 2");

        maximumContainers(scenarios);
    }

    public static long carParkingRoof(List<Long> cars, int k) {
        Collections.sort(cars);
        long shortestLength = 0;
        for(int i = 0; i <= cars.size() - k; i++){
            long len = cars.get(i+k-1) - cars.get(i) + 1;
            if(shortestLength == 0){
                shortestLength = len;
            }else{
                if(len < shortestLength){
                    shortestLength = len;
                }
            }
        }

        return shortestLength;
    }
    public static List<Integer> mergeArrays(List<Integer> a, List<Integer> b) {

        List<Integer> sortedList = new ArrayList<>();

        sortedList.addAll(a);
        sortedList.addAll(b);

        Collections.sort(sortedList);


        // Write your code herev
        return sortedList;
    }
}




