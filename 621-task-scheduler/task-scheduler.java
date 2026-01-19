class Solution {
    public int leastInterval(char[] tasks, int n) {
        // count freq
        HashMap <Character, Integer> map = new HashMap <>();
        for ( int i = 0 ; i < tasks.length; i++){
            map.put(tasks[i], map.getOrDefault(tasks[i], 0)+1);
        }

        // make a max heap
        PriorityQueue <Map.Entry<Character,Integer>> pq = new PriorityQueue <>((a,b) -> (b.getValue() - a.getValue()));
        pq.addAll(map.entrySet());
     
        int time = 0 ;
        // make a temp 
        //intaial k , and time 
        while (!pq.isEmpty()){
            List<Map.Entry<Character,Integer>> temp = new ArrayList<>();
               int k = n+1;
            while (k> 0 && !pq.isEmpty()){
         // loop till a k lock>0 and make entry to keep the values updated 
        // remove from pq , update the entry 
        // add to temp 
        //calculate time in the loop
                Map.Entry<Character,Integer> entry = pq.poll();
                entry.setValue(entry.getValue()-1);
                temp.add (entry);
                time ++;
                k--;
            }
            for ( Map.Entry<Character, Integer>entry :  temp){
                if(entry.getValue()>0){
                    pq.add(entry);
                }
            }
            
            if(!pq.isEmpty()){
                time += k;
            }
        
        }
      
        //whatsevers left in entry put back into the pq
        // if pq is empty then add the remaining k into time 
        // return time
        return time;
    }
}