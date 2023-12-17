import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
//Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
//ottieni l'anno
//ottieni il mese
//ottieni il giorno
//ottieni il giorno della settimana
//Stampa i risultati sulla console

public class Main {
    public static void main(String[] args) {
        OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        System.out.println("Data :" + data);

        int mese = data.getMonthValue();
        System.out.println("Data :" + mese);

        // Get last day of month for current date
        LocalDate date1 = LocalDate.of(2022, 1, 27);
        LocalDate date2 = LocalDate.of(2023, 1, 27);
        LocalDate date3 = LocalDate.of(2024, 1, 27);


        //stampa la data maggiore
        if(date1.isAfter(date2)){
            System.out.println("La dat più recente è :" + date1);
        }
        List<LocalDate> localDates= new ArrayList<>();
        localDates.add(date1);
        localDates.add(date2);
        localDates.add(date3);


        LocalDate dataPiuRecente= localDates.get(0);

        for(LocalDate localDate : localDates){
            if(dataPiuRecente.isBefore(localDate)){
               dataPiuRecente = localDate;
            }
        }
        System.out.println(dataPiuRecente);








    }
}