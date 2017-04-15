package LogfuzB;

/**
 * Class untuk menentukan potensi alternatif dengan kesesuaian
 */
public class Potensi {

    public float alfa;
    double nilaiZ;

    /**
     * Inisialisasi nilai kesesuaian, parameter berupa nilai keanggotaan.
     *
     * @param alfa
     */
    public Potensi(double alfa) {
        this.alfa = (float) alfa;
    }

    public Potensi() {
    }

    /**
     *
     * @return nilai keanggotaan (alfa)
     */
    public double getAlfa() {
        return alfa;
    }

    public void setAlfa(double alfa) {
        this.alfa = (float) alfa;
    }

    /**
     *
     * @return mengembalikan nilai z
     */
    public double getKeanggotaanRecommended() {
        nilaiZ = (alfa * (25 - 10)) + 10; //perhitungan untuk mencari nilai z untuk hasil tinggi dengan memasukkan range dari potensi tinggi = 25
        return nilaiZ;
    }

    public double getKeanggotaanNotRecommended() {
        nilaiZ = 25 - (alfa * (25 - 10)); //perhitungan untuk mencari nilai z untuk hasil Rendah dengan memasukkan range dari potensi rendah = 10
        return nilaiZ;
    }

}
