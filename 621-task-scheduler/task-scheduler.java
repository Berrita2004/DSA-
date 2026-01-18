class Solution {
    public int leastInterval(char[] tasks, int n) {
        if (n == 0) return tasks.length; // no cooldown, just tasks length

        // 1️⃣ Count frequency of each task
        HashMap<Character, Integer> map = new HashMap<>();
        for (char t : tasks) {
            map.put(t, map.getOrDefault(t, 0) + 1);
        }

        // 2️⃣ Max-heap based on remaining frequency
        PriorityQueue<Map.Entry<Character, Integer>> pq = new PriorityQueue<>(
            (a, b) -> b.getValue() - a.getValue()
        );
        pq.addAll(map.entrySet());

        int time = 0; // total intervals including idles

        // 3️⃣ Process tasks in "blocks" of size n+1
        while (!pq.isEmpty()) {
            int k = n + 1; // block size
            List<Map.Entry<Character, Integer>> temp = new ArrayList<>();

            // 4️⃣ Fill the block with available tasks
            while (k > 0 && !pq.isEmpty()) {
                Map.Entry<Character, Integer> entry = pq.poll();
                entry.setValue(entry.getValue() - 1); // do the task
                temp.add(entry);
                time++; // one interval used
                k--;
            }

            // 5️⃣ Put tasks with remaining frequency back into heap
            for (Map.Entry<Character, Integer> entry : temp) {
                if (entry.getValue() > 0) {
                    pq.add(entry);
                }
            }

            // 6️⃣ If heap is empty, no idle needed
            // If heap not empty, we need to count idle intervals for the rest of the block
            if (!pq.isEmpty()) {
                time += k; // remaining slots in block are idle
            }
        }

        return time;
    }
}
