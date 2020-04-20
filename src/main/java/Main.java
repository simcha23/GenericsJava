class GenericClass<T>{
    private T _elements;

    public void setElements(T elements){
        _elements = elements;
    }
    public T getElements(){
        return _elements;
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
        stringInstance.setElements("Test"); //Assign a string value to element from Generic class

        System.out.println(stringInstance.getElements()); // print out Test

        GenericClass<Integer> integerInstance = new GenericClass<Integer>();
        integerInstance.setElements(1000); //Assign a integer value to element from Generic class

        System.out.println(integerInstance.getElements()); // print out 1000

    }

}
