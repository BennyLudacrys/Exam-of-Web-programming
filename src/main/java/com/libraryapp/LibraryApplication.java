package com.libraryapp;
import java.time.LocalDate; 
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.libraryapp.entities.Book;
import com.libraryapp.entities.User;
import com.libraryapp.services.BookService;
import com.libraryapp.services.NotificationService;
import com.libraryapp.services.UserService;
import com.libraryapp.utils.MidnightApplicationRefresh;

@SpringBootApplication
public class LibraryApplication {

	public static void main(String[] args) {
		SpringApplication.run(LibraryApplication.class, args);
	}

	@Autowired
	BookService bookService;
	
	@Autowired
	UserService usService;
	
	@Autowired
	NotificationService notifService;
	
	@Autowired
	BCryptPasswordEncoder pwEncoder;
	
	@Autowired
	MidnightApplicationRefresh midAppRef;
	
	@Bean
	CommandLineRunner runner() {
		return args -> {
		
			User user1 = new User("Benedito", pwEncoder.encode("test"), "benedito01@gmail.com", "Benedito", "Muianga", "Maputo-zimpeto", "840462348", "Maputo");
			user1.setRole("ROLE_ADMIN");
			
			User user2 = new User("empregado", pwEncoder.encode("test"), "empregado@gamail.com", "Jonas", "Antonio", "Hugo de Grootstraat 174", "06-87054875", "Sliedrecht");
			user2.setRole("ROLE_EMPLOYEE");
			
			User user3 = new User("user", pwEncoder.encode("test"), "Ernestomula@gmail.com", "Ernesto", "Mazivila", "Matendene ", "840462348", "Maputo");
			user3.setRole("ROLE_USER");	
			User user4 = new User("renato", pwEncoder.encode("test"), "renato@gmail.com", "renato", "langa", "joao mateus 173", "840462358", "zavala");
			User user5 = new User("mario", pwEncoder.encode("test"), "mario@gmail.com", "mario", "muvambo", "jardim 90", "8484555556", "pemba");
			User user6 = new User("kevin", pwEncoder.encode("test"), "kevin@gmail.com", "kevin", "naife", "bagamoio 30", "868686866", "beira");
			User user7 = new User("gerson", pwEncoder.encode("test"), "gerson@gmail.com", "gerson", "savele", "choupal 200", "868686866", "magude");
			User user8 = new User("nelson", pwEncoder.encode("test"), "nelson@gmail.com", "nelson", "matsinhe", "vila nova 84", "868686866", "belo horizone");
			User user9 = new User("reizen", pwEncoder.encode("test"), "reizen@gmail.com", "reizen", "dos santos", "boane 170", "868686866", "boane");
			User user10 = new User("andre", pwEncoder.encode("test"), "andre@gmail.com", "andre", "mula", "zona 195", "868686866", "nkobe");
			
			usService.save(user1);
			usService.save(user2);
			usService.save(user3);
			usService.save(user4);
			usService.save(user5);
			usService.save(user6);
			usService.save(user7);
			usService.save(user8);
			usService.save(user9);
			usService.save(user10);
			
			Book book1 = new Book("Programacao web", "Biote, Andrew Hunt", 2006, 1);
			Book book2 = new Book("Clean Code", "Robert C. Martin", 2020, 2);
			Book book3 = new Book("Code Complete", "Steve McConnell", 2012, 1);
			Book book4 = new Book("Refactoring", "Martin Fowler", 2017, 4);
			Book book5 = new Book("Head First Design Patterns", "Eric Freeman, Bert Bates, Kathy Sierra, Elisabeth Robson", 2019, 5);
			Book book6 = new Book("Analise Numerica", "Rossana", 1999, 1);
			Book book7 = new Book("The Clean Coder", "Robert Martin", 2021, 3);
			Book book8 = new Book("Working Effectively with Legacy Code", "Micheal Feathers", 2015, 1);
			Book book9 = new Book("Design Patterns", "Erich Gamma, Richard Helm. Ralph Johnson, John Vlissides", 2019, 2);
			Book book10 = new Book("Cracking the Coding Interview", "Gayle Laakmann McDowell", 2018, 3);
			Book book11 = new Book("Rework", "Jason Fried, David Heinemeier Hansson", 2011, 1);
			Book book12 = new Book("Don't Make Me Think", "Steve Krug", 2005, 1);
			Book book13 = new Book("Code", "Charles Petzold", 2017, 1);
			Book book14 = new Book("Peopleware", "Tom DeMarco, Tim Lister", 2013, 3);
			Book book15 = new Book("Introduction to Algorithms", "Thomas H. Cormen", 2020, 2);
			Book book16 = new Book("Programming Pearls", "Jon Bently", 1998, 1);
			Book book17 = new Book("Patterns of Enterprice Application Architecture", "Martin Fowler", 2020, 2);
			Book book18 = new Book("Structure and Interpretation of Computer Programs", "Harold Abelson, Gerald Jay Sussman, Julie Sussman", 2013, 1);
			Book book19 = new Book("The Art of Computer Programming", "Donald E. Knuth", 2014, 4);
			Book book20 = new Book("Domain-Driven Design", "Eric Evans", 2010, 2);
			Book book21 = new Book("Coders at Work", "Peter Seibel", 2009, 1);
			Book book22 = new Book("Rapid Development", "Steve McConnell", 1995, 6);
			Book book23 = new Book("The Self-Taught Programmer", "Cory Althoff", 2021, 1);
			Book book24 = new Book("Algorithms", "Robert Sedgewick, Kevin Wayne", 2000, 3);
			Book book25 = new Book("Continuous Delivery", "Jez Humble, David Farley", 2003, 1);
			
			bookService.save(book1);
			bookService.save(book2);
			bookService.save(book3);
			bookService.save(book4);
			bookService.save(book5);
			bookService.save(book6);
			bookService.save(book7);
			bookService.save(book8);
			bookService.save(book9);
			bookService.save(book10);
			bookService.save(book11);
			bookService.save(book12);
			bookService.save(book13);
			bookService.save(book14);
			bookService.save(book15);
			bookService.save(book16);
			bookService.save(book17);
			bookService.save(book18);
			bookService.save(book19);
			bookService.save(book20);
			bookService.save(book21);
			bookService.save(book22);
			bookService.save(book23);
			bookService.save(book24);
			bookService.save(book25);
			
			book1.setTheUser(user3);
			book1.setReturnDate(LocalDate.of(2021, 5, 23));
			
			book6.setTheUser(user3);
			book6.setReturnDate(LocalDate.of(2021, 5, 05));
			
			user3.setBooks(Arrays.asList(book10, book6));
			
			bookService.save(book6);
			bookService.save(book1);
			usService.save(user3);
						
			midAppRef.midnightApplicationRefresher();	
		};
	}
}
