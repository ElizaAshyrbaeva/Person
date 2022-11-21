import javax.print.Doc;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
            Doctor doctor1 = new Doctor(3,"Muratova   Ainazik  ", (byte) 24,'M',"ainazikmuratova@gmail.com","33333",20300,"Surgeon"); {
            Doctor doctor2 = new Doctor(2,"Kamitov   Dosi ", (byte) 29,'F',"@dosikamytov@gmail.com","5555",24500,"Pediatrician");
            Doctor doctor3 = new Doctor(6, "Azimov    Almaz ", (byte) 34, 'F', "@almazazimov@gmail.com", "7777", 40000,"Dentist");
            doctor3.favoriteSport();
            System.out.println(doctor3.favoriteLanguage());
            System.out.println(doctor3.getLastName());
            System.out.println(doctor3.getDateOfBrith());
            System.out.println(doctor3.getPhoneNumberAndEmail());


            Driver driver1= new Driver(7,"Shabdanov    Ilim ",(byte) 18,'F',"ilimshabdanov@gmail.com","77777",8789,"Lexus");
            Driver driver2= new Driver(5,"Altynbek u   Alibek ",(byte) 34,'F',"alibekaltynbeku@gmail.com","99999",9600,"Audi");
            Driver driver3= new Driver(8,"Ismailov    Adilet ",(byte) 28,'F',"adilet@gmail.com","22223",10000,"Toyota");
            driver1.favoriteSport();
            System.out.println(driver1.favoriteLanguage());
            System.out.println(driver1.favoriteMouth());
            System.out.println(driver1.getLastName());
            System.out.println(driver1.getDateOfBrith());
            System.out.println(driver1.getPhoneNumberAndEmail());

            Programmer programmer1 = new Programmer(3,"Jorobaeva    Nuriza  ", (byte)45,'f',"@nuriza","1111",100000.00,"Fronted");
            Programmer programmer2 = new Programmer(6,"Rysbaeva     Asel  ",(byte)20,'f',"@Asel","2222",50000.00,"Backend");
            Programmer programmer3 = new Programmer(10,"Gaparov    Nurzhigit ",(byte)18,'f',"@zhigit","3333",60000.00,"Backend");
            programmer3.favoriteSport();
            System.out.println(programmer3.favoriteLanguage());
            System.out.println(programmer3.favoriteMouth());
            System.out.println(programmer3.getLastName());
            System.out.println(programmer3.getDateOfBrith());
            System.out.println(programmer3.getPhoneNumberAndEmail());

            Person[] people = {doctor1,doctor2,doctor3,driver1,driver2,driver3,programmer1,programmer2,programmer3};

            System.out.println(Arrays.toString(programmer2.getPeopleOfAllAges(people)));

    }
}
        }