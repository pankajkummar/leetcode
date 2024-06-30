package com.pankaj.leetcode.string;

import java.util.Arrays;
import java.util.LinkedList;

public class LongestSubstringWithoutRepeat {
    public static void main(String[] args) {
        String[] testcases = {"abcabcbb", "bbbbb", "pwwkew"};
        Arrays.stream(testcases).forEach(t-> System.out.println(getLongestSubstringWithoutRepeat(t)));

    }


    public static int getLongestSubstringWithoutRepeat(String s) {
        LinkedList<Character> queue = new LinkedList<>();
        char[] charArray = s.toCharArray();
        int maxLength = 0;
        for (int i = 0; i < charArray.length; i++) {
            if(!queue.contains(charArray[i])) {
                queue.addLast(charArray[i]);
            }else{
               while(true){
                  char k=queue.removeFirst();
                  if(k==charArray[i]){
                      queue.addLast(charArray[i]);
                      break;
                  }
               }
            }
            if(queue.size()>maxLength){
                maxLength = queue.size();
            }

        }

        return maxLength;
    }
}