public class CD {
    private int maCD;
    private String tuaCD;
    private String caSy;
    private int soBaiHat;
    private double giaThanh;

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
        if (soBaiHat>0){
            this.soBaiHat=soBaiHat;
        }
        else{
            System.out.println("loi");
        }
    }

    public double getGiaThanh() {
        return giaThanh;
    }

    public void setGiaThanh(double giaThanh) {
        if(giaThanh>0){
           this.giaThanh = giaThanh;
        }
        else{
            System.out.println("loi");
        }
    }

    @Override
    public String toString() {
        return "CD [maCD=" + maCD + ", tuaCD=" + tuaCD + ", caSy=" + caSy + ", soBaiHat=" + soBaiHat + ", giaThanh="
                + giaThanh + "]";
    }

    

    

}
