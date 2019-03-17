import com.katerina.CourseProject.*;

public class Main {
    public static void main(String[] args){
		Archive archive = new Archive();
		Teacher teacher1 = new Teacher("Sarah May");
		Student student1 = new Student("Greg Johnson");
		
		Course course1 = teacher1.openCourse("Math");
		course1.joinCourse(student1);
		
		ArchiveItem archiveItem1 = teacher1.giveScore("Math", "Greg Johnson", 3);
		if (archiveItem1 != null){
			archive.add(archiveItem1);
			System.out.println("Item is added into archive");
		}
			
	}

}