package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {
        Set<String> combineSet = new HashSet<>();

        Set<String> copyOfThird = Set.copyOf(thirdSet);
        thirdSet.removeAll(firstSet);
        thirdSet.removeAll(secondSet);
        firstSet.removeAll(copyOfThird);
        secondSet.removeAll(copyOfThird);

        for (String elem:firstSet) {
            if(secondSet.contains(elem))
            {
                combineSet.add(elem);
            }
        }

        combineSet.addAll(thirdSet);


        return  combineSet;
    }
}
