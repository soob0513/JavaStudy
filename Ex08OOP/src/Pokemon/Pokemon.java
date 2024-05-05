package Pokemon;

public class Pokemon {
	// 1. 필드(데이터, 속성)
	// 이름, 타입, 스킬 이름, 체력 : hp, 공격력 : atk
	private String name;
	private String type;
	private String skill;
	private int hp;
	private int atk;
	
	
	// 2. 메소드 (기능, 행위, 로직)
	// 모든 필드의 값을 매개변수로 받아서 객체를 생성하는 순간에 채워주는 생성자 메소드 하나 만들기!
	public Pokemon(String name, String type, String skill, int hp, int atk) {
		this.name = name;
		this.type = type;
		this.skill = skill;
		this.hp = hp;
		this.atk = atk;
	}


	
	// name, type, skill, hp, atk --> getter
	public String getName() {
		return name;
	}
	
	
	public String getType() {
		return type;
	}
	
	
	public String getSkill() {
		return skill;
	}
	
	
	public int getHp() {
		return hp;
	}
	
	
	public int getAtk() {
		return atk;
	}

	// hp, atk --> setter 
	public void setHp(int hp) {
		this.hp = hp;
	}



	public void setAtk(int atk) {
		this.atk = atk;
	}
	
	
	
	
	
}
