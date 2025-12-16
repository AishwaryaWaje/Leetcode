class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1 || numRows >= s.length()) {
            return s;
        }
        StringBuilder[] rows = new StringBuilder[numRows];
        for(int i=0; i<numRows; i++){
            rows[i] = new StringBuilder();
        }
        int current = 0;
        boolean down = false;

        for(char c : s.toCharArray()){
            rows[current].append(c);

            if(current == 0 || current == numRows-1){
                down = !down;
            }
            current += down ? 1 :-1 ;
        }
        StringBuilder result = new StringBuilder();
        for(StringBuilder row: rows){
            result.append(row);
        }
        return result.toString();

    }
}