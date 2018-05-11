package datastructures;

public abstract class DataStructure<T>{
    protected int length = 0;
    protected T[] elements;

    /**
     * Add element to the DataStructure at default position
     * @param element
     */
    public abstract void add(T element);

    /**
     * Add element to the DataStructure at index position
     * @param element
     * @param index
     */
    public abstract void add(T element, int index);

    /**
     * Remove the element at the index.
     * @param index
     * @return The removed element
     */
    public abstract T remove(int index);

    /**
     * Get the index element from the DataStructure
     * @param index
     * @return
     */
    //TODO is index relevant to all data-structures?
    public abstract T get(int index);

}
