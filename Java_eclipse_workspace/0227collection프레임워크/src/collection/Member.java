package collection;

public class Member {
	private int memberID;
	private String memberName;
	
	public Member(int memberID,String memberName) {//생성자
		this.memberID =memberID;
		this.memberName =memberName;
	}
	public int getMemberID() {
		return memberID;
	}
	public void setMemberID(int memberID) {
		this.memberID = memberID;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setmemberName(String memberName) {
		this.memberName=memberName;
	}
	public String toString() {
		return memberName+"회원님의 아이디는"+memberID+"입니다";
	}
	public int hashCode() {
		return memberID;
	}
	public boolean equals(Object obj) {
		if (obj instanceof Member) {
			Member member = (Member)obj;
			if(this.memberID == member.memberID) return true;
			else return false;
		}
		return false;
	}
}
