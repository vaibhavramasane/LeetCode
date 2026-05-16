class Solution {
    public String reverseVowels(String s) {
        String vowels="AEIOUaeiou";
        char arr[]=s.toCharArray();
        int start=0,end=s.length()-1;
        while(start<end)
        {
            while(start<end && vowels.indexOf(arr[start])==-1)
            start++;

            while(start<end && vowels.indexOf(arr[end])==-1)
            end--;

            char temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        String ans=new String(arr);
        return ans;
    }
}