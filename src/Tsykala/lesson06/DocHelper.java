package Tsykala.lesson06;

public class DocHelper {
    static void printAllNames(Dog[] dogs){
        for (int i = 0; i < dogs.length; i++) {
            System.out.print(dogs[i].getName()+" ");

        }
        }; //должен печатать в консоль через пробел имена всех собак
    static double averageAge(Dog[] dogs){
        double sum=0;
        for (int i = 0; i < dogs.length; i++) {
            sum=sum+dogs[i].getAge();
        }
        return sum/dogs.length;
        }; //должен вычислять средний возраст переданных ему собак

}
