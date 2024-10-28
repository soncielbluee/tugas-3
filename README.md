# Movie Manager

Movie Manager adalah sebuah program Java sederhana untuk mengelola daftar film. Program ini memungkinkan pengguna menambahkan judul film ke dalam daftar dan mengelola daftar tersebut. Program ini telah di-refaktor untuk memisahkan fungsionalitas utama ke dalam beberapa kelas yang terpisah, meningkatkan modularitas dan pemeliharaan kode.

## Struktur Program

Program ini terdiri dari dua file utama:
- `Movie.java`: Kelas untuk merepresentasikan entitas `Movie`.
- `MovieManager.java`: Kelas yang menyediakan logika utama untuk mengelola daftar film.

## Fitur

1. **Menambah Film** - Pengguna dapat menambahkan judul film ke dalam daftar menggunakan fungsi `addMovie`.

## Penggunaan

1. Clone atau unduh repositori ini.
2. Buka proyek di editor Java pilihan Anda.
3. Jalankan kelas `MovieManager` untuk menambahkan film ke dalam daftar.

## Refaktorisasi Kode

Proyek ini telah melalui beberapa refaktor, antara lain:
1. **Pemindahan kelas `Movie` ke file `Movie.java`** untuk meningkatkan modularitas.
2. **Pemindahan logika pengelolaan film ke `MovieManager`** untuk mengorganisir fungsi utama pengelolaan film.

## Kelas dan Metode

### MovieManager
Kelas ini digunakan untuk menginisiasi daftar film serta menambahkan film ke dalam daftar.

#### Metode:
- `MovieManager()`: Konstruktor untuk menginisiasi objek `ArrayList` untuk daftar film.
- `addMovie(String title)`: Menambahkan film baru ke dalam daftar.

### Movie
Kelas ini merepresentasikan sebuah film dengan properti dasar seperti judul.

## Pengembangan Lebih Lanjut

Program ini dapat dikembangkan lebih lanjut dengan fitur tambahan, seperti:
- Menampilkan daftar film.
- Menghapus film dari daftar.
- Menyimpan daftar film ke dalam file untuk penyimpanan permanen.

## Kontribusi

Jika Anda ingin mengembangkan proyek ini lebih lanjut, silakan melakukan fork repositori dan ajukan pull request. Kontribusi sangat dihargai!

## Lisensi

Proyek ini dilisensikan di bawah [MIT License](LICENSE).
