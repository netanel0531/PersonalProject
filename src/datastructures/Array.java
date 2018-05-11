package datastructures;

import java.util.Arrays;

public class Array extends DataStructure<Integer> {

    public Array() {
        this.elements = new Integer[0];
        this.length = elements.length;
    }
    @Override
    public void add(Integer element) {
        this.elements = new Integer[++this.length];
        this.elements[this.length] = element;
    }

    @Override
    public void add(Integer element, int index) {
        Integer[] newArray = new Integer[length];
        for (int i = 0; i < index; i++) {
            newArray[i] = elements[i];
        }
        newArray[index] = element;
        for(int i = index+1; i < length+1; i++) {
            newArray[i] = elements[i-1];
        }
        elements = newArray;
        length++;
    }

    @Override
    public Integer remove(int index) {
        //TODO implement
        Integer elem = elements[index];
        for (int i = index; i < length-1; i++) {
            elements[i] = elements[i+1];
        }
        Arrays.copyOf(elements, --length);
        return elem;
    }

    @Override
    public Integer get(int index) {
        return elements[index];
    }
}
