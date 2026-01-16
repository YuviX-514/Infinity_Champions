package Infinity_Champions;

public class needleHaystack {
    public static void main(String[] args) {
        String haystack = "esadbutsad";
        String needle = "sad";

        int ans1 = brute(haystack, needle);
//        int ans2 = opt(haystack, needle);
        System.out.println(ans1);
//        System.out.println(ans2);
    }

    static int brute(String s, String t){
        if(t.length() > s.length())return -1;

        for(int i=0;i<s.length() - t.length() + 1;i++){
            String str = s.substring(i, i + t.length());
            if(str.equals(t))return i;
        }
        return -1;
    }
}
