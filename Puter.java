import java.util.*;
class Puter {
  public static void main(String[] args) {
    Scanner kbd = new Scanner(System.in);
    int n = kbd.nextInt();
    int t , count=0;
    for (int i=0;i<n;i++){
      t=kbd.nextInt();
      if(t<0){
        count=count+1;
      }
    }
    System.out.print(count);
    kbd.close();
  }
}