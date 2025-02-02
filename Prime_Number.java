class Main{  
    public static void Prime_Num(int num){
        int isPrime = 0;
        if(num==0 || num==1){
            System.out.println(num+" is not a prime");
            isPrime = 1;
        } else {
            for(int i = 2;i<=num/2;i++){
                if(num%i==0){
                    System.out.println(num+" is not a prime");
                    isPrime = 1;
                    break;
                }
            }
        }
        if(isPrime == 0){
            System.out.println(num +"  is Prime");
        }
        
    }
    public static void main(String args[]){  
           Prime_Num(29); 
    }  
   }  
