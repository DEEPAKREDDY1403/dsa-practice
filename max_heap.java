import java.util.Arrays;

class MaxHeap {
    int[] heap;
    int size;
    int maxSize;

    MaxHeap(int maxSize) {
        this.maxSize = maxSize;
        this.size = 0;
        this.heap = new int[this.maxSize];
    }

    int parent(int index) {
        return (index - 1) / 2;
    }

    void swap(int current, int parent) {
        int temp = heap[current];
        heap[current] = heap[parent];
        heap[parent] = temp;
    }

    int leftChild(int index) {
        return (2 * index) + 1;
    }

    int rightChild(int index) {
        return (2 * index) + 2;
    }

    public void insert(int value) {
        if (size >= maxSize) {
            System.out.println("Heap full");
            return;
        }
        heap[size++] = value;
        int current = size - 1;
        while (current > 0 && heap[current] > heap[parent(current)]) {
            swap(current, parent(current));
            current = parent(current);
        }
    }

    void maxHeapify(int index) {
        int left = leftChild(index);
        int right = rightChild(index);
        int largest = index;

        if (left < size && heap[left] > heap[largest]) {
            largest = left;
        }
        if (right < size && heap[right] > heap[largest]) {
            largest = right;
        }
        if (largest != index) {
            swap(index, largest);
            maxHeapify(largest);
        }
    }

    int remove() {
        if (size == 0) {
            throw new IllegalStateException("Heap is empty");
        }
        int popped = heap[0]; // root
        heap[0] = heap[--size]; // replace root with last element
        maxHeapify(0); // heapify from the root
        return popped;
    }
}

public class max_heap {
    public static void main(String[] args) {
        MaxHeap maxHeap = new MaxHeap(9);
        int arr[] = {10, 3, 4, 5, 2, 7, 8, 11};
        for (int i = 0; i < arr.length; i++) {
            maxHeap.insert(arr[i]);
        }
        System.out.println("Heap array after insertion:");
        for (int i = 0; i < maxHeap.size; i++) {
            System.out.print(maxHeap.heap[i] + " ");
        }
        System.out.println("\nRemoved elements:");
        while (maxHeap.size > 0) {
            System.out.println(maxHeap.remove());
        }
    }
}
