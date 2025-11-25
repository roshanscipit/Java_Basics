package Sorting;

import java.util.ArrayList;
import java.util.List;      

public class comparable {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("John");  
        names.add("Alice");
        names.add("Bob");
        names.add("Diana");

        // sort using String's compareTo
        
         System.out.println("comparable interface example:");
        names.sort(String::compareTo);
        for (String name : names) {
            System.out.println(name);
        }


        // comparator with compare
        System.out.println("comparator with compare method example:");
        names.sort(new java.util.Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return a.length() - b.length(); // sort by length
            }
        });
        for (String name : names) {
            System.out.println(name);
        }
            


        List<Integer> ns = new ArrayList<Integer>();
        ns.add(10);
        System.out.println("List with Integer: " + ns);
        
        
    }
    }
    

    // compareTo removed because this class no longer implements Comparable
    

