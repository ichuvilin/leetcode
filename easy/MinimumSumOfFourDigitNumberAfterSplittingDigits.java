class MinimumSumOfFourDigitNumberAfterSplittingDigits {
    public int minimumSum(int num) {
      	int[] x = new int[4];           
        x[0] = num%10;                  
        num /= 10;
        x[1] = num%10;                 
        num /= 10;
        x[2] = num%10;                
        num /= 10;
        x[3] = num%10;                
        num /= 10;
        
        Arrays.sort(x);               
        
        int num1 = x[0]*10 + x[2];    
        int num2 = x[1]*10 + x[3];    
	return num1 + num2;  
    }
}
