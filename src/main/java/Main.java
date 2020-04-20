class GenericClass<T>{
    private T _value;

    public void set(T value){
        _value = value;
    }
    public T get(){
        return _value;
    }

    public <T> void printArrayContent(T[] array){
        for (T elements:array) {
            System.out.print(elements + " "); // Print both integer and/or string elements
        }
        System.out.println("");
    }
}
public class Main {
    public static void main(String[] args) {

        GenericClass obj = new GenericClass();

        obj.printArrayContent(new Integer[]{1,2,3});
        obj.printArrayContent(new String[]{"Simcar", "Mahlangu", "Mpumalanga"});

        GenericClass<String> stringInstance = new GenericClass<String>();
        stringInstance.set("Test"); //Assign a string value to Generic class value

        System.out.println(stringInstance.get()); // print out Test

        GenericClass<Integer> integerInstance = new GenericClass<Integer>();
        integerInstance.set(1000); //Assign a integer value to Generic class value

        System.out.println(integerInstance.get()); // print out 1000

    }

}
