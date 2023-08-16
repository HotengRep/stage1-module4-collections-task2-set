package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {

        HashSet<Integer> returnSet = new HashSet<>();

        for (Integer elem: sourceList) {
            if(elem%2==0)
            {
                putOddNumberToHash(elem,returnSet);
            }else {
                returnSet.add(elem);
                returnSet.add(elem*2);
            }
        }

        return returnSet;
    }

    void putOddNumberToHash(Integer oddNumber, HashSet<Integer> hashSet)
    {
        hashSet.add(oddNumber);
        {
            if (oddNumber%2==0){
                putOddNumberToHash(oddNumber/2,hashSet);
            }else {
                return;
            }
        }
    }
}
