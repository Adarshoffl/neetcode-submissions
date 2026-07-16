class Solution {
    public boolean isAnagram(String s, String t) {

     int l=s.length();
     int r=t.length();
     if (l!=r){
        return false;
     }

     char arr[]= t.toCharArray();

     for (int i=0; i<s.length(); i++){
        boolean found=false;
        for(int j=0; j<t.length(); j++){
          if(s.charAt(i) == arr[j]){
               arr[j] = '#';   // Mark as used
                    found = true;
                    break;

            }
           
            }
             if(!found){
                return false;
        }
     } 
     return true;
    }
}
