/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package LogfuzB;

/**
 *
 * 
 */
public class Harga {
    private double harga;

    public Harga(double harga) {
        this.harga = harga;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }
    /**
     *
     * @return mengembalikan nilai keanggotaan
     * @rumus untuk rendah dengan aturan z <= a maka 1 ; a<=z<=b maka (b-z)/(b-a) ; z>=b maka 0
     * @rumus untuk tinggi dengan aturan z <= a maka 1 ; a<=z<=b maka (z-a)/(b-a) ; z>=b maka 0
     */
    public double keanggotaanRendah(){  //perhitungan untuk mencari nilai anggota
        if(harga<2000000 ){ //perhitungan untuk hasil nilai harga lebih kecil atau sama dengan kriteria tinggi  
            return 1;
        }else if(harga>=2000000 && harga<=4000000){
            return ((4000000-harga)/(4000000-2000000)); //perhitungan untuk hasil nilai harga lebih tinggi dari 1 dan kurang dari 0            
        }else {
            return 0;
        }
    }
    public double keanggotaanTinggi(){ //perhitungan untuk mencari nilai anggota
        if(harga<2000000){ //perhitungan untuk hasil nilai harga lebih kecil atau sama dengan kriteria tinggi
            return 0;
        }else if(harga>=2000000 && harga<=4000000){
            return ((harga-2000000)/(4000000-2000000)); //perhitungan untuk hasil nilai harga lebih tinggi dari 1 dan kurang dari 0
        }else {
            return 1;
        }
    }
}
    

