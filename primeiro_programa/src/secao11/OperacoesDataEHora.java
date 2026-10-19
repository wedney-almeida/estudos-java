package secao11;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class OperacoesDataEHora {
	
	public static void main(String[] args) {
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
		DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;
		DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT;
		
		LocalDate d01 = LocalDate.now();
		LocalDateTime d02 = LocalDateTime.now();
		Instant d03 = Instant.now();
		
		LocalDate d04 = LocalDate.parse("2026-10-19");
		LocalDateTime d05 = LocalDateTime.parse("2026-10-19T10:10:26");
		Instant d06 = Instant.parse("2026-10-19T10:13:00Z");
		Instant d07 = Instant.parse("2026-10-19T10:13:00-03:00");
		
		LocalDate d08 = LocalDate.parse("19/10/2026", fmt1);
		LocalDateTime d09 = LocalDateTime.parse("19/10/2026 10:35", fmt2);
		LocalDate d10 = LocalDate.of(2026, 10, 19);
		LocalDateTime d11 = LocalDateTime.of(2026, 10, 19, 10, 42, 36);
		
		Instant d12 = Instant.parse("2026-10-19T10:52:25Z");
		
		
		System.out.println("d01 = " + d01.toString());
		System.out.println("d02 = " + d02.toString());
		System.out.println("d03 = " + d03.toString());
		
		System.out.println("d04 = " + d04.toString());
		System.out.println("d05 = " + d05.toString());
		System.out.println("d06 = " + d06.toString());
		
		System.out.println("d07 = " + d07.toString());
		System.out.println("d08 = " + d08.toString());
		System.out.println("d09 = " + d09.toString());
		
		System.out.println("-------------------------------");
		System.out.println("d09 = " + d09.format(fmt4));
		System.out.println("d10 = " + d10.toString());
		System.out.println("d11 = " + d11.toString());
		System.out.println("d12 = " + fmt3.format(d12));
		System.out.println("d12 = " + fmt5.format(d12));
	
		
	}
}
