// 455. Assign Cookies

// https://leetcode.com/problems/assign-cookies/description/

class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int l = 0; int r = 0;

        while(l<s.length && r<g.length){
            if(g[r]<=s[l]){
                r++;
            }
            l++;
        }
        return r;
    }
}
