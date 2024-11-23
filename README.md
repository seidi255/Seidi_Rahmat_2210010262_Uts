# Seidi_Rahmat_2210010262_Uts

**Aplikasi Catatan Harian Sederhana**

**Deskripsi Singkat Aplikasi Catatan Harian**

Aplikasi ini dirancang untuk membantu pengguna dalam mengelola catatan harian mereka. Fitur-fitur utamanya meliputi:
1. Menambah Catatan Baru: Pengguna dapat memasukkan judul dan isi catatan baru.
2. Melihat Daftar Catatan: Semua judul catatan akan ditampilkan dalam sebuah daftar.
3. Mengedit Catatan: Pengguna dapat mengubah judul dan isi catatan yang sudah ada.
4. Menghapus Catatan: Catatan yang tidak diinginkan dapat dihapus dari daftar.
5. Menyimpan Catatan: Catatan yang dipilih dapat disimpan dalam bentuk file teks.
6. Membaca Catatan dari File: Pengguna dapat mengimpor catatan dari file teks ke dalam aplikasi.

**Penjelasan Kode**

Kode ini menggunakan bahasa pemrograman Java dan library Swing untuk membuat antarmuka pengguna (GUI). Secara garis besar, kode ini melakukan hal berikut:
1. Membuat Antarmuka: Kode ini membuat jendela aplikasi dengan berbagai komponen seperti tombol, kotak teks, dan daftar. Setiap komponen memiliki fungsi yang berbeda sesuai dengan fitur yang disediakan.
2. Mengelola Catatan: Data catatan disimpan dalam sebuah struktur data . Ketika pengguna menambahkan, mengedit, atau menghapus catatan, data tersebut akan diperbarui dalam struktur data ini.
3. Menyimpan dan Membaca File: Kode ini menggunakan kelas-kelas seperti FileReader dan FileWriter untuk membaca dan menulis data ke dalam file teks. Format file teks yang digunakan cukup sederhana, yaitu dengan menyimpan judul dan isi catatan secara berurutan.
4. Menampilkan Daftar Catatan: Daftar catatan ditampilkan dalam sebuah komponen JList. Ketika pengguna memilih sebuah item dari daftar, isi catatan yang sesuai akan ditampilkan dalam kotak teks.

**Penjelasan Lebih Detail**

1. Kelas Catatan: Kelas ini digunakan untuk merepresentasikan sebuah catatan. Kelas ini biasanya memiliki atribut seperti judul dan isi.
2. Kelas CatatanManager: Kelas ini bertanggung jawab untuk mengelola kumpulan catatan. Kelas ini mungkin memiliki metode untuk menambahkan catatan baru, menghapus catatan, mencari catatan, dan lain-lain.
3. Antarmuka Pengguna: Antarmuka pengguna dirancang dengan menggunakan komponen-komponen Swing. Setiap tombol memiliki event listener yang akan dipanggil ketika tombol tersebut ditekan. Misalnya, ketika tombol "Tambah" ditekan, maka sebuah metode akan dipanggil untuk menambahkan catatan baru.
4. Penyimpanan Data: Data catatan disimpan dalam sebuah struktur data seperti ArrayList atau HashMap. Ketika aplikasi ditutup, data ini biasanya tidak akan disimpan secara permanen. Untuk menyimpan data secara permanen, kita perlu menyimpannya ke dalam file.
