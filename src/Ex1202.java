import java.io.File;

public class Ex1202 {

	public static void main(String[] args) {
		File fileObj = new File("scr\\example02.java");
		
		if (fileObj.exists()) {
			System.out.println("파일의 이름: " + fileObj.getName());
			System.out.println("파일의 이름: " + fileObj.getAbsoluteFile());
			System.out.println("파일의 이름: " + fileObj.canWrite());
			System.out.println("파일의 이름: " + fileObj.canRead());
			System.out.println("파일의 이름: " + fileObj.length());
			
		} else {
			System.out.println("존재하는 파일이 아닙니다.");
		}
	}

}
