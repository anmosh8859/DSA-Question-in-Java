package heap;

import java.util.ArrayList;
import java.util.List;

public class Heap {
    private List<Integer> heap;
    public Heap(){
        this.heap = new ArrayList<>();
    }

    public List<Integer> getHeap(){
        return new ArrayList<>(heap);
    }

    private int leftChild(int index){
        return 2*index + 1;
    }

    private int rightChild(int index){
        return 2*index + 2;
    }

    private int parent(int index){
        return (index-1)/2;
    }

    private void swap(int index1, int index2){
        int temp = heap.get(index1);
        heap.set(index1,heap.get(index2));
        heap.set(index2,temp);
    }

    public void insert(int value){
        heap.add(value);
        int childInd = heap.indexOf(value);
        int child = value;
        int parentInd;
        int parent;
        do{
            parentInd = parent(childInd);
            parent = heap.get(parentInd);
            if (parent<child) {
                swap(childInd,parentInd);
            } else break;
            childInd = parentInd;

        }while (parentInd>0);
    }

    public Integer remove(){
        if(heap.size()==0) return null;
        if(heap.size()==1) return heap.remove(0);
        int maxValue = heap.get(0);

        // just for now
        return -1;
    }
    @Override
    public String toString() {
        return "Heap{" +
                "heap=" + heap +
                '}';
    }
}
