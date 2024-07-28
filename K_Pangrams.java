class Solution {
    boolean kPangram(String str, int k) {
        // code here
        str = str.replace(" ", ""); // remove empty spaces
        str = str.toUpperCase();
        
        if(str.length() < 26) {    // panagram not possible
            return false;
        }
        
        int cnt = 0;  // to count unique chars
        for(char i='A'; i<='Z'; i++) {
            if(str.contains(Character.toString(i))) {
                cnt++;
            }
        }
        return (26-cnt <= k);   // compare with missing chars
        
    }
}
