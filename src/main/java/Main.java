class GenericClass<T>{
    private T _intElements;
    private T _stringElements;

    public void setIntElements(T intElements){
        _intElements = intElements;
    }
    public void setStringElements(T stringElements){
        _stringElements = stringElements;
    }
    public T getIntElements(){
        return _intElements;
    }
    public T getStringElements(){
        return _stringElements;
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
        stringInstance.setStringElements("Test"); //Assign a value to stringElement from Generic class

        System.out.println(stringInstance.getStringElements()); // print out Test

        GenericClass<Integer> integerInstance = new GenericClass<Integer>();
        integerInstance.setIntElements(1000); //Assign a value to intElement from Generic class

        System.out.println(integerInstance.getIntElements()); // print out 1000

    }

}
