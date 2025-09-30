# PRAKTIKUM PEMROGRAMAN MOBILE

# Tugas-1-Pertemuan-2-Prak-Pemob_H1D023038
Nama : Ayu Fitrianingsih
NIM : H1D023038
Shift : E/B

# Dokumentasi
<img width="1916" height="1006" alt="image" src="https://github.com/user-attachments/assets/749ee346-f86c-4c49-a8db-adf02a5c97e4" />


# Aplikasi Tugas 1 Pemrograman Mobile

Proyek ini dibuat sebagai bagian dari Tugas 1 mata kuliah **Pemrograman Mobile**.  
Aplikasi ini menampilkan halaman sederhana dengan gambar, teks sambutan, deskripsi, dan tombol untuk pindah ke halaman berikutnya.

## 📌 Fitur Utama
- Menampilkan gambar gedung teknik di bagian atas.
- Teks sambutan (welcome text) di tengah layar.
- Deskripsi singkat dengan teks yang rata kanan-kiri.
- Tombol "Next" untuk berpindah ke halaman selanjutnya.

## 🛠️ Teknologi yang Digunakan
- **Android Studio**
- **Kotlin**
- **Material Design 3 (Material Components)**
- **LinearLayout** sebagai layout utama

## 📂 Struktur Layout (activity_main.xml)
- `LinearLayout` → Layout utama.
- `ImageView` → Menampilkan gambar gedung teknik.
- `TextView (tv_welcome)` → Menampilkan teks sambutan.
- `TextView (tv_description)` → Menampilkan deskripsi informasi.
- `MaterialButton (btn_to_page2)` → Tombol untuk menuju halaman kedua.

# Tugas-2-Pertemuan-3-Prak-Pemob_H1D023038

# Dokumentasi

