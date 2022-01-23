package org.opendesk;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.stream.IntStream;

public class OddOccurrencesInArray {
    public static void main(String[] args) {
        Solution s = new Solution ();
        System.out.println(s.solution(new int[] {9, 3, 9, 3, 9, 7, 9}));
    }
}

class Solution {
    public int solution(int[] A) {

        HashMap<Integer, Integer>  pairMap = new HashMap <> ();

        IntStream.of(A)
                    .boxed()
                        .forEach((x) -> {
                            if (pairMap.containsKey(x)){
                                pairMap.replace(x, (pairMap.get(x) + 1));
                            }else{
                                pairMap.put(x, 1);
                            }
                        });


          Optional<Map.Entry<Integer, Integer>> odValue =   pairMap.entrySet()
                .stream()
                    .filter((e) -> e.getValue() % 2 != 0)
                        .findFirst();

        return odValue.get().getKey();
    }
}