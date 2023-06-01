public class PatternMatching {
    public static void main(String[] args) {
        System.out.println(verificaOcorrencia("ABCDCBDCBDACBDABDCBADF", "ADF"));
    }

    public static int verificaOcorrencia(String s1, String s2) {
        int cont = 0;
        int endS2 = 0;
        int x = 0;
        for (int i = 0; i < s1.length(); i++) {
            cont = 0;
            boolean isTrue = true;
            while(s2.length() > endS2){
                if(s1.charAt(i + cont) == s2.charAt(i + cont) ){
                    cont++;
                }
                else {
                    isTrue = false;
                    break;
                }

                endS2++;
            }
            if(isTrue) {
                x = i;
                break;
            }
        }
        return x - s2.length();
    }

  /*  public static int nonRollingHash(CharSequence s) {
        int value = 0;
        for(int i = 0; i<s.length();++i) {
            char c = s.charAt(i);
            int z = hasher.hashvalues[c];
            value = B*value + z;
        }
        return value;
    }*/
}
