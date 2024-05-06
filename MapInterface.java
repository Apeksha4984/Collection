
package com.mycompany.collection;

import java.util.HashMap;


public class MapInterface {
    public static void main(String[]args){
        HashMap <Integer,String> map = new HashMap<>();
        map.put(101, "aarav");
        map.put(102, "anjali");
        map.put(103, "neha");
        map.put(104, "kajal");
        map.put(105, "deepa");
        map.put(106, "arpita");
        map.put(107, "avani");
        map.put(108, "payal");
        System.out.println(map);
        map.remove(103);
        System.out.println(map);
        System.out.println(map.containsKey(104));
        System.out.println(map.containsValue("anjali"));
        System.out.println(map.containsKey(103));
        System.out.println(map.containsValue("avani"));
    }
    
}
