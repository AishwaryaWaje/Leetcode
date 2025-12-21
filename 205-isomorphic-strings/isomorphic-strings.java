class Solution {
    public boolean isIsomorphic(String s, String t) {
        // int n = s.length();
        // int m = t.length();
        // if(n!=m){
        //     return false;
        // }
        // for(int i=0; i<n; i++){
        //     char cs = s.charAt(i);
        //     char ct = t.charAt(i);
        //     for(int j=0; j<n; j++){
        //         if(s.charAt(j)==cs && t.charAt(j)!=ct){
        //             return false;
        //         }
        //         if(t.charAt(j)==ct && s.charAt(j)!=cs){
        //             return false;
        //         }
        //     }
        // }
        // return true;
        HashMap<Character, Character> mapST = new HashMap<>();
        HashMap<Character, Character> mapTS = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char cs = s.charAt(i);
            char ct = t.charAt(i);

            if (mapST.containsKey(cs)) {
                if (mapST.get(cs) != ct) return false;
            } else {
                mapST.put(cs, ct);
            }

            if (mapTS.containsKey(ct)) {
                if (mapTS.get(ct) != cs) return false;
            } else {
                mapTS.put(ct, cs);
            }
        }
        return true;
    }
}