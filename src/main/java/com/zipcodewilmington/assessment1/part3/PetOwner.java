package com.zipcodewilmington.assessment1.part3;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by leon on 2/16/18.
 */
public class PetOwner {
    /**
     * @param name name of the owner of the Pet
     * @param pets array of Pet object
     */

    public String name;
    public List<Pet> pets;
    public int age;
    public PetOwner owner;

    public PetOwner(String name, Pet... pets) {
        this.name = name;
        this.pets = new ArrayList<>();
        for (Pet pet : pets) {
            this.pets.add(pet);
            pet.setOwner(this);
        }
    }

    /**
     * @param pet pet to be added to the composite collection of Pets
     */
    public void addPet(Pet pet) {
        pets.add(pet);
    }

    /**
     * @param pet pet to be removed from the composite collection Pets
     */
    public void removePet(Pet pet) {
        pets.remove(pet);
    }


    /**
     * @param pet pet to evaluate ownership of
     * @return true if I own this pet
     */
    public Boolean isOwnerOf(Pet pet) {

        return pets.contains(pet);
    }

    /**
     * @return the age of the Pet object whose age field is the lowest amongst all Pets in this class
     */
    public Integer getYoungetPetAge() {
        float minimumAge = Integer.MAX_VALUE;
        for (Pet pet : pets) {
            if (pet.getAge() < minimumAge) {
                minimumAge = pet.getAge();
            }
        }
        return (int) minimumAge;
    }




    /**
     * @return the age of the Pet object whose age field is the highest amongst all Pets in this class
     */
    public Integer getOldestPetAge() {
        int maxAge = Integer.MIN_VALUE;
        for (Pet pet : pets) {
            if (pet.getAge() > maxAge) {
                maxAge = pet.getAge();
            }
        }
        return maxAge;
    }


    /**
     * @return the sum of ages of Pet objects stored in this class divided by the number of Pet object
     */
    public Float getAveragePetAge() {
        if (pets.isEmpty()) {
            return 0.0F;
        }
        int sum = 0;
        for (Pet pet : pets) {
            sum += pet.getAge();
        }
        return (float) sum / pets.size();
    }

    /**
     * @return the number of Pet objects stored in this class
     */
    public Integer getNumberOfPets() {

        return pets.size();
    }

    /**
     * @return the name property of the Pet
     */
    public String getName() {
        return name;
    }

    /**
     * @return array representation of animals owned by this PetOwner
     */
    public Pet[] getPets() {
        return pets.toArray(new Pet[0]);
    }
}
