/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;

/**
 *
 * @author Dell Inspiron
 */
@Entity
public class Karyawan extends Additional implements Serializable {

    @OneToOne(mappedBy = "karyawan")
    private UserKaryawan userKaryawan;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "karyawan", fetch = FetchType.LAZY)
    private List<KaryawanSkillTeknis> karyawanSkillTekniss;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "karyawan", fetch = FetchType.LAZY)
    private List<KaryawanBahasa> karyawanBahasas;

    @OneToMany(mappedBy = "karyawan")
    private List<Tanggungan> tanggungans;

    @OneToMany(mappedBy = "karyawan")
    private List<SertifikasiTraining> sertifikasiTrainings;

    @OneToMany(mappedBy = "karyawan")
    private List<RiwayatProjek> riwayatProjeks;

    @OneToOne(mappedBy = "karyawan")
    private InfoTambahan infoTambahan;

    @OneToMany(mappedBy = "karyawan")
    private List<DataKontakDarurat> dataKontakDarurats;

    @OneToMany(mappedBy = "karyawan")
    private List<DataKeluarga> dataKeluargas;

    @OneToMany(mappedBy = "karyawan")
    private List<Alamat> alamats;
   
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private Agama agama;
    @ManyToOne
    private LevelPosisi levelPosisi;
    private String nikKitasPassport;
    private String npwp;
    private String namaLengkap;
    private JenisKelamin jenisKelamin;
    private String tempatLahir;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date tglLahir;
    private String noTelp1;
    private String noTelp2;
    private String noHp;
    private String email;
    private String posisi;
    private String ktpPath;
    private String kkPath;
    private String pasFotoPath;
    @ManyToOne
    private Negara negara;

    public Karyawan() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Karyawan)) {
            return false;
        }
        Karyawan other = (Karyawan) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Karyawan[ id=" + id + " ]";
    }

    public Agama getAgama() {
        return agama;
    }

    public void setAgama(Agama agama) {
        this.agama = agama;
    }

    public LevelPosisi getLevelPosisi() {
        return levelPosisi;
    }

    public void setLevelPosisi(LevelPosisi levelPosisi) {
        this.levelPosisi = levelPosisi;
    }

    public String getNikKitasPassport() {
        return nikKitasPassport;
    }

    public void setNikKitasPassport(String nikKitasPassport) {
        this.nikKitasPassport = nikKitasPassport;
    }

    public String getNpwp() {
        return npwp;
    }

    public void setNpwp(String npwp) {
        this.npwp = npwp;
    }

    public String getNamaLengkap() {
        return namaLengkap;
    }

    public void setNamaLengkap(String namaLengkap) {
        this.namaLengkap = namaLengkap;
    }

    public JenisKelamin getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(JenisKelamin jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public String getTempatLahir() {
        return tempatLahir;
    }

    public void setTempatLahir(String tempatLahir) {
        this.tempatLahir = tempatLahir;
    }

    public Date getTglLahir() {
        return tglLahir;
    }

    public void setTglLahir(Date tglLahir) {
        this.tglLahir = tglLahir;
    }

    public String getNoTelp1() {
        return noTelp1;
    }

    public void setNoTelp1(String noTelp1) {
        this.noTelp1 = noTelp1;
    }

    public String getNoTelp2() {
        return noTelp2;
    }

    public void setNoTelp2(String noTelp2) {
        this.noTelp2 = noTelp2;
    }

    public String getNoHp() {
        return noHp;
    }

    public void setNoHp(String noHp) {
        this.noHp = noHp;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPosisi() {
        return posisi;
    }

    public void setPosisi(String posisi) {
        this.posisi = posisi;
    }

    public String getKtpPath() {
        return ktpPath;
    }

    public void setKtpPath(String ktpPath) {
        this.ktpPath = ktpPath;
    }

    public String getKkPath() {
        return kkPath;
    }

    public void setKkPath(String kkPath) {
        this.kkPath = kkPath;
    }

    public String getPasFotoPath() {
        return pasFotoPath;
    }

    public void setPasFotoPath(String pasFotoPath) {
        this.pasFotoPath = pasFotoPath;
    }

    public Negara getNegara() {
        return negara;
    }

    public void setNegara(Negara negara) {
        this.negara = negara;
    }

    public UserKaryawan getUserKaryawan() {
        return userKaryawan;
    }

    public void setUserKaryawan(UserKaryawan userKaryawan) {
        this.userKaryawan = userKaryawan;
    }

    public List<KaryawanSkillTeknis> getKaryawanSkillTekniss() {
        return karyawanSkillTekniss;
    }

    public void setKaryawanSkillTekniss(List<KaryawanSkillTeknis> karyawanSkillTekniss) {
        this.karyawanSkillTekniss = karyawanSkillTekniss;
    }

    public List<KaryawanBahasa> getKaryawanBahasas() {
        return karyawanBahasas;
    }

    public void setKaryawanBahasas(List<KaryawanBahasa> karyawanBahasas) {
        this.karyawanBahasas = karyawanBahasas;
    }

    public List<Tanggungan> getTanggungans() {
        return tanggungans;
    }

    public void setTanggungans(List<Tanggungan> tanggungans) {
        this.tanggungans = tanggungans;
    }

    public List<SertifikasiTraining> getSertifikasiTrainings() {
        return sertifikasiTrainings;
    }

    public void setSertifikasiTrainings(List<SertifikasiTraining> sertifikasiTrainings) {
        this.sertifikasiTrainings = sertifikasiTrainings;
    }

    public List<RiwayatProjek> getRiwayatProjeks() {
        return riwayatProjeks;
    }

    public void setRiwayatProjeks(List<RiwayatProjek> riwayatProjeks) {
        this.riwayatProjeks = riwayatProjeks;
    }

    public InfoTambahan getInfoTambahan() {
        return infoTambahan;
    }

    public void setInfoTambahan(InfoTambahan infoTambahan) {
        this.infoTambahan = infoTambahan;
    }

    public List<DataKontakDarurat> getDataKontakDarurats() {
        return dataKontakDarurats;
    }

    public void setDataKontakDarurats(List<DataKontakDarurat> dataKontakDarurats) {
        this.dataKontakDarurats = dataKontakDarurats;
    }

    public List<DataKeluarga> getDataKeluargas() {
        return dataKeluargas;
    }

    public void setDataKeluargas(List<DataKeluarga> dataKeluargas) {
        this.dataKeluargas = dataKeluargas;
    }

    public List<Alamat> getAlamats() {
        return alamats;
    }

    public void setAlamats(List<Alamat> alamats) {
        this.alamats = alamats;
    }
    
}
