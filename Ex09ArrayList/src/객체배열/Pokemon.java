package 객체배열;

public class Pokemon {
	// 1. 필드
	// 이름, 타입, 스킬, hp, atk
	private String name;
	private String type;
	private String skill;
	private int hp;
	private int atk;
	

	// 2. 메소드
	// --> alt +shift + s
	// getter, setter
	// 모든 필드의 값을 초기화 시킬 수 있는 생성자 새롭게 만들기!
	
	// 생성자 메소드
	public Pokemon(String name, String type, String skill, int hp, int atk) {
		super();
		this.name = name;
		this.type = type;
		this.skill = skill;
		this.hp = hp;
		this.atk = atk;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getAtk() {
		return atk;
	}
	public void setAtk(int atk) {
		this.atk = atk;
	}
	

	
	
}
