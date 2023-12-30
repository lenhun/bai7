import java.util.Scanner;

public class CD {
    private int maCD;
    private String tuaCD;
    private String caSy;
    private int soBaiHat;
    private double giaThanh;

    Scanner sc = new Scanner(System.in);

    public CD(){

    }

    public CD(int maCD, String tuaCD, String caSy, int soBaiHat, double giaThanh) {
        this.maCD = maCD;
        this.tuaCD = tuaCD;
        this.caSy = caSy;
        this.soBaiHat = soBaiHat;
        this.giaThanh = giaThanh;
    }

    public int getMaCD() {
        return maCD;
    }

    public void setMaCD(int maCD) {
        this.maCD = maCD;
    }

    public String getTuaCD() {
        return tuaCD;
    }

    public void setTuaCD(String tuaCD) {
        this.tuaCD = tuaCD;
    }

    public String getCaSy() {
        return caSy;
    }

    public void setCaSy(String caSy) {
        this.caSy = caSy;
    }

    public int getSoBaiHat() {
        return soBaiHat;
    }

    public void setSoBaiHat(int soBaiHat) {
        while (soBaiHat<=0){
        System.out.println("vui long nhap lai:");
        System.out.println("Nhap so bai hat:");
        soBaiHat= sc.nextInt();
       }
       this.soBaiHat=soBaiHat;
    }

    public double getGiaThanh() {
        return giaThanh;
    }

    public void setGiaThanh(double giaThanh) {
       while (giaThanh<=0){
        System.out.println("vui long nhap lai:");
        System.out.println("Nhap gia thanh:");
        giaThanh= sc.nextDouble();
       }
       this.giaThanh=giaThanh;
        }


    @Override
    public String toString() {
        return "CD [maCD=" + maCD + ", tuaCD=" + tuaCD + ", caSy=" + caSy + ", soBaiHat=" + soBaiHat + ", giaThanh="
                + giaThanh + "]";
    }

    

    

}
