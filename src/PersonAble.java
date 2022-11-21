import java.time.LocalDate;
import java.time.Month;

public interface PersonAble {
    void favoriteSport();

    String favoriteLanguage();

    Month favoriteMouth();

    String getLastName();

    LocalDate getDateOfBrith();

    String getPhoneNumberAndEmail();

    long[] getPeopleOfAllAges(Person[] people);




}