import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;

public class Programmer extends Person implements PersonAble{
    private String stack;
    public Programmer(int id, String fullName, byte age, char gender, String email, String phoneNumber, double governmentsSalary,String stack) {
        super(id, fullName, age, gender, email, phoneNumber, governmentsSalary);
        this.stack=stack;



}

    @Override
    public void favoriteSport() {
        if(getId()==3){
            System.out.println("tennis");
        } else if (getId()==6) {
            System.out.println("Baseball");
        }else if(getId()==10){
            System.out.println("Football");
        }else
            System.out.println("It is a wrong");
    }

    @Override
    public String favoriteLanguage() {
        if(getId()==3){
            return "Indian";
        } else if (getId()==6) {
            return "Russian";
        }else if (getId()==10){
            return "Uzbek";
        } else
            return "it is a wrong";
    }

    @Override
    public Month favoriteMouth() {
        if(getId()==3){
            return Month.APRIL;
        } else if (getId()==6) {
            return Month.MAY;
        } else if (getId()==10) {
            return Month.JUNE;
        }else
            return null;
    }

    @Override
    public String getLastName() {
        return getFullName().substring(7);
    }

    @Override
    public LocalDate getDateOfBrith() {
        return LocalDate.ofEpochDay(2022-getGender());
    }

    @Override
    public String getPhoneNumberAndEmail() {
        return getPhoneNumber()+getEmail();
    }

    @Override
    public long[] getPeopleOfAllAges(Person[] people) {
        long[] array = new long[people.length];
        for (int i = 0; i< array.length; i++)
            array[i] = people[i].getAge();
        Arrays.sort(array);
        return array;
    }
}
