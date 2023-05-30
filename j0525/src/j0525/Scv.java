package j0525;

public class Scv extends GroundUnit {
	Scv() {
		super(60);
		hitPoint = MAX_HP;
	}
	void repair(Repairable g) {
		//Repairable g = new Tank();
		Unit t = (Unit)g;
	

//	void repair(GroundUnit g) {
		while(t.hitPoint != t.MAX_HP) {
			t.hitPoint++;			
		}
		System.out.println("수리가 완료되었습니다.");
	}
}
