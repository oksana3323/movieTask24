import models.Cast;
import models.Director;
import models.Movie;
import services.impl.FindImpl;
import services.impl.SortImpl;

import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {


            Director director1 = new Director("Сэм", "Рэйми");
            Director director2 = new Director("Карен", "Захаров");
            Director director3 = new Director("Валентина", "Карнаухова");
            Director director4 = new Director("Карен", "Захаров");
            Director director5 = new Director("Майкл", "Кейн");

            Cast cast1 = new Cast("Тоби Магуайр", "Человек-паук");
            Cast cast2 = new Cast("Уиллем Дефо", "Гоблин");
            LinkedList<Cast> casts = new LinkedList<>();
            casts.add(cast1);
            casts.add(cast2);

            Cast cast3 = new Cast("Михаил Галустян", "Волшебник");
            Cast cast4 = new Cast("Даниил Большов", "Ученик");
            LinkedList<Cast> casts2 = new LinkedList<>();
            casts2.add(cast3);
            casts2.add(cast4);

            Cast cast5 = new Cast("Михаил Галустян", "Марик");
            Cast cast6 = new Cast("Демис Карибидис", "Боря");
            LinkedList<Cast> casts3 = new LinkedList<>();
            casts3.add(cast5);
            casts3.add(cast6);

            Cast cast7 = new Cast("Мих s", "Ян Жижка");
            Cast cast8 = new Cast("Софи Лоу", "Кетрин");
            LinkedList<Cast> casts4 = new LinkedList<>();
            casts4.add(cast7);
            casts4.add(cast8);


            Movie movie1 = new Movie("Человек-паук!", 2002, "Питер Паркер – обыкновенный школьник. Однажды он отправился с классом на экскурсию, где его кусает странный паук-мутант.", director1, casts);
            Movie movie2 = new Movie("Артек. Большое путешествие!", 2021, "Дерево переносит их на 30 лет назад — в 1988 год, где ребята встречают своих родителей", director2, casts2);
            Movie movie3 = new Movie("Отпуск 2", 2022, "Яркая дурашливая комедия", director3, casts3);
            Movie movie4 = new Movie("Отпуск", 2020, "комедия", director3, casts3);
            Movie movie5 = new Movie("Средневековье", 2022, "Священная Римская империя погружается в кровавый хаос", director5, casts4);
            LinkedList<Movie> movies = new LinkedList<>();
            movies.add(movie1);
            movies.add(movie2);
            movies.add(movie3);
            movies.add(movie4);
            movies.add(movie5);
            SortImpl movieStore = new SortImpl();


            Scanner scanner = new Scanner(System.in);
            while (true) {
                System.out.println("""
                        *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*
                           Нажмите 1 чтобы увидеть каталог фильмов
                           Нажмите 2 чтобы найти фильм по названию фильма
                           Нажмите 3 чтобы найти фильм по имени актера
                           Нажмите 4 чтобы найти фильм по году выпуска фильма
                           Нажмите 5 чтобы найти фильм по описанию фильма
                           Нажмите 6 чтобы найти фильм по названию роля актера
                           Нажмите 7 чтобы найти фильм по имени директора
                           Нажмите 8 чтобы отсортировать фильм по названию фильма
                           Нажмите 9 чтобы отсортировать фильм по году выпуска фильма
                           Нажмите 10 чтобы отсортировать фильм по имени диретора  фильма
                        *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*    
                           """);
                System.out.print("Нажмите : ");
                int num = scanner.nextInt();
                FindImpl findByMap = new FindImpl();

                switch (num) {
                    case 1:
                        findByMap.getAllMovies(movies);
                        for (Movie m : movies) {
                            System.out.println(m);
                            System.out.println("*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*");
                        }
                        break;
                    case 2:
                        System.out.print("Названию фильма :");
                        String n = scanner.nextLine();
                        String name = scanner.nextLine();
                        findByMap.findMovieByName(name, movies);
                        break;
                    case 3:
                        String n1 = scanner.nextLine();
                        String name2 = scanner.nextLine();
                        findByMap.findMovieByActorName(name2, movies);
                        break;
                    case 4:
                        int num2 = scanner.nextInt();
                        findByMap.findMovieByYear(num2, movies);
                        break;
                    case 5:
                        String n3 = scanner.nextLine();
                        String nam = scanner.nextLine();
                        findByMap.findMovieByDescription(nam, movies);
                        break;
                    case 6:
                        String n4 = scanner.nextLine();
                        String nam3 = scanner.nextLine();
                        findByMap.findMovieByRole(nam3, movies);
                        break;
                    case 7:
                        String n5 = scanner.nextLine();
                        String nam4 = scanner.nextLine();
                        findByMap.findMovieByDirector(nam4, movies);
                        break;
                    case 8:
                        System.out.println("""
                                Нажмите на 1 чтобы отсортировать от А до Я!
                                Нажмите на 1 чтобы отсортировать от Я до А!""");
                        int h = scanner.nextInt();
                        movieStore.sortByMovieName(h, movies);
                        break;
                    case 9:
                        System.out.println("""
                                Нажмите на 1 чтобы отсортировать по убываннию!
                                Нажмите на 2 чтобы отсортировать по возрастанию""");
                        int h1 = scanner.nextInt();
                        movieStore.sortByYear(h1, movies);
                        break;
                    case 10:
                        System.out.println("""
                                Нажмите на 1 чтобы отсортировать от А до Я!
                                Нажмите на 2 чтобы отсортировать от Я до А!""");
                        int h2 = scanner.nextInt();
                        movieStore.sortByDirector(h2, movies);
                        break;
                    default:
                        System.out.println("Введите число от 1 до 10");
                }


            }
        }catch (InputMismatchException e){
            System.err.println("Вы ввели буквы место числа!");
        }
    }
}