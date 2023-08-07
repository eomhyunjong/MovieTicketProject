package movie;
// 설계도
	public class Movie {
      String movieName;//영화명
      int price;//금액
      int age;//나이
      int money;//실구매금액
      double rate;//할인율
      String way;//구매방법
      
      //생성자
      public Movie(String movieName, int price, int age, String way ) {
         this.movieName = movieName;
         this.price = price;
         this.age = age;
         this.way = way;
      }
      
      // 할인율 메서드
      void rateCal() {
         rate = 0.0;
           if (age < 20) {
               rate += 0.25;
           } else if (age >= 20 && age <= 30) {
               rate += 0.2;
           } else if (age > 30) {
               rate += 0.15;
           }
         // 구매방법
         switch(way) {
          case "현장 구매":
             rate += 0;
             break;
          case "인터넷 구매":
             rate += 0.05;
             break;
          case "쿠폰 구매":
             rate += 0.1;
             break;
          }
         
      } // end print메서드
      
      
      // 실구매금액 메서드
      void moneyCal() {
         money =(int) (price-(price*rate));
      } // end print메서드
      
      // 제목인쇄 메서드
      void dataPrint() { 
         System.out.println("영화명" + "\t" + "\t" + "금액" + "\t" + "\t" + "나이" + "\t" + "\t" + "실구매금액");
      } // end print메서드
      
      // 내용출력하기 메서드
      void titlePrint() {
          System.out.println(movieName + "\t" + "\t" + price + "\t" + "\t" + age + "\t" + "\t" + money);
      } // end print메서드
           
   }