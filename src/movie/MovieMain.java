package movie;

public class MovieMain {
   public static void main(String arg[]) {
      
      Movie mv1 = new Movie("1917" , 11000 , 10 , "인터넷 구매");
      Movie mv2 = new Movie("주디" , 15000 , 25 , "현장 구매");
      Movie mv3 = new Movie("인비저블맨" , 12500 , 40 , "쿠폰 구매");
      
      // 내용출력하기
      mv1.dataPrint();
      System.out.println();
      
      // 할인율
      mv1.rateCal();
      mv2.rateCal();
      mv3.rateCal();
      
      // 실구매금액
      mv1.moneyCal();
      mv2.moneyCal();
      mv3.moneyCal();
      
      
      mv1.titlePrint();
      System.out.println();
      mv2.titlePrint();
      System.out.println();
      mv3.titlePrint();
   }
}
