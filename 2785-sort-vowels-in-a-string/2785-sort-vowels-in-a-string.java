class Solution {
    public String sortVowels(String s) {
        char [] a={'a','e','i','o','u','A','E','I','O','U'};
        List<Character> v = new ArrayList<>();

        char [] arr= s.toCharArray();
        for(char c:arr)
        {
            for(char vowel: a)
            {
                if(c==vowel)
                {
                   v.add(c);
                   break;
                }
            }
        }
        int l=0;
        Collections.sort(v);
        for(int i=0;i<arr.length;i++)
        {
            for(char vowel: a)
            {
                if(arr[i]==vowel)
                {
                    arr[i]=v.get(l);
                    l++;
                    break;
                }
            }
        }
        return new String(arr);
    }
}