package averin.soap.com.Model;

public class AntrianPoli {
    private String  no_registrasi, no_antrian, no_kunjungan, no_mr, kode_poli, kode_bag_tujuan, nama_px,
            tgl_poli, jam_poli;

    public AntrianPoli(String no_registrasi, String no_antrian, String no_kunjungan ,String no_mr, String kode_poli,
                   String kode_bag_tujuan, String nama_px, String tgl_poli, String jam_poli) {
        this.no_registrasi = no_registrasi;
        this.no_antrian = no_antrian;
        this.no_kunjungan = no_kunjungan;
        this.no_mr = no_mr;
        this.kode_poli = kode_poli;
        this.kode_bag_tujuan = kode_bag_tujuan;
        this.nama_px = nama_px;
        this.tgl_poli = tgl_poli;
        this.jam_poli = jam_poli;
    }

    public String getNo_registrasi() {return no_registrasi; }
    public String getNo_antrian() {return  no_antrian; }
    public String getNo_kunjungan() {return no_kunjungan; }
    public String getNo_mr() {return no_mr; }
    public String getKode_poli() {return kode_poli; }
    public String getKode_bag_tujuan() {return kode_bag_tujuan; }
    public String getNama_px() {return nama_px; }
    public String getTgl_poli() {return tgl_poli; }
    public String getJam_poli() {return jam_poli; }
}

