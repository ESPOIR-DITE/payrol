package service;

import java.util.ArrayList;

public interface Iservice<T ,t> {
    T create(T t);
    T read(String id);
    T udate(T t);
    T delete(String id);
    ArrayList readAll();
}
