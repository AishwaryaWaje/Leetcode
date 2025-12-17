class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if(digits==null || digits.length()==0){
            return result;
        }
        String[] keypad = {
            "",     
            "",     
            "abc",  
            "def",  
            "ghi",  
            "jkl",  
            "mno",  
            "pqrs", 
            "tuv",  
            "wxyz"  
        };

        backtrack(digits, 0, new StringBuilder(), keypad, result);
        return result;
    }

    private void backtrack(String digits, int index, StringBuilder path,
                           String[] keypad, List<String> result) {

        if (index == digits.length()) {
            result.add(path.toString());
            return;
        }

        String letters = keypad[digits.charAt(index) - '0'];

        for (char ch : letters.toCharArray()) {
            path.append(ch);       
            backtrack(digits, index + 1, path, keypad, result); 
            path.deleteCharAt(path.length() - 1); 
        }
    }
}