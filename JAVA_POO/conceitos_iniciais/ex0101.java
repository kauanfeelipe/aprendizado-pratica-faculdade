public class ex0101 {

    private int v[]={1,-2,5,8,-9,12,-14,30,-6,10}

    public void reorganizarVetor(){
        int n = v.length;
        int positivos [] = new int[n];
        int negativos [] = new int[n];
        int p = 0, neg = 0;

        for (int i = 0; i < n; i++) {
            if (v[i] >= 0) {
                positivos[p++] = v[i];
            } else {
                negativos[neg++] = v[i];
            }
        }

        int i = 0 , posIndex = 0, negIndex = 0;

        while (posIndex < p && negIndex < neg) {
            v[i++] = positivos[posIndex++];
            v[i++] = negativos[negIndex++];
        }
    }

    while (posIndex < p) {
        v[i++] = positivos[posIndex++];
    }
    while (negIndex < neg) {
        v[i++] = negativos[negIndex++];
    }
}