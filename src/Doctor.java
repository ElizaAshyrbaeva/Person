import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;

public class Doctor extends Person implements PersonAble{
    private String type;
    public Doctor(int id, String fullName, byte age, char gender, String email, String phoneNumber, double governmentsSalary,String type) {
        super(id, fullName, age, gender, email, phoneNumber, governmentsSalary);
        this.type=type;
    }

    @Override
    public void favoriteSport() {
        if(getId()==3){
            System.out.println("Basketball");
        } else if (getId()==2) {
            System.out.println("Football");
        }else if(getId()==6){
            System.out.println("Vollayball");
        }else
            System.out.println("It is a wrong");
    }

    @Override
    public String favoriteLanguage() {
        if(getId()==3){
            return "English";
        } else if (getId()==2) {
            return "Kyrgyz";
        }else if (getId()==6){
            return "Russian";
        } else
            return "it is a wrong";
    }

    @Override
    public Month favoriteMouth() {
        if(getId()==3){
            return Month.FEBRUARY;
        } else if (getId()==2) {
            return Month.JANUARY;
        } else if (getId()==6) {
            return Month.MARCH;
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
        return getPhoneNumber()+" "+getEmail();
    }

    @Override
    public long[] getPeopleOfAllAges(Person[] people) {
        long[] array = new long[people.length];
        for (int i = 0; i < array.length; i++)
            array[i] = people[i].getAge();
        Arrays.sort(array);
        return array;
    }
    }
