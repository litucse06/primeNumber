/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primenumber;

/**
 *
 * @author ADMIN
 */
public class PrimeNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int n=17;        
        boolean isPrime = false;
        for(int i=2;i<=n/2;i++){
            isPrime = n%i != 0;
        }
        String primeNumber = "";
        for(int j=1;j<=n;j++){
            int counter = 0;
            for(int num=j;num>=1;num--){
                if(j%num == 0){
                    counter = counter + 1;
                }
            }
            if(counter == 2){
                primeNumber = primeNumber + j +" ";
            }       
        }
       System.out.println();
       System.out.println(primeNumber);
        
        if(isPrime == true){
            System.out.print("Prime Number");
        }else{                
            System.out.print("This is not prime number");
        }
        System.out.println();
                
    }
    
}
