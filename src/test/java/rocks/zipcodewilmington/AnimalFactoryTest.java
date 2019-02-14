package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`

    //Given

    //Dog dog = new Dog ();

    //When

    //Then

    @Test

    public void createDogTest(){

        //Given
        Date date= new Date();
        AnimalFactory animalFactory = new AnimalFactory();


        //When


        Dog dog = animalFactory.createDog("Butch", date);
        String name = dog.getName();
        Date bday = dog.getBirthDate();


        //Then
        Assert.assertEquals("Butch", name);
        Assert.assertEquals(date, bday);


    }

    @Test

    public void createCatTest(){

        //Given
        Date date= new Date();
        AnimalFactory animalFactory = new AnimalFactory();


        //When

        Cat cat=  animalFactory.createCat("Billy", date);
        String name = cat.getName();
        Date bday = cat.getBirthDate();


        //Then
        Assert.assertEquals("Billy", name);
        Assert.assertEquals(date, bday);


    }

}
