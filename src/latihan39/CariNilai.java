/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan39;

/**
 *
 * @author lutfi
 */
class CariNilai {
    
    public int cariTerkecil(int[] nilai_mhs){
        int max = 0, min = 0, tmp = 0;
        for (int i = 0; i < nilai_mhs.length; i++) {
            for (int j = i; j < nilai_mhs.length; j++) {
                if (nilai_mhs[i] > nilai_mhs[j]) {
                    if (tmp > nilai_mhs[j]) {
                        min = nilai_mhs[j];
                    }
                    tmp = nilai_mhs[j];
                }
            }
        }
        return min;
    }
    
    public int cariTerbesar(int[] nilai_mhs) {
        int max = 0, min = 0, tmp = 0;
        for (int i = 0; i < nilai_mhs.length; i++) {
            for (int j = i; j < nilai_mhs.length; j++) {
                if (max < nilai_mhs[i]) {
                    max = nilai_mhs[i];
                    if (max < nilai_mhs[j]) {
                        max = nilai_mhs[j];
                    }
                }
            }
        }
        return max;
    }
    
}
