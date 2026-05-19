class MyHashSet {
    private List<Integer> value;

    public MyHashSet() {
        value = new ArrayList<>();
    }
    
    public void add(int key) {
        if(!value.contains(key)){
            value.add(key);
        }
    }
    
    public void remove(int key) {
        value.remove(Integer.valueOf(key));
    }
    
    public boolean contains(int key) {
        return value.contains(key);
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */