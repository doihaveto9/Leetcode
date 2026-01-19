class MedianFinder {
    ArrayList<Integer> nums;
    int size;

    public MedianFinder() {
        nums = new ArrayList<>();
        size = 0;
    }
    
    public void addNum(int num) {
        nums.add(num);
        size++;
    }
    
    public double findMedian() {
        if(size == 1){
            return (double) nums.get(0);
        }
        else if(size % 2 == 1){
            return (double) nums.get(size / 2);
        }
        else{
            return (((double) nums.get(size / 2) + (double) nums.get((size / 2) - 1)) / 2.0d);
        }
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */