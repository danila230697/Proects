import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class Zadanie {
    private static List<Integer> listarray=new ArrayList<>();
// Здаание 1 методы создание отображение и меняет местами 2 элемента
    public static void Create(Integer array[]) {
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
    }
    public static void Print(Integer array[]){
        for (int j=0; j<array.length; j++) {
            System.out.println("Индекс : "+j+" Значение= "+array[j]);
        }
        System.out.println("");
    }
    public static void methodChange(Integer array[],int a,int b){
        int flag=array[a];
        array[a]=array[b];
        array[b]=flag;
    }
//Задание 2 метод преобразует массив в Arraylist
    public static void ChangeArray(Integer array[]){
        for (int i = 0; i <array.length ; i++) {
            listarray.add(array[i]);
        }

    }

    public static void main(String[] args) {
//объявил массив
        Integer mascheck[]=new Integer [10];
//2 элемента которые пользователь хочет поменять местами
        int first,second;
/*Задание не очень корректное поэтому
решил что если менять 2 элемента то пусть
пользователь решает какие менять элементы
 */
        Scanner scanner =new Scanner(System.in);
        System.out.println("Введите от 0 до 10 какие два элемента массива хотите поменять местами");

        first=scanner.nextInt();
        second=scanner.nextInt();

        Create(mascheck);

        Print(mascheck);

        methodChange(mascheck,first,second);

        Print(mascheck);

        ChangeArray(mascheck);
//Отобразил список для того чтобы проверить а записан ли массив. Всё удачно(я так думаю).
        System.out.println(listarray);
//Проверяю тебя на гитхабе
    }
}
