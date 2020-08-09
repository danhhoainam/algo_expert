package algo.medium.prob_021_min_heap;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    static class MinHeap {
        List<Integer> heap = new ArrayList<Integer>();

        public MinHeap(List<Integer> array) {
            heap = buildHeap(array);
        }

        public List<Integer> buildHeap(List<Integer> array) {
            int firstParentIdx = (array.size() - 2) / 2;
            for (int i = firstParentIdx; i >= 0; i--) {
                siftDown(i, array.size() - 1, heap);
            }
            return array;
        }

        public void siftDown(int currentIdx, int endIdx, List<Integer> heap) {
            int leftIdx = currentIdx * 2 + 1;
            while (currentIdx <= endIdx) {
                int rightIdx = currentIdx * 2 + 2;
                rightIdx = rightIdx <= endIdx ? rightIdx : -1;
                int idToSwap;
                if (rightIdx != -1 && heap.get(leftIdx) > heap.get(rightIdx)) {
                    idToSwap = rightIdx;
                } else {
                    idToSwap = leftIdx;
                }

                if (heap.get(currentIdx) > heap.get(idToSwap)) {
                    swap(heap, currentIdx, idToSwap);
                    currentIdx = idToSwap;
                    leftIdx = currentIdx * 2 + 1;
                } else {
                    return;
                }
            }
        }

        public void siftUp(int currentIdx, List<Integer> heap) {
            if (currentIdx < 0) return;

            int parentIndex = (currentIdx - 1) / 2;
            while (parentIndex > 0 && heap.get(currentIdx) < heap.get(parentIndex)) {
                swap(heap, currentIdx, parentIndex);
                currentIdx = parentIndex;
                parentIndex = (currentIdx - 1) / 2;
            }
        }

        public int peek() {
            return heap.get(0);
        }

        /**
         * remove the minimum root
         * @return
         */
        public int remove() {
            if (heap.size() == 0) return -1;
            swap(heap, 0, heap.size() - 1);
            int idToRemove = heap.get(heap.size() - 1);
            heap.remove(heap.size() - 1);

            siftDown(0, heap.size() - 1, heap);

            return idToRemove;
        }

        public void insert(int value) {
            heap.add(value);
            siftUp(heap.size() - 1, heap);
        }

        public void swap(List<Integer> heap, int currentIdx, int idxToSwap) {
            Integer currentValue = heap.get(currentIdx);
            Integer valueToSwap = heap.get(idxToSwap);
            heap.set(currentIdx, valueToSwap);
            heap.set(idxToSwap, currentValue);
        }
    }
}
