class Solution {
    public int romanToInt(String s) {
        int a = 0;
        int res = 0;
        int j = 1;

        Map<Character, Integer> romcon = new HashMap<>();
        romcon.put('I', 1);
        romcon.put('V', 5);
        romcon.put('X', 10);
        romcon.put('L', 50);
        romcon.put('C', 100);
        romcon.put('D', 500);
        romcon.put('M', 1000);

        for (int i = 0; i < s.length(); i++) {
            a = romcon.get(s.charAt(i));
            //res=res+a;
            if (j < s.length()) {
                if (romcon.get(s.charAt(j)) > (romcon.get(s.charAt(i)))) {
                    res = res - a;
                } else {
                    res = res + a;
                }
            } else {
                res = res + a;
            }
            j++;
        }
        return res;

    }
}