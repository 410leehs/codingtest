package collection;
import collection.Member;
public class MemberHashMapTest {
	public static void main(String[] args) {
		MemberHashMap memberHashMap = new MemberHashMap();
		
		Member memberPark = new Member(1001,"박새로이");
		Member memberCho = new Member(1002,"조이서");
		Member memberOh = new Member(1003,"오수아");
		Member memberJang = new Member(1004,"장근수");
		
		memberHashMap.addMember(memberPark);
		memberHashMap.addMember(memberCho);
		memberHashMap.addMember(memberOh);
		memberHashMap.addMember(memberJang);
		
		memberHashMap.showAllMember();
		
		memberHashMap.removeMember(1003);
		memberHashMap.showAllMember();
		
		try {
			int number = Integer.parseInt("A");
		}
		catch (NumberFormatException e) {
			System.out.println("에러가 발생했습니다"+e.getMessage());
			e.printStackTrace();
		}
		finally {
			System.out.println("숫자변환 마침");
		}
	}
}