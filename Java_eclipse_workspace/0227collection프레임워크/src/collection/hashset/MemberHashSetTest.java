package collection.hashset;

import collection.Member;

public class MemberHashSetTest {
	public static void main(String[] args) {
		MemberHashSet memberHashSet = new MemberHashSet();
		
		Member memberSo= new Member(1001,"소준형");
		Member memberLee= new Member(1002,"이영철");
		Member memberKim= new Member(1003,"김은성");
		
		memberHashSet.addMember(memberSo);
		memberHashSet.addMember(memberLee);
		memberHashSet.addMember(memberKim);
		memberHashSet.showAllMember();
		
		Member memberAhn = new Member(1003,"안용범");
		memberHashSet.addMember(memberAhn);
		memberHashSet.showAllMember();
	}
}
