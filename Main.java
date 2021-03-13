import java.util.ArrayList;

class Main {
  public static void main(String[] args) {
    System.out.println("Lab 3");
    Main a= new Main();
    a.add();
    a.clear();
    a.contains();
    a.ensureCapacity();
    a.isEmpty();
    a.get();
    a.remove();
    a.size();
  }
  void add(){
    ArrayList<String> a= new ArrayList<String>();
    System.out.println("");
    System.out.println("ArrayList");
    a.add("My");
    a.add("name");
    a.add("is");
    a.add("William");
    a.add(3,"Choi");
    System.out.println("What is your name? "+a);
  }
  void clear(){
    ArrayList<String> a= new ArrayList<String>();
    System.out.println("");
    System.out.println("Clear");
    a.add("Please");
    a.add("clear");
    a.add("this");
    System.out.println(a+" Ok!");
    a.clear();
    System.out.println(a+" Done!");
  }
  void contains(){
    ArrayList<String> a= new ArrayList<String>();
    System.out.println("");
    System.out.println("Contains");
    a.add("William");
    a.add("Youngjun");
    a.add("Choi");
    System.out.println("What is your full name? "+a);
    System.out.println("Is William part of your name? "+a.contains("William"));
    System.out.println("Is David part of your name? "+a.contains("David"));
  }
  void ensureCapacity(){
    ArrayList<String> a= new ArrayList<String>();
    System.out.println("");
    System.out.println("EnsureCapacity");
    a.add("please");
    a.add("add");
    a.add("another");
    a.add("word");
    System.out.println(a);
    a.ensureCapacity(5);
    a.add(1,"don't");
    System.out.println(a);
  }
  void isEmpty(){
    ArrayList<String> a= new ArrayList<String>();
    System.out.println("");
    System.out.println("IsEmpty");
    System.out.println(a);
    System.out.println("Is the array empty? "+a.isEmpty());
    a.add("there");
    a.add("are");
    a.add("four");
    a.add("words");
    System.out.println(a);
    System.out.println("Is the array empty? "+a.isEmpty());
  }
  void get(){
    ArrayList<String> a= new ArrayList<String>();
    System.out.println("");
    System.out.println("Get");
    a.add("first");
    a.add("second");
    a.add("third");
    a.add("fourth");
    a.add("fifth");
    System.out.println(a);
    System.out.println("Pick the second element in the array: "+a.get(1));
    System.out.println("Pick the fifth element in the array: "+a.get(4));
  }
  void remove(){
    ArrayList<String> a= new ArrayList<String>();
    System.out.println("");
    System.out.println("Remove");
    a.add("remove");
    a.add("the");
    a.add("first");
    a.add("word");
    System.out.println(a);
    a.remove(0);
    System.out.println(a);
  }
  void size(){
    ArrayList<String> a= new ArrayList<String>();
    System.out.println("");
    System.out.println("Size");
    a.add("1");
    a.add("2");
    a.add("3");
    a.add("4");
    a.add("5");
    System.out.println(a);
    System.out.println("What is the size of the arry? "+a.size());
  }
}