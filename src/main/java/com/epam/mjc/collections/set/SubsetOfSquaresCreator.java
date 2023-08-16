package com.epam.mjc.collections.set;

import java.util.List;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class SubsetOfSquaresCreator {
    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {
        Set<Integer> suqaresSet = new TreeSet<>();

        for (Integer element : sourceList) {
            suqaresSet.add((int)Math.pow(element,2));
        }

        NavigableSet<Integer> subSet = new TreeSet<>(suqaresSet);


        return subSet.subSet(lowerBound,true,upperBound,true);
    }
}
