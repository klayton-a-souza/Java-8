package java8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Data {
	public static void main(String[] args) {

		LocalDate hoje = LocalDate.now();
		LocalDate atualCopoDoMundo = LocalDate.of(2022, Month.DECEMBER, 18);

		Period periodo = Period.between(hoje, atualCopoDoMundo);
		System.out.println("Faltam um total de Anos: " + periodo.getYears() + ", Meses: " + periodo.getMonths()
				+ ", Dias: " + periodo.getDays() + ", para a atual copo do mundo acontecer");

		LocalDate antigaCopaDoMundo = atualCopoDoMundo.minusYears(4);
		LocalDate futuraCopaDoMundo = atualCopoDoMundo.plusYears(4);

		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter formatadorComHoras = DateTimeFormatter.ofPattern("dd/MM/yy hh:mm");

		System.out.println("A data da ultima copa do mundo que foi: " + antigaCopaDoMundo.format(formatador));
		System.out.println("A data da atual copo do mundo e: " + atualCopoDoMundo.format(formatador));
		System.out.println("A data da proxima copo do mundo e: " + futuraCopaDoMundo.format(formatador));

		LocalDateTime agora = LocalDateTime.now();
		System.out.println(agora.format(formatadorComHoras));

		
		 LocalDate codigo0604 = LocalDate.of(2099,Month.JANUARY,25);
		 Period codigoPeriodo = Period.between(hoje, codigo0604);
		 
		 System.out.println("Antes da formatacao: " + codigoPeriodo);
		 
		 DateTimeFormatter codigoFormatado = DateTimeFormatter.ofPattern("dd/MM/yy");
		 
		 System.out.println("Depois da formatacao: " + codigo0604.format(codigoFormatado));
		 
	}

}
