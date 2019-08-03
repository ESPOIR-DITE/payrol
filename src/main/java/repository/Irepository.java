package repository;

import java.util.ArrayList;

public interface Irepository<T ,t> {
    T create(T t);
    T read(String id);
    T udate(T t);
    T delete(String id);
    ArrayList readAll();
    int getHighId();
}
