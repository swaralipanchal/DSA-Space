class Main {
    public static void main(String[] args) {
     int  a = 5 , b = 10;
     System.out.println("Before swap "+" a: " + a + " ,  b: " + b);
      a = a + b; // now here a+ b is 15
      b = a - b ; // if 15(Total) - b(10) = 5 , assign it to b 
      a = a - b; //now b = 5 here , and a =15 , do a-b = 15-5 = 10  ,        assign it to a
      System.out.println("After swap "+" a: " + a + " ,  b: " + b);
    }
}