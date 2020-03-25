package collection.arraylist;

import java.util.ArrayList;
import collection.Member;

public class MemberArrayList {
	
	private ArrayList<Member> arrayList;
		
	public MemberArrayList() {
		arrayList = new ArrayList<Member>();
	}
	public void addMember(Member member) {
		arrayList.add(member);
	}
	public boolean removeMember(int memberID) {
		for(int i =0;i<arrayList.size();i++) {
			Member member=arrayList.get(i);
			int tempID=member.getMemberID();
			if (tempID==memberID) {
				arrayList.remove(i);
				return true;
			}
		}
		System.out.println(memberID+"가 존재하지 않습니다");
		return false;
	}
	public void showAllMember() {
		for(Member member : arrayList) {
			System.out.println(member);
		}
		System.out.println();
	}
	public void insertMember(Member member, int index) {
		
		if (index<4) {
			arrayList.add(index, member);
		} else {
			System.out.println("잘못된 값");
		}
//		if (index=='0') {
//			arrayList.add(0,member);
//		} else if (index=='1') {
//			arrayList.add(1,member);
//		} else if (index=='2') {
//			arrayList.add(2,member);
//		} else if(index=='3') {
//			arrayList.add(3,member);
//		} else {
//			System.out.println("잘못된 값");
//		}
	}
}
