package main;

import java.util.ArrayList;

public class Stack  {
    private ArrayList<Integer> list = new ArrayList<>();

    public void push(Integer a) {
        list.add(a);
    }

    public Integer pop() {
        return list.remove(list.size()-1);
    }

    public Integer peek() {
        return list.get(list.size()-1);
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }
}
