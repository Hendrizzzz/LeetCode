class MyHashSet {
    ArrayList<Integer> array = null;
    public MyHashSet() {
        array = new ArrayList<>();
    }
    
    public void add(int key) {
        array.add(key);
    }
    
    public void remove(int key) {
        Iterator<Integer> iterator = array.iterator();
        while(iterator.hasNext()){
            Integer a = iterator.next();
            if (a == key){
                iterator.remove();
            }
        }
    }
    
    public boolean contains(int key) {
        for (Integer a : array){
            if (a == key) return true;
        }
        return false;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */