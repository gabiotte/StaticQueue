public class StaticQueue {
    private int top = -1;
    private int base = 0;
    private int[] data;

    private StaticQueue(int size) {
        this.data = new int[size];
    }

    public boolean isFull() {
        if (top - base == -1) {
            return false;
        }
        return true;
    }

    public boolean isEmpty() {
        if (top - base == -1) {
            return true;
        }
        return false;
    }

    public void add(int valor) {
        if (isFull()) {
            System.out.println("A fila já está cheia");
        } else {
            data[top] = valor;
            top++;
        }
    }

    public int remove() {
        if (isEmpty()) {
            System.out.println("Stack cheia");
            return 0;
        }
        int intBase = data[base];
        data[base] = 0;
        base++;
        return intBase;
    }

    public void clear() {
        for (int valor : data) {
            valor = 0;
        }
    }

}
