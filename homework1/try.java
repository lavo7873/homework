class Person {
      // attributes
      private String name;
      private int age;

      // parameterized constructor
      public Person(String name, int age) {
            // assigning values
            this.name = name;
            this.age = age;
      }

      // getter for name
      public String getName() {
            return name;
      }

      // getter for age
      public int getAge() {
            return age;
      }

      // setter for name
      public void setName(String name) {
            this.name = name;
      }

      // setter for age
      public void setAge(int age) {
            this.age = age;
      }
}

// class Artist inherits from Person
class Artist extends Person {
      // attribute
      private String specialty;

      // parameterized constructor with two string value and one int value
      public Artist(String name, String specialty, int age) {
            // call to parent constructor with name and age (attributes)
            super(name, age);
            // assigning the specialty
            this.specialty = specialty;
      }
}