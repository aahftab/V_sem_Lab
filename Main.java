public class Main {
    public static void main(String[] args) {
        String s = "aaabhhdsjhjahhdshakasaa";
        int[] arr = new int[26];
        int dist = 0;
        for(int i = 0; i < s.length(); i++) {
            if(arr[s.charAt(i)-'a'] == 0){
                dist++;
            }
            arr[s.charAt(i)-'a']++;
        }
        String t = "";

        int smol = 0;
        int i = 0;

        while(dist>0 && i<s.length()) {

            int[] arr2 = arr.clone();
            
            if(s.charAt(i)<=s.charAt(smol) && arr[s.charAt(i)-'a'] > 0) {
                smol = i;
                System.out.print(s.charAt(smol));
            }

            if(arr2[s.charAt(i)-'a'] == 1) {
                System.out.println("-"+s.charAt(smol)+"-"+ arr2[s.charAt(i)-'a'] + arr[s.charAt(i)-'a']);
                t = t + s.charAt(smol);
                dist--;
                arr[s.charAt(smol) - 'a'] = 0;
                smol++;
                i = smol;
                continue;
            }

            arr2[s.charAt(i)-'a']--;
            i++;

        }
        System.out.println(t);
    }
}
