import java.util.*;

class LeetCode1662 {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String s1 = "";
        String s2 = "";
        
        for (int i = 0; i < word1.length; i++) {
            s1 = s1 + word1[i];
        }
        
        for (int i = 0; i < word2.length; i++) {
            s2 = s2 + word2[i];
        }
        
        return s1.equals(s2);
    }

    public static void main(String[] args) {
        Scanner xyz = new Scanner(System.in);
        
        System.out.println("Enter Size : ");
        int n = xyz.nextInt();
        
        xyz.nextLine();
        
        String[] arr1 = new String[n];
        System.out.println("Enter elements for the first array: ");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = xyz.nextLine();
        }
        
        String[] arr2 = new String[n];
        System.out.println("Enter elements for the second array: ");
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = xyz.nextLine();
        }
        
        LeetCode1662 lt = new LeetCode1662();
        boolean result = lt.arrayStringsAreEqual(arr1, arr2);
        
        System.out.println("Are both arrays equal? " + result);
    }
}
