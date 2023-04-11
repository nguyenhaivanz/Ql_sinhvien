package Model;

public class Sinhvien extends People {
    private String MSV;
    private String TruongHoc;
    private int NBD;
    private double DTB;

    public Sinhvien(int ID, String name, int birth, String address, int height, int weight, String MSV, String truongHoc, int NBD, double DTB) {
        super(ID, name, birth, address, height, weight);
        this.MSV = MSV;
        TruongHoc = truongHoc;
        this.NBD = NBD;
        this.DTB = DTB;
    }

    public String getMSV() {
        return MSV;
    }

    public void setMSV(String MSV) {
        this.MSV = MSV;
    }

    public String getTruongHoc() {
        return TruongHoc;
    }

    public void setTruongHoc(String truongHoc) {
        TruongHoc = truongHoc;
    }

    public int getNBD() {
        return NBD;
    }

    public void setNBD(int NBD) {
        this.NBD = NBD;
    }

    public double getDTB() {
        return DTB;
    }

    public void setDTB(double DTB) {
        this.DTB = DTB;
    }

    @Override
    public String toString() {
        return "Sinhvien{" +
                "MSV='" + MSV + '\'' +
                ", TruongHoc='" + TruongHoc + '\'' +
                ", NBD=" + NBD +
                ", DTB=" + DTB +
                '}';
    }
}
