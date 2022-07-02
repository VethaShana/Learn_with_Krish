import java.util.LinkedList;

public class Palindrome {
	
  public static void main(String[] args) {
    LinkedList<Character> letters = new LinkedList<Character>();
    letters.add('R');
    letters.add('A');
    letters.add('C');
    letters.add('E');
	letters.add('C');
    letters.add('A');
	letters.add('R');
    System.out.println(letters);
	System.out.println("Is this given linkedlist palindrome ?");
	
	int n = letters.size();
	char x;
	char y ;
	int i = 0;
	int j = n-1;
	int count = 0;
	int a;
	if(n%2 == 0){
		a = n/2;
	}else{
		a = (n+1)/2;
	}
	
	while(i< a){
		 x = letters.get(i);
		 y = letters.get(j);
		 System.out.println("Check : ");
		 System.out.println("Element_" + (i+1) + " -> "+letters.get(i)+ " , " +  "Element_" + (j+1) + " -> " +letters.get(j));
		 
		 
		if(x==y){
			count = count+1;
			i= i+1;
			j= j-1;
		}else{
			break;
		}
	
	}
	if(count==a){
	System.out.println("Yes");
	}
	else{
		System.out.println("No");
		
	}
	
  }
}