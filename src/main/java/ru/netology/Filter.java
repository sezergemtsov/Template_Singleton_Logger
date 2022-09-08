package ru.netology;

import java.util.ArrayList;
import java.util.List;

public class Filter {

    private Integer f;

    public Filter(Integer f) {
        this.f = f;
    }
    public List<Integer> filterOut(List<Integer> list) {

        Logger logger = Logger.getInstance();
        logger.log("Запускаем фильтрацию");
        List<Integer> result = new ArrayList<>();
        list.stream()
                .forEach(x->{
                    if (x <= f) {
                        logger.log("элемент " + x + " не проходит");
                    } else {
                        logger.log("элемент " + x + " проходит");
                        result.add(x);
                    }
                });
        logger.log("Прошло фильтр " + result.size() + " из " + list.size() );
        return result;

    }
}
