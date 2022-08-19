class Student{
    String name;
    int age;
    
    static int maxAge = 22;

    public static void main(String[] args) {
        Student x = new Student();
        x.name = "Shashwat";
        x.age = 20;
       
        System.out.println(x.name);
        System.out.println(x.age);
    }
}