package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    // TODO - Create tests for `void add(Cat cat)`

    @Test

    public void addCatTest() {

        //Given
        Date bday = new Date();

        CatHouse catHouse = new CatHouse();
        //AnimalFactory animalFactory = new AnimalFactory();
        Cat cat = new Cat("Billy", bday, 0);

        //When

        catHouse.add(cat);

        Cat cat1 = catHouse.getCatById(0);

        //Then
        Assert.assertEquals(cat, cat1);

    }

    //  TODO - Create tests for `void remove(Cat cat)`
    @Test

    public void removeCatTest() {

        //Given
        Date bday = new Date();

        CatHouse catHouse = new CatHouse();
        //AnimalFactory animalFactory = new AnimalFactory();
        Cat cat = new Cat("Billy", bday, 200);
        catHouse.add(cat);

        //When


        catHouse.remove(cat);

        Cat cat1 = catHouse.getCatById(200);
        //int retrievedID = cat.getId();

        //Then
        Assert.assertNull(cat1);

    }



    // TODO - Create tests for `void remove(Integer id)`

    @Test

    public void removeCatByIdTest() {

        //Given
        Date bday = new Date();

        CatHouse catHouse = new CatHouse();

        Cat cat = new Cat("Billy", bday, 300);

        //When
        catHouse.add(cat);

        catHouse.remove(300);

        Cat cat1 = catHouse.getCatById(300);

        //int retrievedID = cat.getId();

        //Then
        Assert.assertNull(cat1);

    }


    // TODO - Create tests for `Cat getCatById(Integer id)`

    @Test

    public void getCatByIdTest() {

        //Given
        Date bday = new Date();

        CatHouse catHouse = new CatHouse();

        Cat cat = new Cat("Billy", bday, 300);

        //When
        catHouse.add(cat);

        //catHouse.remove(300);

        Cat cat1 = catHouse.getCatById(300);

        //int retrievedID = cat.getId();

        //Then
        Assert.assertEquals(cat, cat1);

    }


    // TODO - Create tests for `Integer getNumberOfCats()`

    @Test

    public void getNumberOfCatsTest() {

        //Given
        Date bday = new Date();

        CatHouse catHouse = new CatHouse();

        Cat cat = new Cat("Billy", bday, 400);

        //When

        int num_cats_before =catHouse.getNumberOfCats();

        catHouse.add(cat);

        Cat cat1 = catHouse.getCatById(400);

        int num_cats_after =catHouse.getNumberOfCats();

        //Then
        Assert.assertEquals(num_cats_before +1, num_cats_after);

    }
}
