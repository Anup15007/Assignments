import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class DeleteCopyFromOneList {
public static void main(String...args){
	ArrayList<Integer> list1 =new ArrayList<>();
	ArrayList<Integer> list2= new ArrayList<>();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number of elements you want in list 1.");
	int noOfElementList1 =sc.nextInt();
	int i=1;
	while(i<=noOfElementList1){
		System.out.println("Enter "+i+"th element.");
		int element = sc.nextInt();
		list1.add(element);
		i++;
	}System.out.println("List1 ends here.");
	System.out.println("\n");
	System.out.println("Enter number of elements you want in list 2.");
	int noOfElementList2 = sc.nextInt();
	int j=1;
	while(j<=noOfElementList2){
		System.out.println("Enter "+j+"th element.");
		int element =sc.nextInt();
		list2.add(element);
		j++;
	}System.out.println("List2 ends here.");
	list1.removeAll(list2);
	for(Integer element:list1)
		System.out.println("Elements are " +element);
}
}
