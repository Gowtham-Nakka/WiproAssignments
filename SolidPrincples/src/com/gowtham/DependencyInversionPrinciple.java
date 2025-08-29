<<<<<<< HEAD
=======
<<<<<<< HEAD
package com.gowtham;

interface Light {
    void turnOn();
}

class LEDLight implements Light {
    public void turnOn() {
        System.out.println("LED Light is ON");
    }
}

class Switch {
    Light light;

    Switch(Light light) {
        this.light = light;
    }

    void operate() {
        light.turnOn();
    }
}

public class DependencyInversionPrinciple {
    public static void main(String[] args) {
        Light led = new LEDLight();
        Switch s = new Switch(led);
        s.operate();
    }
=======
>>>>>>> my-feature-branch
package com.gowtham;

interface Light {
    void turnOn();
}

class LEDLight implements Light {
    public void turnOn() {
        System.out.println("LED Light is ON");
    }
}

class Switch {
    Light light;

    Switch(Light light) {
        this.light = light;
    }

    void operate() {
        light.turnOn();
    }
}

public class DependencyInversionPrinciple {
    public static void main(String[] args) {
        Light led = new LEDLight();
        Switch s = new Switch(led);
        s.operate();
    }
<<<<<<< HEAD
=======
>>>>>>> af4bfed9 (added all the files)
>>>>>>> my-feature-branch
}