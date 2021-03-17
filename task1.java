public class AddClass {
    
    //Add(string numbers) method to add 1 or 2 numbers and return 0 if string is empty
    public static int Add(String numbers){
        //use regular expression to match either ',' or '\n' (and not both,it will return exception message)as delimiters
        String[] str_arr;
        //if new line is given to change delimiter
        if(numbers.startsWith("//")){
                String[] str_arr2= numbers.split("\\\\n",2);  //split two lines of input and add to array
                String string1=str_arr2[0].substring(2);      // extract delemiter from 1st line
                str_arr= str_arr2[1].split(string1);        //split numbers from new line by extracted delimiter 
            
        }
        //else hold existing scenarios
        else{
            System.out.println("no");
            str_arr = numbers.split(",|\\\\n");
        }
        
        //condition to checkc for empty string
        if(str_arr.length<=1 && str_arr[0].equals("")){
            System.out.println(0);
            }
            
        //condition for adding unknown amount of numbers(use double type while addition and convert to int while printing output)
        else{
            double sum=0;
            for (int i = 0; i < str_arr.length; i++){
                //to handle exception
                try{
                sum =sum+Double.parseDouble(str_arr[i]);
                }
                catch(Exception e){
                    //break function if exception occured
                    System.out.println("Exception occured while adding numbers");
                    return 0;
                    // break;
                }
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
