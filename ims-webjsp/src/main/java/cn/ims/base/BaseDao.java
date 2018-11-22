package cn.ims.base;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface BaseDao<T, V> {

    int count(T t);

    List<V> list(T t);

    V get(T t);

    int update(T t);

    int add(T t);

    int delete(T t);
}
