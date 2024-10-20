public class BubbleSort {

    // Fungsi untuk melakukan Bubble Sort
    public static void bubbleSort(int[] A) {
        int n = A.length;
        // Loop untuk mengulangi proses sorting
        for (int i = 0; i < n - 1; i++) {
            // Loop untuk membandingkan dan menukar elemen
            for (int j = 0; j < n - 1 - i; j++) {
                // Jika elemen yang sekarang lebih besar dari elemen berikutnya, tukar
                if (A[j] > A[j + 1]) {
                    // Pertukaran elemen
                    int temp = A[j];
                    A[j] = A[j + 1];
                    A[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        // Contoh array yang belum terurut
        int[] A = {5, 6, 1, 3};

        // Cetak array sebelum diurutkan
        System.out.println("Array sebelum diurutkan:");
        for (int num : A) {
            System.out.print(num + " ");
        }

        // Panggil metode bubbleSort
        bubbleSort(A);

        // Cetak array setelah diurutkan
        System.out.println("\nArray setelah diurutkan:");
        for (int num : A) {
            System.out.print(num + " ");
        }
    }
}
