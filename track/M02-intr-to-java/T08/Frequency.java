
public class Frequency {

    int count = 0;

    void count(int a[], int key) {
        for (int i = 0; i <= a.length; i++) {
            if (a[i] == key) {
                count++;
            }
        }
        System.out.println(key + ":" + count);
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 5, 2, 7, 5, 3};
        Frequency f = new Frequency();
        f.count(a, 3);
    }
}
