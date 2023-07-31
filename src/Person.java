// public class Person {
//     //The person's name according to the book of names in which all names are recorded
//     final String name;
//     //The person's height in millimeters (as provided by the person)
//     final int heightMm;
//     final boolean likesPizza;

//     public Person(String name, int heightMm) {
//         this.name = name;
//         this.heightMm = heightMm;
//         this.likesPizza = false;
//     }

//     public Person(int heightMm) {
//         this(name:"(Unknown)", heightMm);
//     }

//     public Person() {
//         this(heightMm: 500);
//     }

//     @Override
//     public String toString() {
//         return "Person[name=" + name + ", heightMm=" + heightMm + "]";
//     }

//     @Override
//     public boolean equals(Object obj) {
//         if(!(obj instanceof Person)) {
//             return false;
//         }
//         Person that = (Person) obj;
//         return (this.name == that.name) && (this.heightMm == that.heightMm);
//     }
// }
