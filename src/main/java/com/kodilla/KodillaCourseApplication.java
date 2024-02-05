package com.kodilla;

import com.kodilla.division.AdditionalTaskForDivision;
import com.kodilla.records.Book;
import com.kodilla.records.BookRecord;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Set;


@SpringBootApplication
public class KodillaCourseApplication {

	public static void main(String[] args) {
		SpringApplication.run(KodillaCourseApplication.class, args);

		Book book = new Book("Javax", "Java introduction", 2010);
		System.out.println(book);

		BookRecord bookRecord = new BookRecord("Javax", "Java introduction", 2010);
		System.out.println(bookRecord);
		System.out.println("Title: " + bookRecord.title());

		Set<Integer> dividends = AdditionalTaskForDivision.getDividends(2, -7, 12);
		System.out.println(dividends);
	}
}
