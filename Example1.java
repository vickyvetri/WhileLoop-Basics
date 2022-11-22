package Looping;

public class Example1 {
public static void main(String[] args) {
	
	Example1 obj = new Example1();
	obj.Print(10);
}

private void Print(int a) {
	int i=1;
	while (i <=a){
	System.out.println(i);
	i++;
	}
}
}
