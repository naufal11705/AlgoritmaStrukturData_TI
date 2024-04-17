public class PencarianKasus04 {
    Kasus04 listKs[] = new Kasus04[17];
    int idx;
    
    void tambah(Kasus04 m) {
        if (idx < listKs.length) {
            listKs[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh!");
        }
    }

    void tampil() {
        for (Kasus04 m : listKs) {
            m.tampilDataKasus();
        }
    }

    public Kasus04 findKasus(int cari) {
        int posisi = -1;

        for (int i = 0; i < listKs.length; i++) {
            if (listKs[i].nilai == cari) {
                posisi = i;
                break;
            }
        }

        System.out.println();

        return listKs[posisi];
    }

    void tampilPosisi(int x, int pos){
        if(pos!=-1) {
            System.out.println("Data : " + x + " ditemukan pada indeks " + pos);
        } else {
            System.out.println("Data: " + x + " tidak ditemukan");
        }
    }

    void selectionSortAsc(){
        for(int i=0; i<listKs.length-1; i++){
            int idxMin = i;
            for(int j=i+1; j<listKs.length; j++){
                if(listKs[j].nilai < listKs[idxMin].nilai){
                    idxMin = j;
                }
            }

            Kasus04 tmp = listKs[idxMin];
            listKs[idxMin] = listKs[i];
            listKs[i] = tmp;
        }
    }
    
    void selectionSortDesc(){
        for(int i=0; i<listKs.length-1; i++){
            int idxMin = i;
            for(int j=i+1; j<listKs.length; j++){
                if(listKs[j].nilai > listKs[idxMin].nilai){
                    idxMin = j;
                }
            }

            Kasus04 tmp = listKs[idxMin];
            listKs[idxMin] = listKs[i];
            listKs[i] = tmp;
        }
    }

    public int FindBinarySearchAsc(int cari, int left, int right) {
        int mid;
        if (right >= left) {
            mid = left + (right - left) / 2;
            if (cari == listKs[mid].nilai) {
                return (mid);
            } else if (listKs[mid].nilai > cari) {
                return FindBinarySearchAsc(cari, left, mid - 1);
            } else {
                return FindBinarySearchAsc(cari, mid + 1, right);
            }
        }
        return -1;
    }

    public int FindBinarySearchDesc(int cari, int left, int right) {
        int mid;
        if (right >= left) {
            mid = left + (right - left) / 2;
            if (cari == listKs[mid].nilai) {
                return (mid);
            } else if (listKs[mid].nilai < cari) {
                return FindBinarySearchDesc(cari, left, mid - 1);
            } else {
                return FindBinarySearchDesc(cari, mid + 1, right);
            }
        }
        return -1;
    }
}
