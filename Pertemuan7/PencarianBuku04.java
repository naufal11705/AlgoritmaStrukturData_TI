package Pertemuan7;

public class PencarianBuku04 {
    Buku04 listBk[] = new Buku04[5];
    int idx;
    
    void tambah(Buku04 m) {
        if (idx < listBk.length) {
            listBk[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh!");
        }
    }

    void tampil() {
        for (Buku04 m : listBk) {
            m.tampilDataBuku();
        }
    }

    public int FindSeqSearch(int cari) {
        int posisi = -1;
        for (int j=0; j<listBk.length; j++) {
            if (Integer.parseInt(listBk[j].kodeBuku)==cari){
                posisi = j;
                break;
            }
        }
        return posisi;
    };

    public int FindSeqSearch(String cari) {
        int posisi = -1;
        int count = 0;

        for (int j=0; j<listBk.length; j++) {
            if (listBk[j].judulBuku.equalsIgnoreCase(cari)){
                posisi = j;
                count++;
            }
        }

        if (count > 1) {
            System.out.println("Jumlah buku dengan judul yang sama sebanyak " + count);
        }
        return posisi;
    };

    public void TampilPosisi(int x, int pos){
        if(pos!=-1) {
            System.out.println("Data : " + x + " ditemukan pada indeks " + pos);
        } else {
            System.out.println("Data: " + x + " tidak ditemukan");
        }
    }

    public void TampilPosisi(int pos){
        if(pos!=-1) {
            System.out.println("Data ditemukan pada indeks " + pos);
        } else {
            System.out.println("Data tidak ditemukan");
        }
    }

    public void TampilData(int x, int pos) {
        if(pos!=-1) {
            System.out.println("===================================");
            System.out.println("Kode Buku: "+x);
            System.out.println("Judul Buku: "+listBk[pos].judulBuku);
            System.out.println("Tahun Terbit: "+listBk[pos].tahunTerbit);
            System.out.println("Pengarang: "+listBk[pos].pengarang);
            System.out.println("Stock: "+listBk[pos].stock);
            System.out.println("===================================");
        } else {
            System.out.println("Data " + x + " tidak ditemukan");
        }
    }

    public void TampilData(int pos) {
        if(pos!=-1) {
            System.out.println("===================================");
            System.out.println("Kode Buku: "+listBk[pos].kodeBuku);
            System.out.println("Judul Buku: "+listBk[pos].judulBuku);
            System.out.println("Tahun Terbit: "+listBk[pos].tahunTerbit);
            System.out.println("Pengarang: "+listBk[pos].pengarang);
            System.out.println("Stock: "+listBk[pos].stock);
            System.out.println("===================================");
        } else {
            System.out.println("Data tidak ditemukan");
        }
    }

    public Buku04 findBuku(int cari) {
        int posisi = -1;

        for (int i = 0; i < listBk.length; i++) {
            if (Integer.parseInt(listBk[i].kodeBuku) == cari) {
                posisi = i;
                break;
            }
        }

        return listBk[posisi];
    }

    public int FindBinarySearch(int cari, int left, int right) {
        int mid;
        if (right >= left) {
            mid = left + (right - left) / 2;
            if (cari == Integer.parseInt(listBk[mid].kodeBuku)) {
                return (mid);
            } else if (Integer.parseInt(listBk[mid].kodeBuku) > cari) {
                return FindBinarySearch(cari, left, mid - 1);
            } else {
                return FindBinarySearch(cari, mid + 1, right);
            }
        }
        return -1;
    }

    public int FindBinarySearch(String cari, int left, int right) {
        int mid;
        if (right >= left) {
            mid = left + (right - left) / 2;

            for (int j=mid; j<listBk.length; j++) {
                if(listBk[j].judulBuku.length() == cari.length()) {
                    if (listBk[j].judulBuku.equalsIgnoreCase(cari)){
                        return j;
                    }
                } else {
                    break;
                }
            }

            for (int j=mid; j<listBk.length; j--) {
                if(listBk[j].judulBuku.length() == cari.length()) {
                    if (listBk[j].judulBuku.equalsIgnoreCase(cari)){
                        return j;
                    }
                } else {
                    break;
                }
            }

            if (listBk[mid].judulBuku.equalsIgnoreCase(cari)) {
                return (mid);
            } else if (listBk[mid].judulBuku.length() > cari.length()) {
                return FindBinarySearch(cari, left, mid - 1);
            } else {
                return FindBinarySearch(cari, mid + 1, right);
            }
        }

        return -1;
    }

    void bubbleSortJudul(){
        for(int i=0; i<listBk.length-1; i++){
            for(int j=1; j<listBk.length-i; j++){
                if(listBk[j].judulBuku.length() < listBk[j-1].judulBuku.length()){
                    Buku04 tmp = listBk[j];
                    listBk[j] = listBk[j-1];
                    listBk[j-1] = tmp;
                }
            }
        }
    }

}
