class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();
        for(String op : operations){
            if(op.equals("C")){
                st.pop();
            }
            else if(op.equals("D")){
                int prev = st.peek();
                st.push(prev*2);
            }
            else if(op.equals("+")){
                int Last = st.pop();
                int SLast = st.peek();
                int sum = Last + SLast;
                st.push(Last);
                st.push(sum);

            }else{
                st.push(Integer.parseInt(op));
            }
        }
        int total =0;
        for(int score : st){
            total += score;
        } 
        return total;
    } 
}