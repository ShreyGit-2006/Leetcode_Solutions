import java.util.*;

class Solution {
    public List<Integer> numOfBurgers(int tomatoSlices, int cheeseSlices) {

        List<Integer> ans = new ArrayList<>();

        if(tomatoSlices%2!=0) return ans;
        int jumbo=(tomatoSlices-2*cheeseSlices)/2;
        int small=cheeseSlices-jumbo;
        if(jumbo<0||small<0) return new ArrayList<>();
        if (4*jumbo+2*small!=tomatoSlices)
            return new ArrayList<>();
        ans.add(jumbo);
        ans.add(small);
        return ans;
    }
}