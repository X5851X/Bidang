/**
 *
 * @author R
 */
public class BidangDatar {
    double alas, tinggi;
    int sisi, panjang, lebar;
    float diameter;
    
    public double isiSegitigaTrapesium (double a, double t){
       this.alas = a; 
       this.tinggi = t;
       double luas = 0.5*a*t;
       return luas;
    }
    public void isiPersegi (int s) {
        this.sisi = s;
        int luas = s*s;
    }
    public void isiPersegiPanjang (int p, int l){
        this.panjang = p;
        this.lebar = l;
    }
    public float isiLingkaran (float d) {
       this.diameter = d;
       float luas = d;
       return luas;
    }
    
    void luasSegitiga () {
        System.out.println ();
    }
    public int luasPersegi () {
        return sisi*sisi;
    }
    public int luasPersegiPanjang (){
        return panjang*lebar;
    }
    public float luasLingkaran (){
        return (float) (Math.PI*diameter);
    }
}
