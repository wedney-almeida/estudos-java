package secao11;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class CalculosComDataHora {

	public static void main(String[] args) {
		
		LocalDate d01 = LocalDate.parse("2026-10-19");
		LocalDateTime d02 = LocalDateTime.parse("2026-10-19T11:18:23");
		Instant d03 = Instant.parse("2026-10-19T11:18:23Z");
		
		LocalDate pastWeekLocalDate = d01.minusDays(5);
		LocalDate nextWeekLocalDate = d01.plusDays(5);
		
		System.out.println("pastWeekLocalDate = " + pastWeekLocalDate);
		System.out.println("nextWeekLocalDate = " + nextWeekLocalDate);
		
		LocalDateTime pastWeekLocalDateTime = d02.minusDays(5);
		LocalDateTime nextWeekLocalDateTime = d02.plusDays(5);
		
		System.out.println("pastWeekLocalDateTime = " + pastWeekLocalDateTime);
		System.out.println("nextWeekLocalDateTime = " + nextWeekLocalDateTime);
		
		Instant pastWeekInstant = d03.minus(5, ChronoUnit.DAYS);
		Instant nextWeekInstant = d03.plus(5, ChronoUnit.DAYS);
		
		System.out.println("pastWeekInstant = " + pastWeekInstant);
		System.out.println("nextWeekInstant = " + nextWeekInstant);
		
		Duration t1 = Duration.between(pastWeekLocalDateTime, d02);
		Duration t2 = Duration.between(pastWeekLocalDate.atStartOfDay(), d01.atStartOfDay());
		
		System.out.println("t1 dias = " + t1.toDays());
		System.out.println("t2 dias = " + t2.toDays());
	}

}
