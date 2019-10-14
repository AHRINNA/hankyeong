import java.util.ArrayList;
import java.util.List;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BBsVO[] bbsArray = new BBsVO[10];
		bbsArray[1] = new BBsVO();
		bbsArray[1].Auth = "홍길동";
		System.out.println(bbsArray[1].Auth);

		List<BBsVO> bbsList; // = new ArrayList<BBsVO>();
		bbsList = new ArrayList<BBsVO>();

		BBsVO b = new BBsVO();
		b.Auth = "홍길동";
		bbsList.add(b);
		
		b.Auth = "장만월";
		bbsList.add(b);
		
		System.out.println(bbsList.get(0).Auth);
		System.out.println(bbsList.get(1).Auth);
	}
}
