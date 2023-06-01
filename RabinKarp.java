public class RabinKarp {

    public int search(String pat, String txt) {
        int M = pat.length();
        int N = txt.length();
        long patHash = hash(pat, M);

        for (int i = 0; i <= N - M; i++) {
            long txtHash = hash(txt.substring(i, i+M), M);
            if (patHash == txtHash)
                return i; // ocorrência? colisão?
        }
        return N; // nenhuma ocorrência
    }


    //
    //Notação: o padrão tem M caracteres, o texto tem N caracteres, o alfabeto tem R caracteres  (0 … R−1)
    //              Q é o módulo para o cálculo do Hash.
    //              Qual o valor de Q?  Escolha Q igual a um primo grande para minimizar a chance de colisões.
    //                       Por exemplo: o maior primo que possa ser representado com um int

    public long hash(String s, int M) {
        long h = 0;
        for (int j = 0; j < M; j++)
            h = (h * 26 + s.charAt(j)) % 104729;
        return h;
    }

    public long calculateHash(String str, int windowSize) {
        long hash = 0;

        if (windowSize > str.length()) {
            throw new IllegalArgumentException("Window size cannot be greater than string length.");
        }

        // Calculating the initial hash
        for (int i = 0; i < windowSize; i++) {
            hash += str.charAt(i) * Math.pow(26, windowSize - i - 1);
        }

        int pow = (int) Math.pow(26, windowSize - 1);

        // Sliding the window and updating the hash
        for (int i = windowSize; i < str.length(); i++) {
            hash -= (long) str.charAt(i - windowSize) * pow;
            hash = hash * 26 + str.charAt(i);
        }

        return hash;
    }

    public long novoHash(String s, int M) {
      return 0L;
    }
}
