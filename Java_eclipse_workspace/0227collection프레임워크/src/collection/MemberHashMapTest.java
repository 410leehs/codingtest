package collection;
import collection.Member;
public class MemberHashMapTest {
	public static void main(String[] args) {
		MemberHashMap memberHashMap = new MemberHashMap();
		
		Member memberPark = new Member(1001,"�ڻ�����");
		Member memberCho = new Member(1002,"���̼�");
		Member memberOh = new Member(1003,"������");
		Member memberJang = new Member(1004,"��ټ�");
		
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
			System.out.println("������ �߻��߽��ϴ�"+e.getMessage());
			e.printStackTrace();
		}
		finally {
			System.out.println("���ں�ȯ ��ħ");
		}
	}
}