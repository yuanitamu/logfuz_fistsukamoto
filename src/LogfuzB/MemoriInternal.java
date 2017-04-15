/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package LogfuzB;

/**
 *
 *
 */
public class MemoriInternal {

    private double memoriInternal;

    public MemoriInternal(double memoriInternal) {
        this.memoriInternal = memoriInternal;
    }

    public double getMemoriInternal() {
        return memoriInternal;
    }

    public void setMemoriInternal(double memoriInternal) {
        this.memoriInternal = memoriInternal;
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
        if (memoriInternal < 2) { //perhitungan untuk hasil nilai memoriInternal lebih kecil atau sama dengan kriteria tinggi
            return 1;
        } else if (memoriInternal >= 2 && memoriInternal <= 16) {
            return ((16 - memoriInternal) / (16 - 2)); //perhitungan untuk hasil nilai memoriInternal lebih tingggi dari 1 dan kurang dari 0
        } else {
            return 0;
        }
    }

    public double keanggotaanTinggi() { //perhitungan untuk mencari nilai anggota
        if (memoriInternal < 2) { //perhitungan untuk hasil nilai memoriInternal lebih kecil atau sama dengan kriteria tinggi
            return 0;
        } else if (memoriInternal >= 2 && memoriInternal <= 16) {
            return ((memoriInternal - 2) / (16 - 2)); //perhitungan untuk hasil nilai memoriInternal lebih tingggi dari 1 dan kurang dari 0
        } else {
            return 1;
        }
    }
}
