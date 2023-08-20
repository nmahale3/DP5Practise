package arraylab.view;

import java.util.Scanner;
import arraylab.model.Books;
import arraylab.service.BookService;

public class BooksView {
	static BookService bs=new BookService();
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {

		char ch = 1;
		do {
			System.out.println("Choose the option:\n1.add new book\n2.modify book name\n3.modify book price\n4.View Details");
			int choice = in.nextInt();

			switch (choice) {
			case 1:

				System.out.println("Enter the id");
				int id1 = in.nextInt();
				System.out.println("Enter the name");
				String name1 = in.next();
				System.out.println("Enter the price");
				float price1 = in.nextInt();
				bs.addBookService(new Books(id1, name1, price1));
				System.out.println("Successfully added new book");
				break;

			case 2:

				System.out.println("Enter the id");
				int id2 = in.nextInt();
				System.out.println("Enter the name");
				String name2 = in.next();
				System.out.println("Enter the price");
				float price2 = in.nextInt();
				bs.modifyBooknameService(new Books(id2, name2, price2));
				System.out.println("Successfully added new book");
				break;

			case 3:

				System.out.println("Enter the id");
				int id3 = in.nextInt();
				System.out.println("Enter the name");
				String name3 = in.next();
				System.out.println("Enter the price");
				float price3 = in.nextInt();
				bs.modifyBookPriceService(new Books(id3, name3, price3));
				System.out.println("Successfully book added ok");
				break;
				
			case 4:
				
				Books []b=bs.getAllBooksService();
				for (int i = 0; i < b.length; i++) {
					if(b[i]!=null)
					{
						System.out.println(b[i]);
					}
				}
				
			}

			System.out.println("Enter the choice Y or y format:");
			ch = in.next().charAt(0);
		} while (ch == 'y' || ch == 'Y');

	}

}
