/*Implement the RandomizedSet class:
RandomizedSet() Initializes the RandomizedSet object.
bool insert(int val) Inserts an item val into the set if not present. Returns true if the item was not present, false otherwise.
bool remove(int val) Removes an item val from the set if present. Returns true if the item was present, false otherwise.
int getRandom() Returns a random element from the current set of elements (it's guaranteed that at least one element exists when this method is called). Each element must have the same probability of being returned.
You must implement the functions of the class such that each function works in average O(1) time complexity.*/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class problem380 {
    public static class RandomizedSet {

    private Map<Integer, Integer> valToIndex;
    private List<Integer> values;
    private Random rand;

    public RandomizedSet() {
        valToIndex = new HashMap<>();
        values = new ArrayList<>();
        rand = new Random();
    }
    
    public boolean insert(int val) {
        if(valToIndex.containsKey(val))
        {
            return false;
        }
        valToIndex.put(val,values.size());  
        values.add(val);
        return true;
    }
    
    public boolean remove(int val) {
        if(!valToIndex.containsKey(val))
        {
            return false;
        }
        int indexToRemove = valToIndex.get(val);
        int lastvalue = values.get(values.size()-1);
        values.set(indexToRemove,lastvalue);
        valToIndex.put(lastvalue, indexToRemove);

        values.remove(values.size()-1);
        valToIndex.remove(val);
        return true;
    }
    
    public int getRandom() {
        int randomIndex = rand.nextInt(values.size());
        return values.get(randomIndex);
    }
}
    public static void main(String[] args) {
    
        RandomizedSet randomizedSet = new RandomizedSet();
        System.out.println(randomizedSet.insert(1)); // true
        System.out.println(randomizedSet.remove(2)); // false
        System.out.println(randomizedSet.insert(2)); // true
        System.out.println(randomizedSet.getRandom()); // 1 or 2
        System.out.println(randomizedSet.remove(1)); // true
        System.out.println(randomizedSet.insert(2)); // false
        System.out.println(randomizedSet.getRandom()); // 2
    }
}
