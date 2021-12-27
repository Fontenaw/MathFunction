//Nicholas Fontenot
//MathFunction
import java.util.Scanner; //import Scanner

public class Main
{
    
    static String mathFunction(int A, int B, int C) {
        String[] FList = {"0", "1", "2", "3"};
        int Count = 0;
        //ADD 
        int ADD = A + B;
        if (C == ADD){ //if C = A+B, then + is put in FList at Count (0)
            FList[Count]="+";
            Count = Count + 1; 
        }
        //Subtract
        int SUB1 = A - B;
        int SUB2 = B-A;
        if (C == SUB1 || C == SUB2){
            FList[Count]="-";
            Count = Count + 1;
        }
        //Multiply
        int MUL = A*B;
        if (C == MUL){
            FList[Count]="*";
            Count = Count + 1;
        }
        //Division
        if (B == 0){
            
        } 
        else{
            int DIV1 = A/B;
            if (C == DIV1){
                FList[Count]="/";
                Count = Count + 1;
            }
        }
    
        if (A == 0){
            
        } 
        else{
            int DIV2 = A/B;
            if (C == DIV2){
                FList[Count]="/";
                Count = Count + 1;
            }
        }
        
        if (Count == 0){
            String MathString = "None";
            return MathString;
        }
        else if(Count == 1){
            String MathString = FList[0];
            return MathString;
        }
        else if(Count == 2){
            String MathString = (FList[0]+ " AND "+FList[1]);
            return MathString;
        }
        else if(Count == 3){
            String MathString = (FList[0]+ " AND "+FList[1]+" AND "+FList[2]);
            return MathString;
        }
        else{
            String MathString = (FList[0]+ " AND "+FList[1]+" AND "+FList[2]+" AND "+FList[3]);
            return MathString;
        }
        
        
    
    
  }
  
	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);  
        System.out.println("A: ");
        String AString = myObj.nextLine();
        int A = Integer.parseInt(AString);
        
        System.out.println("B: ");
        String BString = myObj.nextLine();
        int B = Integer.parseInt(BString);
        
        System.out.println("C: ");
        String CString = myObj.nextLine();
        int C = Integer.parseInt(CString);
        
        System.out.print(mathFunction(A, B, C));
	}
}
