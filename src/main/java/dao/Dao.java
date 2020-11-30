package dao;

import java.util.List;

/**
 * 30.11.2020
 *
 * @author MescheRGen
 */

public interface Dao<T> {
    void add(T t);
    //T get();
    List<T> getAsList();
    void remove(T t);
    //void clear();
}
