package LogfuzB;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * menghitung defuzzyfikasi dari data input
 */
public class Defuzzy {

    public double nilaiharga, nilaimemoriInternal, nilaikamera, nilairam;
    public double alfa[];
    public double Z[];
    private int hit = 0;

    public Defuzzy(double harga, double memoriInternal, double kamera, double ram) {
        this.nilaiharga = harga;
        this.nilaimemoriInternal = memoriInternal;
        this.nilaikamera = kamera;
        this.nilairam = ram;
    }

    /**
     * mengembalikan nilai minimum
     *
     * @param x
     * @param y
     * @return nilai minimum
     */
    public double findMin(double w, double x, double y, double z) {
        double min[] = new double[4];
        double temp = 2;

        min[0] = w;
        min[1] = x;
        min[2] = y;
        min[3] = z;
        for (int i = 0; i < 4; i++) {
            if (temp > min[i]) {
                temp = min[i];
            }
        }

        LogFuz.Rm1[hit] = w;
        LogFuz.Rm2[hit] = x;
        LogFuz.Rm3[hit] = y;
        LogFuz.Rm4[hit] = z;
        hit++;

        System.out.println("w= " + w + "min[0]= " + min[0]);
        System.out.println("x= " + x + "min[1]= " + min[1]);
        System.out.println("y= " + y + "min[2]= " + min[2]);
        System.out.println("z= " + z + "min[3]= " + min[3]);
        System.out.println("temp= " + temp);
        System.out.println("---------------------------------");

        return temp;
    }

