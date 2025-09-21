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
Klik untuk melihat demo: [Download Video](app/videos/demo.mp4)


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


## 🚀 Cara Menjalankan
1. Clone repository ini:
   ```bash
   git clone https://github.com/ayfitrian/Tugas-1-Pertemuan-2-Prak-Pemob_H1D023038.git
   
