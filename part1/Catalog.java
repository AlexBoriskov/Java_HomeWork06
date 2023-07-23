package part1;
import java.util.*;

public class Catalog {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);

        String id_laptop;
        String brand_laptop;
        String model_laptop;
        Integer RAM_laptop;
        Integer storage_laptop;
        Integer price_laptop;

        String choose;
        boolean examination = true;

        Set <Laptop> catalog = new LinkedHashSet<>();

        Laptop l1 = new Laptop("LAP-11", "ASUS", "SCR-990", 4, 512, 30000);
        Laptop l2 = new Laptop("LAP-22", "LENOVO", "LEN-456", 8, 2048, 60000);
        Laptop l3 = new Laptop("LAP-33", "LENOVO", "LEN-986", 16, 2048, 90000);
        Laptop l4 = new Laptop("LAP-44", "Apple", "iApple-972", 16, 4096, 120000);
        Laptop l5 = new Laptop("LAP-55", "HP", "HP-111", 4, 1024, 35000);

        catalog.add(l1);
        catalog.add(l2);
        catalog.add(l3);
        catalog.add(l4);
        catalog.add(l5);

        while (examination){
            System.out.println();
            System.out.println("КАТАЛОГ НОУТБУКОВ\n");
            System.out.println("1. Показать все модели");
            System.out.println("2. Добавить новую модель");
            System.out.println("3. Поиск по критерию");
            System.out.println("4. Удалить модель из каталога");
            System.out.println("5. Выход\n");

            System.out.println("Введите пункт меню:");
            choose = iScanner.nextLine();

            switch (choose){
                case "1":{
                    System.out.println();
                    System.out.println("В каталоге представлены следующие модели:");
                    for (Laptop laptop : catalog)
                    {
                        System.out.println(laptop.toPrint()); 
                    }
                    break;
                }
                case "2":{
                    System.out.println();
                    System.out.println("Введите ID ноутбука:");
                    id_laptop = iScanner.nextLine();
                    System.out.println("Введите бренд:");
                    brand_laptop = iScanner.nextLine();
                    System.out.println("Введите модель:");
                    model_laptop = iScanner.nextLine();
                    System.out.println("Введите RAM:");
                    RAM_laptop = iScanner.nextInt();
                    System.out.println("Введите объем памяти:");
                    storage_laptop = iScanner.nextInt();
                    System.out.println("Введите продажную цену:");
                    price_laptop = iScanner.nextInt();

                    Laptop laptop = new Laptop(id_laptop, brand_laptop, model_laptop, RAM_laptop, storage_laptop, price_laptop);
                    catalog.add(laptop);
                    break;
                }

                case "3":{
                    System.out.println();
                    System.out.println("1. Поиск по бренду");
                    System.out.println("2. Поиск по RAM");
                    System.out.println("3. Поиск по объему памяти\n");
                    System.out.println("Выберите критерий поиска");
                    choose = iScanner.nextLine();
                    switch(choose){
                        case "1":{
                            System.out.println("Введите бренд для поиска:");
                            brand_laptop = iScanner.nextLine();
                            Iterator<Laptop> iterator = catalog.iterator();
                            while (iterator.hasNext()){
                                Laptop laptop = iterator.next();
                                if (laptop.toBrand().equals(brand_laptop)){
                                    System.out.println(laptop.toPrint());
                                }
                            }
                            break;
                        }
                        case "2":{
                            System.out.println("Введите RAM для поиска:");
                            RAM_laptop = iScanner.nextInt();
                            Iterator <Laptop> iterator = catalog.iterator();
                            while (iterator.hasNext()){
                                Laptop laptop = iterator.next();
                                if (laptop.toRAM().equals(RAM_laptop)) {
                                System.out.println(laptop.toPrint());
                                } 
                            }
                            break;
                        }
                        case "3":{
                            System.out.println("Введите объем памяти для поиска:");
                            storage_laptop = iScanner.nextInt();
                            Iterator<Laptop> iterator = catalog.iterator();
                            while(iterator.hasNext()){
                                Laptop laptop = iterator.next();
                                if (laptop.toStorage().equals(storage_laptop)){
                                    System.out.println(laptop.toPrint());
                                }
                            }
                            break;
                        }
                    }
                    break;
                }
                case "4":{
                    Iterator<Laptop> iterator = catalog.iterator();
                    System.out.println("Введите ID модели");
                    id_laptop = iScanner.nextLine();
                    while(iterator.hasNext()){
                        Laptop laptop = iterator.next();
                        if (laptop.toID().equals(id_laptop)){
                            iterator.remove();
                        }
                    }
                    break;
                }
                case "5":{
                    System.out.println("До свидания. Приятных покупок");
                    examination = false;
                }
            }
        }
        iScanner.close();
    }
}
