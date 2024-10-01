public class AileUyesi {
    String ad;
    int yas;
    String ılıskı;

    public AileUyesi(String ad, int yas, String ılıskı){
        this.ad = ad;
        this.yas= yas;
        this.ılıskı= ılıskı;
    }

    public void PrintInfo(){
        System.out.println(ılıskı + ": " + ad + ", Yaş: " + yas);
    }
}
