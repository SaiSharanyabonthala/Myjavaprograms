public class nested{
public static void main(String[] args){
boolean woman=true;
boolean senior=true;
double price= 99.9;
if(woman){
 if(senior){
 System.out.println("you are a senior and your discount is 30%");
 price*=0.7;
 }
else{
 System.out.println("you are a woman and your discount is 10%"); 
 price*=0.9;
 }}
else{
 if(senior){
 System.out.println("you are a senior,woman and your discount is 30%");
 price*=0.8;
 }
else{
 System.out.println("you dont have any discount");
 price*=1;
}
}
 System.out.printf("final price based on discount:%f" ,price);
}}