import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;

public class Driver extends Person implements PersonAble{
    private  String car;
    public Driver(int id, String fullName, byte age, char gender, String email, String phoneNumber, double governmentsSalary,String car) {
        super(id, fullName, age, gender, email, phoneNumber, governmentsSalary);
        this.car=car;
    }

    @Override
    public void favoriteSport() {
        if(getId()==7){
            System.out.println("");
        } else if (getId()==5) {
            System.out.println("fishing");
        }else if(getId()==8){
            System.out.println("gymnastics");
        }else
            System.out.println("It is a wrong");

    }

    @Override
    public String favoriteLanguage() {
        if(getId()==7){
            return "Uzbek";
        } else if (getId()==5) {
            return "kazakh";
        }else if (getId()==8){
            return "kyrgyz";
        } else
            return "it is a wrong";
    }

    @Override
    public Month favoriteMouth() {
        if(getId()==7){
            return Month.DECEMBER;
        } else if (getId()==5) {
            return Month.JANUARY;
        } else if (getId()==8) {
            return Month.APRIL;
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

