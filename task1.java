import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
// import java.util.*;

class MyException extends Exception
{
 public MyException(String str)
 {
   super();
 }
}

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
            //flag varaible to keep track if negative number is there or not
            int flag=0;
            //list to store negative numbers to print in the message at the end
            List<Double> arrlist = new ArrayList<Double>(); 
  
        
            double sum=0;
          
            for (int i = 0; i < str_arr.length; i++){
                double num=0;
                //to handle exception
                try{
                    //parse number from string array
                    num =Double.parseDouble(str_arr[i]);
                    if(num<0)
                        throw new MyException("Negatives not allowed");
                    else if(num>1000)
                        continue;
                    else
                        sum =sum+num;
                
                    }
                catch(MyException m){
                    flag=1;
                    // Add negative element to the list and continue execution of for loop
                    arrlist.add(num); 
                    continue;
                    }
                catch(Exception e){
                    //break function if exception other than negative numbers occured
                    System.out.println("Exception occured while adding numbers");
                    continue; //if we want to simply ignore faulty number(which might contain other charachters) and other exception while adding particular number,
                              //execute this line
                    // return 0;
                    // break;  //else execute this line
                    }
                //print message with list if non negative numbers are there
                finally{
                    if(i==str_arr.length-1 && flag==1){
                    System.out.print("Negatives not allowed: ");
                    // for(int j=0;j<arrlist.size();j++)
                        System.out.println(arrlist);  //it will print numbers in double datatype, we change it to int if required
                    }
                 }
            }
            
            int _sum=(int)sum;
            System.out.print("sum: ");
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
