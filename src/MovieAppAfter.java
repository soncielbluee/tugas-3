package After.src;

import java.util.ArrayList;
import java.util.Scanner;

// Refaktor 1: Memisahkan kelas Movie ke dalam file yang berbeda (Movie.java)

// Refaktor 2: Memisahkan logika untuk berinteraksi dengan film ke dalam MovieManager

/**
 * ini adalah class MovieManager untuk menampung fungsi utama dalam apk ini
 */
class MovieManager {
    private ArrayList<Movie> movieList;

    /**
     * untuk menginisiasi arrayList movie
     */
    public MovieManager() {
        movieList = new ArrayList<>();
    }

    /**
     * fungsi untuk menambahkan daftar movie
     * @param title untuk menerima judul movie
     */
    public void addMovie(String title) {
        movieList.add(new Movie(title));
    }

    /**
     * fungsi untuk menghapus judul movie
     * @param title untuk menerima judul movie
     */
    public void removeMovie(String title) {
        movieList.removeIf(movie -> movie.getTitle().equalsIgnoreCase(title)); //5 agar bisa diakses langsung
    }

    /**
     * fungsi untuk menandai yang telah ditontom
     * @param title untuk menerima judul movie
     */
    public void markMovieAsWatched(String title) {
        for (Movie movie : movieList) {
            if (movie.getTitle().equalsIgnoreCase(title)) {
                movie.markAsWatched();
            }
        }
    }

    /**
     * fungsi ini untuk menampilkan daftar film
     */
    public void displayMovies() {
        System.out.println("Daftar Film:");
        for (Movie movie : movieList) {
            System.out.println(movie);
        }
    }
}

// Refaktor 3: Memisahkan penanganan input/output ke dalam kelas MovieApp

/**
 * class utama dalam apk ini
 */
public class MovieAppAfter {
    private static Scanner scanner = new Scanner(System.in);
    private static MovieManager movieManager = new MovieManager();


    /**
     * fungsi utama dalam apk ini
     * @param args parameter utama fungsi main
     */
    public static void main(String[] args) {
        while (true) {
            showMenu();
            int choice = getUserInput();
            processChoice(choice);
        }
    }

    /**
     *  fungsi untuk menampilkan menu
     */
    private static void showMenu() {
        System.out.println("1. Tambah film");
        System.out.println("2. Hapus film");
        System.out.println("3. Tandai film sebagai ditonton");
        System.out.println("4. Tampilkan daftar film");
        System.out.println("5. Keluar");
        System.out.print("Pilih opsi: ");
    }

    /**
     * fungsi untuk menerima input dari user
     * @return untuk mengembalikan inputan user
     */
    private static int getUserInput() {
        int choice = scanner.nextInt();
        scanner.nextLine(); // Untuk membersihkan buffer
        return choice;
    }

    // Refaktor 4: Memindahkan logika switch ke dalam metode yang terpisah

    /**
     * fungsi untuk memproses input dari user
     * @param choice untuk mengembalikan inputan user
     */
    private static void processChoice(int choice) {
        switch (choice) {
            case 1:
                addMovie();
                break;
            case 2:
                removeMovie();
                break;
            case 3:
                markMovieAsWatched();
                break;
            case 4:
                movieManager.displayMovies();
                break;
            case 5:
                System.out.println("Keluar...");
                scanner.close();
                System.exit(0);
            default:
                System.out.println("Pilihan tidak valid. Coba lagi.");
        }
    }

    /**
     * fungsi untuk memasukkan judul film
     */
    private static void addMovie() {
        System.out.print("Masukkan judul film: ");
        String title = scanner.nextLine();
        movieManager.addMovie(title);
    }

    /**
     * fungsi untuk menghapus judul movie
     */
    private static void removeMovie() {
        System.out.print("Masukkan judul film untuk dihapus: ");
        String title = scanner.nextLine();
        movieManager.removeMovie(title);
    }

    /**
     * fungsi untuk menandai yang sudah ditonton
     */
    private static void markMovieAsWatched() {
        System.out.print("Masukkan judul film untuk ditandai sebagai ditonton: ");
        String title = scanner.nextLine();
        movieManager.markMovieAsWatched(title);
    }
}
