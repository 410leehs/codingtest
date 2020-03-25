package collection.hashset;
import java.util.HashSet;

public class HashSetTest {
	public static void main(String[] args) {
		
		HashSet<String> hashSet = new HashSet<String>();
		hashSet.add(new String("소준형"));
		hashSet.add(new String("곽민지"));
		hashSet.add(new String("박찬규"));
		hashSet.add(new String("이현석"));
		hashSet.add(new String("소준형"));
		
		System.out.println(hashSet);
	}
}
