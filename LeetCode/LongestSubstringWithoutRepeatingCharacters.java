package LeetCode;

import java.util.*;
import java.io.*;

public class LongestSubstringWithoutRepeatingCharacters {
	public static void main (String[] args) {
		System.out.println(lengthOfLongestSubstring(" "));
	}
	
	public static int lengthOfLongestSubstring(String s) {
		int longest = 0;
		
		for (int i = 0; i < s.length(); i++) {
			Set<Character> set = new HashSet();

			for (int j = i; j < s.length(); j++) {
				if (!set.contains(s.charAt(j))) {
					set.add(s.charAt(j));
				} else {					
					break;
				}
			}
			
			longest = Math.max(longest, set.size());
		}
		
		return longest;
    }
}
