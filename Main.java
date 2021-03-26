import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner dados = new Scanner (System.in);

    System.out.print("Digite o valor de n: ");
    int n = dados.nextInt();
    
    for(int i =0; i <= n; ++i){
      if(i%2!=0){
        System.out.print(i+" ");
      }
    }
  }
}