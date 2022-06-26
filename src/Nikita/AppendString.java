package Nikita;

public class AppendString <T> {
    private String name = "John ";

    public String appendStr(T[] t){
        for (T element : t ) {
            name += element;
        }
        return name;
    }

    public static void main(String[] args) {
        Integer[] num = {1, 2, 3, 4, 5, 6, 7};
        AppendString<Integer> obj = new AppendString<>();
        System.out.println(obj.appendStr(num));
    }
}
