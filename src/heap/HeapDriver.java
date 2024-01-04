package heap;

public class HeapDriver {
    public static void heapDriver(){

        Heap heap = new Heap();
//        heap.insert(99);
//        heap.insert(72);
//        heap.insert(61);
//        heap.insert(58);
//        heap.insert(100);
//        heap.insert(75);

        heap.insert(95);
        heap.insert(75);
        heap.insert(80);
        heap.insert(55);
        heap.insert(60);
        heap.insert(50);
        heap.insert(65);

        System.out.println(heap);

        heap.remove();

        System.out.println(heap);
    }
}
