public class Numeros {
    private int a;
    private int b;
    private int c;

    public Numeros() {
    }

    public Numeros(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public static int sonIguales (int a, int b, int c){
        if (a == b && a == c){
            return 0;
        } else if (a == b || a== c || b == c) {
            return 1;
        }else {
            return 2;
        }
    }
}
