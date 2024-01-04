package heap;

public class HeapDriver {
    public static void heapDriver(){

        MaxHeap maxHeap = new MaxHeap();
//        heap.insert(99);
//        heap.insert(72);
//        heap.insert(61);
//        heap.insert(58);
//        heap.insert(100);
//        heap.insert(75);

        maxHeap.insert(95);
        maxHeap.insert(75);
        maxHeap.insert(80);
        maxHeap.insert(55);
        maxHeap.insert(60);
        maxHeap.insert(50);
        maxHeap.insert(65);

        System.out.println(maxHeap);

        maxHeap.remove();

        System.out.println(maxHeap);
    }
}
