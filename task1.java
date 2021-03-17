public class AddClass {
    
    //Add(string numbers) method to add 1 or 2 numbers and return 0 if string is empty
    public static int Add(String numbers){
        String[] str_arr = numbers.split(",");
        
        //condition to checkc for empty string
        if(str_arr.length<=1 && str_arr[0].equals("")){
            System.out.println("0");
            }
            
        //condition for adding 1 or 2 numbers(use double type while addition and convert to int while printing output)
        else if(str_arr.length<=2){
            double sum=0;
            for (int i = 0; i < str_arr.length; i++){
                sum =sum+Double.parseDouble(str_arr[i]);
                }
            
            int _sum=(int)sum;
            System.out.println(_sum);
   
            }
        return 0;
        }
    
    public static void main(String args[]) {
        //take input as command line argument
        String str=args[0];
        Add(str);
      }
      
}
