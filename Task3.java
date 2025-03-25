
class Task3 {
 public void taste() {
     System.out.println("tastes sweet!");
 }
}
class Chocolate extends Task3 {
 public void taste() {
        super.taste();
         System.out.println("tastes chocolately");
 }
public static void main(String[] args) {
     Chocolate chocolate = new Chocolate();
         chocolate.taste();
 }
}



