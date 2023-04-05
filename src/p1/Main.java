package p1;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Map<String,Integer> hashMapList = new HashMap<>();
        hashMapList.put("Son",19);
        hashMapList.put("Son",29);
//       HashMap receive only the last value putted in that have same key//
        hashMapList.put("Nam",39);
        hashMapList.put("Giang",60);
        hashMapList.put("Thi",29);
        hashMapList.put("Cong",20);
        System.out.println("HashMap before put: " + hashMapList);
        hashMapList.put("Chung",39);
        System.out.println("HashMap after put: " + hashMapList);
        System.out.println("the order is NOT maintain (by TreeNode)");
        Map<String,Integer> treeMapList = new TreeMap<>();
        for(String key : hashMapList.keySet()){
            treeMapList.put(key,hashMapList.get("Son"));
        }
        System.out.println("TreeMapList" + treeMapList);
        System.out.println("sorted by Keys");
        System.out.println("TreeMap.ketSet" + treeMapList.keySet());
        System.out.println(("array of key"));
        System.out.println("TreeMap.entrySet" + treeMapList.entrySet()); // .entrySet return to both key and value as an array, so we can use for to check this array and take both that value//
        for (Map.Entry<String, Integer> list: treeMapList.entrySet()) {
            System.out.println("key: " + list.getKey() + " value: " + list.getValue());  // =>>>>>>>>>> This one is right since .entrySet return an array;
        }
//        for (Map.Entry<String, Integer> list: treeMapList) {
//            System.out.println("key: " + list.getKey() + " value: " + list.getValue());  //======>>>>>>>>>> This one is wrong since treeMapList is not an array
//        }

        Map<String,Integer> linkedHashMapList = new LinkedHashMap<>(16,0.75f,true);
        for (Map.Entry<String,Integer> list : hashMapList.entrySet()){
            linkedHashMapList.put(list.getKey(), list.getValue());
        }
        linkedHashMapList.put("Hung",39);
        linkedHashMapList.put("Tuan",39);
        System.out.println("My linkedHashMapList: " + linkedHashMapList);
        System.out.println("LinkedHashMapList is kind of HashMap List but remain the order of key, put new will be add to the last");

    }
}
