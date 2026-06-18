package Main.Main;

public class Car {
private String name;
private String color;

// Constructor
public Car(String name, String color) {
    this.name = name;
    this.color = color;
}

// Getter methods
public String getName() {
    return name;
}

public String getColor() {
    return color;
}

// Setter methods
public void setName(String name) {
    this.name = name;
}

public void setColor(String color) {
    this.color = color;
}
}
