/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz.if1.pkg10119032.ginanjartubagusgumilar;

/**
 *
 * @author Ginanjar Tubagus Gumilar
 * Nama     : Ginanjar Tubagus Gumilar
 * Kelas    : IF 1
 * NIM      : 10119032
 * Deskripsi Program : Berisi implements ServicePrice
 */
public class ServicePrice implements ServiceItem {
    private float priceService, discount;

    public float getPriceService(){
        return priceService;
    }
    public void setPriceService(float priceService);
      public void displayService() {
          System.out.println("===================");
          System.out.println("== Rock n Roll Haircut ==");
          System.out.println("=== service list ===");
          System.out.println("1. Haircut : IDR 45K");
          System.out.println("2. Hairwash");
          System.out.println("3. Hairwash only");
    }
    public float getPrice(int serviceItem){
        return price;
    }
    public boolean checkMemberStatus(String statusMember);
    public float getSale(boolean isMember, float parServicePrice);
    public float getTotalPay(float priceService, float discount);
}