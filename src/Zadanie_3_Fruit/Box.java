package Zadanie_3_Fruit;
import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> {
//Список для будущего Arraylist
    public List<T>fruitlist;

//Переменная для подсчета веса коробки
    private double TotalVesbox;

//Создаю конструктор для хранения данных в Arraylist
    public Box(){
        this.fruitlist=new ArrayList();

    }

//Метод Добавления в Arraylist данные
    public void addFruit(T fruit){
        fruitlist.add(fruit);
    }

//Метод подсчёта веса коробки
    public  double getWeight(T fruit){
      TotalVesbox=(fruit.kol*fruit.ves);
      return TotalVesbox;
  }

/*Метод проверки коробок по их весу сдесь те
самые переменные которые я использовал в методе main  a,o
возможно я неправильно понял задание
 */
    public static boolean Compare(double apple,double orange){
        if(apple==orange)
            return true;
        else
       return false;
  }



    public static void main(String[] args) {
    //Переменные для проверки массы коробок а-Apple o-Orange
        double a,o;
/*Решил что если в задаче сказано
что есть коробка только для яблок
а есть коробка только для апельсинов
то сделаю таким обрзаом
*/
    Box<Apple> appleBox = new Box<>();
    appleBox.addFruit(new Apple());
    System.out.println(appleBox.getWeight(new Apple()));

    Box<Orange>orangeBox=new Box<>();
    orangeBox.addFruit(new Orange());
    System.out.println(orangeBox.getWeight(new Orange()));


    o=orangeBox.getWeight(new Orange());
    a=appleBox.getWeight(new Apple());
    System.out.println(Compare(a,o));


//Не понял как сделать чтобы из одной коробки в другую с помощью метода
/*Решил просто записать данные из одной коробки в другую без метода
и не удалял потому что пока не знаю как мне тут это сделать
Надеюсь на вашу помощь
 */
    Box<Orange>orangeBox1=orangeBox;
    System.out.println(orangeBox1.getWeight(new Orange()));



    }
}
