package com.zipcodewilmington.assessment1.part3;

/**
 * Created by leon on 2/16/18.
 */
public abstract class Pet implements Animal {

    /**
     * nullary constructor
     * by default, pet has age of 0; name of "";
     */

    //Define instance variables ---> access modifier:
    private String name;
    private int age;
    private PetOwner owner;

    public Pet() {
        this.name = "Cat name";
        this.age = 0;
    }

    /**
     * @param name name of this pet
     */
    public Pet(String name) {
        this.name = name;
        this.age = 0;
    }


    /**
     * @param age age of this pet
     */
    public Pet(Integer age) {
        this.name = "";
        this.age = age;
    }

    /**
     * @param name name of this pet
     * @param age age of this pet
     */
    public Pet(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    /**
     * @return name of this pet
     */
    public String getName() {

        return this.name;
    }

    /**
     * @return age of this pet
     */
    public Integer getAge() {

        return this.age;
    }

    /**
     * @param newPetOwner the new owner of this pet
     *                    ensure this instance of `Pet` is added to the owner's composite `pets` list
     */
    public void setOwner(PetOwner newPetOwner) {

    }

    /**
     * @return PetOwner object whose composite `pets` collection contains this Pet instance
     */
    public PetOwner getOwner() {

        return owner;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
}