Klik untuk melihat demo: [Download Video](https://github.com/ayfitrian/Tugas-1-Pertemuan-2-Prak-Pemob_H1D023038/raw/main/app/videos/demo1.mp4)

# 📱 IF Unsoed Mobile  

Aplikasi Android sederhana untuk menampilkan **profil lulusan Informatika Unsoed** serta menyediakan navigasi cepat ke kontak penting.  

## ✨ Fitur Utama
- **Halaman Utama (MainActivity)**  
  - Tombol untuk menuju halaman profil lulusan.  
- **Halaman Profil (Halaman2Activity)**  
  - Menampilkan foto gedung & logo Unsoed.  
  - CardView berisi deskripsi singkat profil lulusan.  
  - Menu kontak dengan ikon & teks (telepon, email, lokasi, Instagram).  
  - Tombol **Kembali** untuk menutup halaman.  
- **Integrasi Intent Android**  
  - 📞 Dialer → buka aplikasi telepon.  
  - 📧 Email → buka aplikasi email dengan alamat tujuan.  
  - 📍 Google Maps → buka lokasi Unsoed langsung di Maps.  
  - 📸 Instagram → buka akun himpunan via browser/Instagram app.  

---

## 🏗️ Struktur Proyek
- **Activity**
  - `MainActivity.kt` → navigasi awal.  
  - `Halaman2Activity.kt` → halaman profil + handler klik menu.  
- **Layout**
  - `activity_main.xml` → halaman utama.  
  - `activity_halaman2.xml` → halaman profil lulusan + tombol kembali.  
  - `layout_menu.xml` → komponen reusable (ikon + teks) untuk menu kontak.  
- **Drawable**  
  - Ikon: `ic_phone`, `ic_email`, `ic_location`, `ic_himpunan`.  
  - Gambar: `teknik_unsoed_2`, `lambang_unsoed`.  

---

## 🖼️ Tampilan
Halaman profil terdiri dari:  
- Header gambar gedung dan logo Unsoed.  
- Judul **Profil Lulusan**.  
- Card berisi deskripsi singkat.  
- Menu kontak (telepon, email, alamat, Instagram).  
- Tombol **Kembali** di bagian bawah.

# Tugas-3-Pertemuan-4-Prak-Pemob_H1D023038

# Dokumentasi

Klik untuk melihat demo: [Download Video](https://github.com/ayfitrian/Tugas-1-Pertemuan-2-Prak-Pemob_H1D023038/raw/main/app/videos/demo2.mp4)

### 📌 Deskripsi  
Pada praktikum ini dipelajari penerapan **arsitektur MVVM (Model–View–ViewModel)** dan **Networking dengan Retrofit** di Android. Tujuan utama adalah membuat aplikasi yang dapat mengambil data dari API publik (OpenLibrary) lalu menampilkannya ke pengguna dalam bentuk daftar buku.  

---

### 🏗️ Materi Utama  
- Implementasi library (Retrofit & Gson Converter)  
- Penerapan arsitektur MVVM  
- Networking (request ke API dan parsing JSON)  

---

### 📖 Penjelasan Praktikum  

1. **Implementasi Library**  
   Menggunakan Retrofit untuk request HTTP dan Gson Converter untuk parsing JSON. Ditambahkan juga `viewmodel-ktx` agar integrasi ViewModel lebih mudah.  

2. **Arsitektur MVVM**  
   - **Model** → memetakan data dari API ke dalam data class (misalnya `SearchResponse` dan `BookDoc`).  
   - **ViewModel** → penghubung antara Model dan View, berisi logika bisnis dan mengelola data menggunakan LiveData.  
   - **View** → menampilkan data melalui Activity/Fragment dengan mengamati perubahan data dari ViewModel.  

3. **Networking dengan Retrofit**  
   - Permission `INTERNET` ditambahkan pada `AndroidManifest.xml`.  
   - `Constants.kt` dibuat untuk menyimpan `BASE_URL`.  
   - Interface `OpenLibraryApi` mendefinisikan endpoint request.  
   - `RetrofitInstance` digunakan untuk inisialisasi Retrofit.  
   - Data buku diambil dengan query tertentu, misalnya `"kotlin programming"`.  

4. **Integrasi View dengan RecyclerView**  
   - `DaftarBukuActivity` sebagai halaman utama.  
   - `activity_daftar_buku.xml` berisi RecyclerView.  
   - `list_buku.xml` sebagai layout item untuk daftar buku.  
   - `BookAdapter` sebagai penghubung data buku ke RecyclerView.  

5. **LogCat untuk Debugging**  
   Menggunakan `Log.d()` dan `Log.e()` untuk memantau eksekusi aplikasi, melacak error, dan memastikan request API berjalan dengan benar.  

6. **Hasil Akhir**  
   - Aplikasi berhasil menampilkan daftar buku berdasarkan kata kunci pencarian.  
   - Data ditampilkan secara **dinamis** melalui RecyclerView.  
   - Perubahan data otomatis ter-update berkat penggunaan LiveData & ViewModel.
     
# Tugas-4-Pertemuan-5-Prak-Pemob_H1D023038

# Dokumentasi

Klik untuk melihat demo: [Download Video](https://github.com/ayfitrian/Tugas-1-Pertemuan-2-Prak-Pemob_H1D023038/raw/main/app/videos/demo3.mp4)

# 📱 IF Unsoed Mobile  

### Deskripsi
Pada praktikum ini dipelajari salah satu komponen penting dalam pengembangan aplikasi Android, yaitu **Fragment**. Fragment merupakan bagian dari antarmuka pengguna (UI) yang berjalan di dalam sebuah Activity dan dapat digunakan kembali pada beberapa activity. Tidak seperti Activity yang dapat berdiri sendiri, fragment harus ditempatkan di dalam activity. Dengan fragment, antarmuka aplikasi menjadi lebih fleksibel, dinamis, dan mudah dikelola.

### Konsep Dasar
Fragment terbagi menjadi beberapa jenis, yaitu:
1. **Fragment Standar** → digunakan sebagai bagian dari layout activity, misalnya untuk menampilkan daftar item atau detail konten.  
2. **DialogFragment** → ditampilkan dalam bentuk pop-up dialog di atas activity. Biasanya dipakai untuk menampilkan pesan, form input, atau konfirmasi.  
3. **BottomSheetDialogFragment** → variasi dialog fragment yang muncul dari bawah layar dalam bentuk bottom sheet. Umumnya digunakan untuk menampilkan detail tambahan tanpa berpindah layar.  

### Tujuan Praktikum
- Memahami bagaimana fragment bekerja dalam siklus hidup (lifecycle) Android.  
- Membuat **BottomSheetDialogFragment** untuk menampilkan detail data buku.  
- Menghubungkan **Activity** dengan **Fragment** melalui mekanisme event handling.  
- Memanfaatkan library pihak ketiga (**Glide**) untuk memuat gambar dari URL secara efisien.  

### Ringkasan Materi
- **Import Drawable**: menambahkan aset gambar ke dalam proyek.  
- **Data Class BookDoc**: dimodifikasi agar mendukung atribut `coverId` untuk menampilkan cover buku dari API.  
- **Custom Drawable & Style**: dibuat menggunakan XML agar tampilan aplikasi lebih konsisten dan fleksibel.  
- **Fragment Baru**: dibuat menggunakan `BottomSheetDialogFragment` sebagai wadah detail buku.  
- **Modifikasi Layout dan Fragment**: dilakukan pada `fragment_book_detail.xml` dan `BookDetailFragment.kt` agar menampilkan data sesuai kebutuhan.  
- **Library Glide**: digunakan untuk memuat gambar cover buku dari API secara otomatis dengan caching.  
- **Integrasi**: fragment dihubungkan dengan daftar buku menggunakan adapter dan event handling. Saat item daftar diklik, detail buku akan muncul dalam bottom sheet.  

### Hasil Akhir
Setelah praktikum selesai, aplikasi mampu menampilkan daftar buku, dan ketika salah satu item dipilih, detail buku ditampilkan dalam bentuk **BottomSheetDialogFragment** dengan informasi judul, penulis, tahun terbit, dan cover buku.  

## 🚀 Cara Menjalankan
1. Clone repository ini:
   ```bash
   git clone https://github.com/ayfitrian/Tugas-1-Pertemuan-2-Prak-Pemob_H1D023038.git
   
