public class Vector {
    private int [] vector;

    public Vector() {
    }

    public Vector(int[] vector) {
        this.vector = vector;
    }
    public static int [] reverso (int [] v){
        int [] vectorReverso = new int[v.length];
        int j = 0;

        for (int i = v.length - 1; i >= 0; i--) {
            vectorReverso[j] = v[i];
            j++;
        }


        return vectorReverso;
    }
}
