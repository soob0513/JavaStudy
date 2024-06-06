package MusicPlayer;

public class Music {
	// 음악 하나의 데이터를 보관하는 Music
	// 1. 필드
	// 제목, 가수, 재생시간
	private String title;
	private String artist;
	private int second;

	// 2. 메소드
	// 모든 필드에 있는 데이터를 초기화시킬 수 있는 생성자 하나 만들기
	public Music(String title, String artist, int second) {
		this.title = title;
		this.artist = artist;
		this.second = second;
	}
	
	// 모든 필드에 대해서 getter,setter 메소드 만들기
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getSecond() {
		return second / 60 + "분" + second % 60 + "초";
	}
	public void setSecond(int second) {
		this.second = second;
	}
}
