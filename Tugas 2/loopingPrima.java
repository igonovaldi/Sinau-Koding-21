public class loopingPrima {
    public static void main(String[] args) {
        for(int n = 1; n < 21; n++){
            int temp = 0;
            if(n > 2){
                for(int i = 2; i < n; i++){
                    if(n%i == 0){
                        if (n % 2 == 0) {
                            System.out.println(n + " merupakan bilangan genap");
                            break;
                        } else {
                            System.out.println(n + " merupakan bilangan ganjil");
                            break;
                        }
                    }
                    if(i+1 == n){
                        temp = n;
                    }
                }
            }if (n == 1) {
                System.out.println(n + " merupakan bilangan ganjil");
            } else if (n == 2) {
                System.out.println(n + " merupakan bilangan genap");
            } else if (temp == n) {
                System.out.println(n + " merupakan bilangan prima");
            }
        }
    }
}
