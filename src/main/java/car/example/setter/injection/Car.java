package car.example.setter.injection;

import car.example.setter.injection.Specification;

public class Car {
    private Specification specification;
    public void setSpecification(Specification specification) {
        this.specification = specification;
    }
    public void displayDetails() {
        System.out.println("Car specification: " + specification);
    }
}
