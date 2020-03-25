
public class healthclub {
	public static void main(String[] args) {
		int elevator=5;
		String place="";
		
	switch (elevator) {
		case 1 : place="약국";
			break;

		case 2 : place="정형외과";
			break;
		case 3 : place="피부과";
			break;
		case 4 : place="치과";
			break;
		default: place="헬스클럽";

	}
		System.out.println(place);
}
}
