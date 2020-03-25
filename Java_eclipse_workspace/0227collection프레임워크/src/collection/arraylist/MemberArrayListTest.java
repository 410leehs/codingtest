package collection.arraylist;
import java.io.IOException;
import collection.Member;
public class MemberArrayListTest {
	public static void main(String[] args) throws IOException {
		MemberArrayList memberArrayList = new MemberArrayList();
		
		Member memberLee = new Member(1001,"ÀÌÁö¿ø");
		Member memberSon = new Member(1002,"¼Õ¹Î±¹");
		Member memberPark = new Member(1003,"¹Ú¼­ÈÍ");
		Member memberHong = new Member(1004,"È«±æµ¿");
		
		
		memberArrayList.addMember(memberLee);
		memberArrayList.addMember(memberSon);
		memberArrayList.addMember(memberPark);
		memberArrayList.addMember(memberHong);
		
		memberArrayList.showAllMember();
		
		memberArrayList.removeMember(memberHong.getMemberID());//È«¾¾ »èÁ¦
		memberArrayList.showAllMember();					   //¸ğµç »ç¶÷ Ãâ·Â
		
		Member memberKim = new Member(1005,"¹Ì½ºÅÍÅ´");
		//int index=System.in.read();
		
		memberArrayList.showAllMember();
		memberArrayList.insertMember(memberKim, 5);
		
	}
}
