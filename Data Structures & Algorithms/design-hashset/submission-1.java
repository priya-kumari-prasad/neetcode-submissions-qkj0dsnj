class MyHashSet {
    ArrayList<Integer> myHashSet;
    public MyHashSet() {
        myHashSet = new ArrayList<Integer>();
    }
    
    public void add(int key) {
        if(!myHashSet.contains(key)){
            myHashSet.add(key);
        }
    }
    
    public void remove(int key) {
        if(myHashSet.contains(key)){
            myHashSet.remove(Integer.valueOf(key));
        }
    }
    
    public boolean contains(int key) {
        return myHashSet.contains(key);
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */