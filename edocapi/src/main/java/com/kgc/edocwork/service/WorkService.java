package com.kgc.edocwork.service;

import com.kgc.edocwork.pojo.Entry;

import java.util.List;

public interface WorkService {
   /*查询全部*/
    List<Entry> entrylist(Integer type);
    /*添加*/
    int addentry(Entry entry);
    /*根据id删除*/
    int delete(Integer id);
    /*根据ID查询*/
    Entry entryById(Integer id);
    /*修改*/
    int upd(Entry entry);

}
