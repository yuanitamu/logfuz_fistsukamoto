/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package LogfuzB;

/**
 *
 * 
 */
public class Kamera {

    private double kamera;

    public Kamera(double kamera) {
        this.kamera = kamera;
    }

    public double getKamera() {
        return kamera;
    }

    public void setKamera(double kamera) {
        this.kamera = kamera;
    }

    /**
     *
     * @return mengembalikan nilai keanggotaan
     * @rumus untuk rendah dengan aturan z <= a maka 1 ; a<=z<=b maka
     * (b-z)/(b-a) ; z>=b maka 0
     * @rumus untuk tinggi dengan aturan z <= a maka 1 ; a<=z<=b maka
     * (z-a)/(b-a) ; z>=b maka 0
     */
    public double keanggotaanRendah() { //perhitungan untuk mencari nilai anggota
        if (kamera < 5) { //perhitungan untuk hasil nilai kamera lebih kecil atau sama dengan kriteria tinggi
            return 1;
        } else if (kamera >= 5 && kamera <= 8) {
            return ((8 - kamera) / (8 - 5));//perhitungan untuk hasil nilai kamera lebih tingggi dari 1 dan kurang dari 0
        } else {
            return 0;
        }
    }

    public double keanggotaanTinggi() { //perhitungan untuk mencari nilai anggota
        if (kamera < 5) { //perhitungan untuk hasil nilai processor lebih kecil atau sama dengan kriteria tinggi
            return 0;
        } else if (kamera >= 5 && kamera <= 8) {
            return ((kamera - 5) / (8 - 5)); //perhitungan untuk hasil nilai kamera lebih tingggi dari 1 dan kurang dari 0
        } else {
            return 1;
        }
    }

}