    /**
     * Procedure ini digunakan untk menentukan nilai alfa dan Z
     */
    private void apply_rule() {
        alfa = new double[16];
        Z = new double[16];

        Harga harga = new Harga(nilaiharga);
        MemoriInternal memoriInternal = new MemoriInternal(nilaimemoriInternal);
        Kamera kamera = new Kamera(nilaikamera);
        RAM ram = new RAM(nilairam);

        Potensi potensi = new Potensi();

        //R1
        //if harga rendah and memoriInternal rendah and kamera rendah and ram rendah then potensi rendah
        alfa[0] = findMin(harga.keanggotaanTinggi(), memoriInternal.keanggotaanTinggi(), kamera.keanggotaanTinggi(), ram.keanggotaanTinggi());
        potensi.setAlfa(alfa[0]);
        Z[0] = potensi.getKeanggotaanNotRecommended();
        LogFuz.AlfaTemp[0] = alfa[0];
        LogFuz.Zn[0] = Z[0];

        //R2
        alfa[1] = findMin(harga.keanggotaanTinggi(), memoriInternal.keanggotaanTinggi(), kamera.keanggotaanTinggi(), ram.keanggotaanRendah());
        potensi.setAlfa(alfa[1]);
        Z[1] = potensi.getKeanggotaanNotRecommended();
        LogFuz.AlfaTemp[1] = alfa[1];
        LogFuz.Zn[1] = Z[1];

        //R3
        alfa[2] = findMin(harga.keanggotaanTinggi(), memoriInternal.keanggotaanTinggi(), kamera.keanggotaanRendah(), ram.keanggotaanTinggi());
        potensi.setAlfa(alfa[2]);
        Z[2] = potensi.getKeanggotaanNotRecommended();
        LogFuz.AlfaTemp[2] = alfa[2];
        LogFuz.Zn[2] = Z[2];

        //R4
        alfa[3] = findMin(harga.keanggotaanTinggi(), memoriInternal.keanggotaanTinggi(), kamera.keanggotaanRendah(), ram.keanggotaanRendah());
        potensi.setAlfa(alfa[3]);
        Z[3] = potensi.getKeanggotaanNotRecommended();
        LogFuz.AlfaTemp[3] = alfa[3];
        LogFuz.Zn[3] = Z[3];

        //R5
        alfa[4] = findMin(harga.keanggotaanTinggi(), memoriInternal.keanggotaanRendah(), kamera.keanggotaanTinggi(), ram.keanggotaanTinggi());
        potensi.setAlfa(alfa[4]);
        Z[4] = potensi.getKeanggotaanNotRecommended();
        LogFuz.AlfaTemp[4] = alfa[4];
        LogFuz.Zn[4] = Z[4];

        //R6
        alfa[5] = findMin(harga.keanggotaanTinggi(), memoriInternal.keanggotaanRendah(), kamera.keanggotaanTinggi(), ram.keanggotaanRendah());
        potensi.setAlfa(alfa[5]);
        Z[5] = potensi.getKeanggotaanNotRecommended();
        LogFuz.AlfaTemp[5] = alfa[5];
        LogFuz.Zn[5] = Z[5];

        //R7
        alfa[6] = findMin(harga.keanggotaanTinggi(), memoriInternal.keanggotaanRendah(), kamera.keanggotaanRendah(), ram.keanggotaanTinggi());
        potensi.setAlfa(alfa[6]);
        Z[6] = potensi.getKeanggotaanNotRecommended();
        LogFuz.AlfaTemp[6] = alfa[6];
        LogFuz.Zn[6] = Z[6];

        //R8
        alfa[7] = findMin(harga.keanggotaanTinggi(), memoriInternal.keanggotaanRendah(), kamera.keanggotaanRendah(), ram.keanggotaanRendah());
        potensi.setAlfa(alfa[7]);
        Z[7] = potensi.getKeanggotaanNotRecommended();
        LogFuz.AlfaTemp[7] = alfa[7];
        LogFuz.Zn[7] = Z[7];

        //R9
        alfa[8] = findMin(harga.keanggotaanRendah(), memoriInternal.keanggotaanTinggi(), kamera.keanggotaanTinggi(), ram.keanggotaanTinggi());
        potensi.setAlfa(alfa[8]);
        Z[8] = potensi.getKeanggotaanRecommended();
        LogFuz.AlfaTemp[8] = alfa[8];
        LogFuz.Zn[8] = Z[8];

        //R10
        alfa[9] = findMin(harga.keanggotaanRendah(), memoriInternal.keanggotaanTinggi(), kamera.keanggotaanTinggi(), ram.keanggotaanRendah());
        potensi.setAlfa(alfa[9]);
        Z[9] = potensi.getKeanggotaanRecommended();
        LogFuz.AlfaTemp[9] = alfa[9];
        LogFuz.Zn[9] = Z[9];

        //R11
        alfa[10] = findMin(harga.keanggotaanRendah(), memoriInternal.keanggotaanTinggi(), kamera.keanggotaanRendah(), ram.keanggotaanTinggi());
        potensi.setAlfa(alfa[10]);
        Z[10] = potensi.getKeanggotaanRecommended();
        LogFuz.AlfaTemp[10] = alfa[10];
        LogFuz.Zn[10] = Z[10];

        //R12
        alfa[11] = findMin(harga.keanggotaanRendah(), memoriInternal.keanggotaanTinggi(), kamera.keanggotaanRendah(), ram.keanggotaanRendah());
        potensi.setAlfa(alfa[11]);
        Z[11] = potensi.getKeanggotaanNotRecommended();
        LogFuz.AlfaTemp[11] = alfa[11];
        LogFuz.Zn[11] = Z[11];

        //R13
        alfa[12] = findMin(harga.keanggotaanRendah(), memoriInternal.keanggotaanRendah(), kamera.keanggotaanTinggi(), ram.keanggotaanTinggi());
        potensi.setAlfa(alfa[12]);
        Z[12] = potensi.getKeanggotaanRecommended();
        LogFuz.AlfaTemp[12] = alfa[12];
        LogFuz.Zn[12] = Z[12];

        //R14
        alfa[13] = findMin(harga.keanggotaanRendah(), memoriInternal.keanggotaanRendah(), kamera.keanggotaanTinggi(), ram.keanggotaanRendah());
        potensi.setAlfa(alfa[13]);
        Z[13] = potensi.getKeanggotaanRecommended();
        LogFuz.AlfaTemp[13] = alfa[13];
        LogFuz.Zn[13] = Z[13];

        //R15
        alfa[14] = findMin(harga.keanggotaanRendah(), memoriInternal.keanggotaanRendah(), kamera.keanggotaanRendah(), ram.keanggotaanTinggi());
        potensi.setAlfa(alfa[14]);
        Z[14] = potensi.getKeanggotaanRecommended();
        LogFuz.AlfaTemp[14] = alfa[14];
        LogFuz.Zn[14] = Z[14];

        //R16
        alfa[15] = findMin(harga.keanggotaanRendah(), memoriInternal.keanggotaanRendah(), kamera.keanggotaanRendah(), ram.keanggotaanRendah());
        potensi.setAlfa(alfa[15]);
        Z[15] = potensi.getKeanggotaanNotRecommended();
        LogFuz.AlfaTemp[15] = alfa[15];
        LogFuz.Zn[15] = Z[15];

        for (int i = 0; i < 16; i++) {

            System.out.println("RULE KE : " + (i + 1));
            System.out.println("nilai alfa : " + alfa[i]);
            System.out.println("nilai z : " + Z[i]);
            System.out.println("---------------------------------");
        }
    }

    public double getPotensiSmartphone() {
        apply_rule();
        return defuzz();
    }

    private double defuzz() {
        double temp1 = 0, temp2 = 0;
        for (int i = 0; i < 16; i++) {
            temp1 = temp1 + (alfa[i] * Z[i]);
            temp2 = temp2 + alfa[i];
        }
        LogFuz.zA = (temp1 / temp2);
        return (temp1 / temp2);
    }
}
