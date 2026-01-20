package m.oop.problem;

public class DynamicArray {
    private int[] array;  // Internal array to hold elements
    private int size;     // The current number of elements in the array
    private int capacity; // The current capacity of the array
    // Constructor to initialize the array with a default capacity
    public DynamicArray() {
        this.capacity = 10; // Initial capacity
        this.array = new int[capacity];
        this.size = 0; // Initially, no elements in the array
    }
    // Method to add an element to the dynamic array
    public void add(int element) {
        // Check if the array is full, if so, resize the array
        if (size == capacity) {
            resize();
        }
        // Add the element and increase the size
        array[size++] = element;
    }
    // Method to resize the array when it is full
    private void resize() {
        // Double the capacity of the array
        capacity = capacity * 2;
        int[] newArray = new int[capacity];
        // Copy the existing elements to the new array
        System.arraycopy(array, 0, newArray, 0, size);
        // Update the array to the new array with increased capacity
        array = newArray;
    }
    // Method to get the element at a specific index
    public int get(int index) {
        if (index >= 0 && index < size) {
            return array[index];
        }
        throw new IndexOutOfBoundsException("Index out of range");
    }
    // Method to remove an element at a specific index
    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of range");
        }
        // Shift all elements after the removed element to the left
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        // Nullify the last element and decrease the size
        array[size - 1] = 0;
        size--;
    }
    // Method to get the size of the dynamic array (number of elements)
    public int size() {
        return size;
    }
    // Method to print the elements of the dynamic array
    public void print() {
        System.out.print("DynamicArray: ");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    // Main method to test the dynamic array implementation
    public static void main(String[] args) {
        DynamicArray dynamicArray = new DynamicArray();
        // Add elements to the dynamic array
        dynamicArray.add(1);
        dynamicArray.add(2);
        dynamicArray.add(3);
        dynamicArray.add(4);
        dynamicArray.add(5);
        dynamicArray.add(6);
        // Print the elements
        dynamicArray.print(); // Output: DynamicArray: 1 2 3 4 5 6
        // Get element at index 3
        System.out.println("Element at index 3: " + dynamicArray.get(3)); // Output: 4
        // Remove element at index 2
        dynamicArray.remove(2);
        dynamicArray.print(); // Output: DynamicArray: 1 2 4 5 6
        // Add more elements to test resizing
        dynamicArray.add(7);
        dynamicArray.add(8);
        dynamicArray.add(9);
        dynamicArray.add(10);
        dynamicArray.add(11); // This will trigger the resize

        // Print the array again after resizing
        dynamicArray.print(); // Output: DynamicArray: 1 2 4 5 6 7 8 9 10 11
    }
}
