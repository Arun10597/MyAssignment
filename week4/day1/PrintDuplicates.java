package week4.day1;
import java.util.Set;
import java.util.TreeSet;

public class PrintDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="arunkumar";
		char[] charArray = s.toCharArray();
		Set<Character> unique=new TreeSet<Character>();
		Set<Character> duplicates=new TreeSet<Character>();
		
		for (int i=0; i < charArray.length; i++) {
			boolean b = unique.add(charArray[i]);
			if (!b) {
				duplicates.add(charArray[i]);
			}
		}
		System.out.println(unique);
		System.out.println(duplicates);

	}

}
