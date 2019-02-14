package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {
    // TODO - Create tests for `void setName(String name)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`


    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

    //Test for get name

    @Test

    public void getCatNameTest() {

        //Given
        String name = "Billy";
        Date bday = new Date();
        Integer id = 0;

        //When
        Cat cat = new Cat(name, bday, id);
        String retrieveName = cat.getName();
        //return retrieveName;


        //Then
        Assert.assertEquals(name, retrieveName);

    }

    //Test for set name

    @Test

    public void setCatNameTest() {

        //Given
        String name = "Sakura";
        Date bday = new Date();
        Integer id = 1;



        //When
        Cat cat = new Cat(name, bday, id);
        cat.setName(name);

        //Then

        Assert.assertEquals("Sakura", name);

    }

    //Test for set birthday

    @Test

    public void setCatBirthDateTest() {

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

    // Test Cat speak
    @Test
    public void catSpeakTest() {
        // Given
        String givenName = "Yuki";
        Date givenBirthDate = new Date();
        Integer givenId = 1;

        //When
        Cat cat = new Cat(givenName, givenBirthDate, givenId);
        String result = cat.speak();


        //Then


        Assert.assertEquals("meow!", result);
    }

    //Test Cat eats food
    @Test
    public void catEatTest() {

        // Given
        String givenName = "Yuki";
        Date givenBirthDate = new Date();
        Integer givenId = 1;

        //When
        Cat cat = new Cat(givenName, givenBirthDate, givenId);
        Food food = new Food();
        int mealBefore = cat.getNumberOfMealsEaten();
        cat.eat(food); // should increase number of meals by 1
        int mealAfter = cat.getNumberOfMealsEaten(); // should return the increased number of meals.


        //Then
        Assert.assertEquals(mealAfter,mealBefore+1);

            }

        //al();

        //When
        //cat.eat(food);
        // numberOfMealsEaten ++;


        //Then
        //Assert.assertEquals(food, food);

    // test to get ID
    @Test

    public void getCatIdTest() {

        //Given
        String name = "Billy";
        Date bday = new Date();
        Integer id = 0;

        //When
        Cat cat = new Cat(name, bday, id);
        Integer id1 = cat.getId ();
        //return retrieveName;


        //Then
        Assert.assertEquals(id,id1 );

    }

    @Test

    public void catInstanceAnimalTest (){

        //Given
        String name = "Billy";
        Date bday = new Date();
        Integer id = 0;
        Boolean bool;

        //When
        Cat cat = new Cat(name, bday, id);
        if (cat instanceof Animal){
           bool= true;

        }

        else bool = false;

        //Then

        Assert.assertEquals(true,bool );
    }

    @Test

    public void catInstanceMammalTest (){

        //Given
        String name = "Billy";
        Date bday = new Date();
        Integer id = 0;
        Boolean bool;

        //When
        Cat cat = new Cat(name, bday, id);
        if (cat instanceof Mammal){
            bool= true;

        }

        else bool = false;

        //Then

        Assert.assertEquals(true,bool );
    }


}



