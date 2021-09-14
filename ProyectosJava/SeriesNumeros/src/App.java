public class App {
    public static void main(String[] args) throws Exception {
        int a = 1, b = 2, c = 10, suma = 0;
        System.out.println(a);
        System.out.println(b);
        for (int i = 1; i <= c; i++) {
            suma = a + b;
            System.out.println(suma);
            a = b;
            b = suma;
        }

        System.out.println("Ahora con el ciclo do while\n\n");
        int j = 1;
        a = 1;
        b = 2;
        c = 10;
        suma = 0;
        System.out.println(a);
        System.out.println(b);
        do {
            suma = a + b;
            System.out.println(suma);
            a = b;
            b = suma;
            j++;
        } while (j <= c);
    }
}
