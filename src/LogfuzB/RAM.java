/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package LogfuzB;

/**
 *
 * 
 */
public class RAM {

    private double ram;

    public RAM(double ram) {
        this.ram = ram;
    }

    public double getRAM() {
        return ram;
    }

    public void setRAM(double ram) {
        this.ram = ram;
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
        if (ram < 1) { //perhitungan untuk hasil nilai ram lebih kecil atau sama dengan kriteria tinggi
            return 1;
        } else if (ram >= 1 && ram <= 2) {
            return ((2 - ram) / (2 - 1));//perhitungan untuk hasil nilai ram lebih tingggi dari 1 dan kurang dari 0
        } else {
            return 0;
        }
    }

    public double keanggotaanTinggi() { //perhitungan untuk mencari nilai anggota
        if (ram < 1) { //perhitungan untuk hasil nilai ram lebih kecil atau sama dengan kriteria tinggi
            return 0;
        } else if (ram >= 1 && ram <= 2) {
            return ((ram - 1) / (2 - 1));//perhitungan untuk hasil nilai ram lebih tingggi dari 1 dan kurang dari 0
        } else {
            return 1;
        }
    }
}
