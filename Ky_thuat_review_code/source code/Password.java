import java.util.ArrayList;
import java.util.Scanner;
 
class Example1 {
 
    public static void main(String[] args) {
        //FileInputStream fis = new FileInputStream("input.txt");
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        input.nextLine();
 
        StringBuffer arr;
        arr = new StringBuffer();
        
        int count1=0;
        int Max1 =0;
        
        String[] word = new String[N];
        for (int i = 0; i < N; i++) {
            word[i] = input.next();
        }
        
        int lengtt = 0;
        String results = null;
        for(int i=0;i<N-1;i++){
        	for(int j=i+1;j<N;j++){
        		if((word[i].length()) == (word[j].length())){
        			int dem = word[i].length();
        			int count = 0;
        			for(int x=0;x<dem;x++){
        				if(word[i].substring(x, x+1).equals(word[j].substring(dem-x-1, dem-x))){
        					count++;
        				}
        			}
        			if(count==dem){
        				lengtt = dem;
        				results = word[i].substring(dem/2, dem/2+1);
        				System.out.println(lengtt + " " + results);
        				return;
        			}
        		}
        	}
        	
        }
    }
    
    
}