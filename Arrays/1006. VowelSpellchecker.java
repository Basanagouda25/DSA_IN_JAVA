// Last updated: 4/11/2026, 12:47:36 PM
class Solution {

    Set<String> exact = new HashSet<>();
    HashMap<String,String> casemap=new HashMap<>();
    HashMap<String, String> vowel = new HashMap<>();

    private String lower(String s) {
        return s.toLowerCase();
    }

    private String maskvowels(String s) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (isVowel(c)) {
                sb.append("*");
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    private String find(String query){

            if(exact.contains(query)){
                return query;
            }

            String lowerquery = lower(query);
            if(casemap.containsKey(lowerquery)){
                return casemap.get(lowerquery);
            }

            String maskedquery = maskvowels(lowerquery);
            if(vowel.containsKey(maskedquery)){
                return vowel.get(maskedquery);
            }

            return "";
        }

    public String[] spellchecker(String[] wordlist, String[] queries) {
        exact.clear();
        casemap.clear();
        vowel.clear();

        for(String word: wordlist){
            exact.add(word);

            String lowerword = lower(word);
            casemap.putIfAbsent(lowerword,word);

            String maskedword = maskvowels(lowerword);
            vowel.putIfAbsent(maskedword,word);
        }

        String[] res = new String[queries.length];

        for(int i=0; i<queries.length; i++){
            res[i] = find(queries[i]);
        }
        return res;
    }
}