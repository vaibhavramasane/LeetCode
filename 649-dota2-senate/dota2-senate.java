class Solution {
    public String predictPartyVictory(String senate) {
        
        int n = senate.length();
        Deque<Integer> rad = new LinkedList<>();
        Deque<Integer> dire = new LinkedList<>();

        for(int i=0; i<n; i++){
            if(senate.charAt(i) == 'R'){
                rad.offer(i);
            }else{
                dire.offer(i);
            }
        }
        while (!rad.isEmpty() && !dire.isEmpty()) {
            int r_idx = rad.poll();
            int d_idx = dire.poll();
            if (r_idx < d_idx) {
                rad.offer(r_idx + n);
            } else {
                dire.offer(d_idx + n);
            }
        }
        return rad.isEmpty() ? "Dire" : "Radiant";
    }
}