package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {


    
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    @Test
    public void setDogNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }

    @Test

    public void getDogNameTest() {

        //Given
        String name = "Billy";
        Date bday = new Date();
        Integer id = 0;

        //When
        Dog dog = new Dog(name, bday, id);
        String retrieveName = dog.getName();
        //return retrieveName;


        //Then
        Assert.assertEquals(name, retrieveName);

    }




    // TODO - Create tests for `setBirthDate(Date birthDate)`

    @Test

    public void setDogBirthDateTest() {

        //Given
        String name = "Sakura";
        Date bday = new Date();
        Date bday1 = new Date(1);
        Integer id = 1;



        //When
        Cat cat = new Cat(name, bday, id);
        cat.setBirthDate(bday1);


        //Then
        Date bday2 = (Date) cat.getBirthDate();

        Assert.assertEquals(bday2, bday1);

    }

    // TODO - Create tests for `speak`
    @Test
    public void dogSpeakTest() {
        // Given
        String givenName = "Yuki";
        Date givenBirthDate = new Date();
        Integer givenId = 1;

        //When
        Dog dog = new Dog(givenName, givenBirthDate, givenId);
        String result = dog.speak();


        //Then


        Assert.assertEquals("bark!", result);
    }

    // TODO - Create tests for `void eat(Food food)`
    @Test
    public void dogEatTest() {

        // Given
        String givenName = "Yuki";
        Date givenBirthDate = new Date();
        Integer givenId = 1;

        //When
        Dog dog = new Dog(givenName, givenBirthDate, givenId);
        Food food = new Food();
        int mealBefore = dog.getNumberOfMealsEaten();
        dog.eat(food); // should increase number of meals by 1
        int mealAfter = dog.getNumberOfMealsEaten(); // should return the increased number of meals.


        //Then
        Assert.assertEquals(mealAfter,mealBefore+1);

    }

    // TODO - Create tests for `Integer getId()`
    @Test

    public void getDogIdTest() {

        //Given
        String name = "Billy";
        Date bday = new Date();
        Integer id = 0;

        //When
        Dog dog = new Dog(name, bday, id);
        Integer id1 = dog.getId ();
        //return retrieveName;


        //Then
        Assert.assertEquals(id,id1 );

    }

    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`

    @Test

    public void dogInstanceAnimalTest (){

        //Given
        String name = "Billy";
        Date bday = new Date();
        Integer id = 0;
        Boolean bool;

        //When
        Dog dog = new Dog(name, bday, id);
        if (dog instanceof Animal){
            bool= true;

        }

        else bool = false;

        //Then

        Assert.assertEquals(true,bool );
    }

    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test

    public void dogInstanceMammalTest (){

        //Given
        String name = "Billy";
        Date bday = new Date();
        Integer id = 0;
        Boolean bool;

        //When
        Dog dog = new Dog(name, bday, id);
        if (dog instanceof Mammal){
            bool= true;

        }

        else bool = false;

        //Then

        Assert.assertEquals(true,bool );
    }
}
