package heap;

public class HeapDriver {
    public static void heapDriver(){

        Heap heap = new Heap();
        heap.insert(99);
        heap.insert(72);
        heap.insert(61);
        heap.insert(58);
        heap.insert(100);
        heap.insert(75);

        System.out.println(heap);
    }
}
