package week2.day3;

public class Library {
	
	public String addBook (String bookTitle) {
		System.out.println(bookTitle);
		System.out.println("Book added successfully");
		return bookTitle;

	}
	
	public void issueBook() {
		System.out.println("Book issued successfully");
	}

	public static void main(String[] args) {
		Library lable = new Library();
		lable.addBook("Pride & Prejudice");
		lable.issueBook();
		

	}

}
