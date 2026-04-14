public class PracticeProblem {

    public static void main(String args[]) {

    }
 public static boolean hasCapital(String word){
    boolean word1=false;
    String word2=word.toLowerCase();;
    for(int i=0;i<word.length();i++){
        if (word2.charAt(i)!=word.charAt(i)){
            word1=true;
        }
    }
    return word1;
   
	

	
 }
 public static boolean isPrime(int num){
    boolean word1=false;
        if (num<=1){
            return false;
        }
for(int i=2;i<num-1;i++){
     if(num%i==0){
     return false;
     }
 }
 return true;
}
}
