package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    // TODO - Create tests for `void add(Dog dog)`

    @Test

    public void addDogTest() {

        //Given
        Date bday = new Date();

        DogHouse dogHouse = new DogHouse();
        //AnimalFactory animalFactory = new AnimalFactory();
        Dog dog = new Dog("Billy", bday, 900);

        //When

        dogHouse.add(dog);

        Dog dog1 = dogHouse.getDogById(900);

        //Then
        Assert.assertEquals(dog, dog1);

    }


    // TODO - Create tests for `void remove(Integer id)`

    @Test

    public void removeCatByIdTest() {

        //Given
        Date bday = new Date();

        DogHouse dogHouse = new DogHouse();

        Dog dog = new Dog("Billy", bday, 300);

        //When
        dogHouse.add(dog);

        dogHouse.remove(300);

        Dog dog1 = dogHouse.getDogById(300);


        //Then
        Assert.assertNull(dog1);

    }


    // TODO - Create tests for `void remove(Dog dog)`

    @Test

    public void removeDogTest() {

        //Given
        Date bday = new Date();

        DogHouse dogHouse = new DogHouse();

        Dog dog = new Dog("Billy", bday, 200);
        dogHouse.add(dog);

        //When


        dogHouse.remove(dog);

        Dog dog1 = dogHouse.getDogById(200);


        //Then
        Assert.assertNull(dog1);

    }


    // TODO - Create tests for `Dog getDogById(Integer id)`

    @Test

    public void getNumberOfDogsTest() {

        //Given
        Date bday = new Date();

        DogHouse dogHouse = new DogHouse();

        Dog dog = new Dog("Billy", bday, 400);

        //When

        int num_dogs_before =dogHouse.getNumberOfDogs();

        dogHouse.add(dog);

        Dog dog1 = dogHouse.getDogById(400);

        int num_dogs_after =dogHouse.getNumberOfDogs();

        //Then
        Assert.assertEquals(num_dogs_before +1, num_dogs_after);

    }


    // TODO - Create tests for `Integer getNumberOfDogs()`

    @Test
    public void testGetNumberOfDogs() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        DogHouse.add(animal);

        // Then
        DogHouse.getNumberOfDogs();
    }
}
