class Number implements Comparable<Number> {
    int element;
    int freq;

    Number(int element, int freq){
        this.element = element;
        this.freq = freq;
    }

    public int compareTo(Number that){
        return  that.freq - this.freq;
    }
}

class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        PriorityQueue<Number> pq = new PriorityQueue<>();
        
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int key : nums){
            map.put(key, map.getOrDefault(key, 0) + 1);
        }

        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            Number number = new Number(entry.getKey(), entry.getValue());
            pq.offer(number);
        }

        int res[] = new int[k];
        int index = 0;
        while(index < k){
            Number number = pq.poll();
            res[index] = number.element;
            index++;
        }
        return res;
    }
}
