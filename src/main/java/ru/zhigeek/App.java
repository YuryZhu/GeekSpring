package ru.zhigeek;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.zhigeek.entities.Cat;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context =
                new AnnotationConfigApplicationContext("ru.zhigeek.entities");

        Cat cat = context.getBean(Cat.class);
        System.out.println(cat.getName());
    }
}
