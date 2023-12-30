public class DSCD {
    
    private CD[] danhSachCD;
    private int soLuongCD;
    
    
    public DSCD(int kichThuoc) {
       danhSachCD = new CD[kichThuoc];
       soLuongCD = 0;  
    }

    public boolean themCD(CD cd){
        if(soLuongCD < danhSachCD.length && kiemTraTrungMaCD(cd.getMaCD())){
            danhSachCD[soLuongCD++]=cd;
            return true;
        }
        return false;
    }
    public boolean kiemTraTrungMaCD(int maCD) {
        for (int i = 0; i < soLuongCD; i++) {
            if (danhSachCD[i].getMaCD() == maCD) {
                return true;
            }
        }
        return false;
    }
}