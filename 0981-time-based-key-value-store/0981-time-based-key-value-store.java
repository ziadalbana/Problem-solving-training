class TimeMap {
    HashMap<String,TreeMap<Integer,String>> map;
    public TimeMap() {
        map=new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        if(map.containsKey(key)){
            map.get(key).put(timestamp,value);
        }else {
             map.put(key,new TreeMap<>());
             map.get(key).put(timestamp,value);
        }
    }
    
    public String get(String key, int timestamp) {
        if(!map.containsKey(key)) return "";
        Map.Entry<Integer,String> res=map.get(key).floorEntry(timestamp);
        return res==null ? "": res.getValue();
    }
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */