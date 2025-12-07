package com.dsa.dp;

public class RegularExpressionMatching {
    public static void main(String[] args) {
        //String s = "aa", p = "a";
        //String s = "aa", p = "a*";
        String s = "ab", p = ".*";
        System.out.println(isMatch_DP(s, p));
    }
    //Approach 1: Recursion
    public static boolean isMatch(String str, String pattern) {
        if(pattern.isEmpty())
            return str.isEmpty();

        boolean first_match = (!str.isEmpty() && pattern.charAt(0) == str.charAt(0) || pattern.charAt(0) == '.');

        if(pattern.length() >= 2 && pattern.charAt(1) == '*'){
            return ( isMatch(str, pattern.substring(2)) || (first_match && isMatch(str.substring(1), pattern)) );
        }else{
            return ( first_match && isMatch(str.substring(1), pattern.substring(1)) );
        }
    }

    enum Result {
        TRUE,
        FALSE,
    }
    static Result[][] memo;
    //Approach 2: Dynamic Programming
    public static boolean isMatch_DP(String str, String pattern) {
        memo = new Result[(str.length()+1)][(pattern.length()+1)];
        return dp(0, 0, str, pattern);
    }
    public static boolean dp(int i, int j, String s, String p){
        if(memo[i][j] != null){
            return memo[i][j] == Result.TRUE;
        }
        boolean ans;
        if(j == p.length()){
            ans = i == s.length();
        }else{
            boolean first_match = (i < s.length() && ((p.charAt(j) == s.charAt(i)) || p.charAt(j) == '.'));
            if(j + 1 < p.length() && p.charAt(j+1) == '*'){
                ans = (dp(i, j+2, s, p) || (first_match && dp(i+1, j, s, p)));
            }else{
                ans = first_match && dp(i+1, j+1, s, p);
            }
        }
        memo[i][j] = ans ? Result.TRUE : Result.FALSE;
        return ans;
    }
}
/*The Kleene star is a mathematical symbol (*) that means "zero or more" of the preceding element.
It is used in formal language theory and regular expressions to indicate that a character, group,
or language can be repeated an arbitrary number of times, including not at all.
For example, a* can match the strings ``, a, aa, and so on. */