public class Solution {
    
    
    /**
     * DO NOT MODIFY THE METHOD NAME OR THE PARAMETERS
     * 
     * Problem 1: Exam Average
     */

    public double average(double t1, double t2, double t3, double t4) {
        // remove 0.0 and return your answer
        double sumAverage = t1 + t2 + t3 + t4;
        sumAverage /= 4; 
        return sumAverage;
    }

    public int roundAverage(double average) {
        // remove 0 and return your answer
        int roundAv = (int) (average + 0.5);
        return roundAv;
    }

    public boolean isPassing(int roundedAverage) {
        // remove false and return your answer
        return roundedAverage >= 65;
    }

    /*
    Problem 2: Stock Price 
    */

    public double totalStock(int shares, double price) {
        // remove 0.0 and return your answer
        return (shares * price);
    }


    public int roundValueChange(double totalStock) {
        // remove 0 and return your answer
        return (int) Math.round(totalStock);
    }

    /*
    Problem 3: Digit Incrementer 
    */
   
    public double adjustDigits(double userDouble) {
        // remove 0.0 and return your answer



        int dig1 = (int) (userDouble / 100);
        int dig2 = (int) (userDouble / 10 % 10);
        int dig3 = (int) (userDouble % 10);
        int dig4 = (int) (userDouble * 10 % 10);
        int dig5 = (int) (userDouble *100%10);
       


       dig1 = (dig1 + 1) % 10;
       dig2 = (dig2 + 1) % 10;
       dig3 = (dig3 + 1) % 10;
       dig4 = (dig4 + 1) % 10;
       dig5 = (dig5 + 1) % 10;

 

       dig1 *= 100;
       dig2 *= 10;
       double pdig4 = dig4 * 0.1;
       double pdig5 = dig5 * 0.01;

        return (dig1+dig2+dig3+pdig4+pdig5);
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.adjustDigits(12.90));
        //23.01
    }

}
