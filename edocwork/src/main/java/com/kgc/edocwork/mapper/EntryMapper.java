package com.kgc.edocwork.mapper;

import com.kgc.edoc.pojo.Entry;
import com.kgc.edoc.pojo.EntryExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EntryMapper {
    int countByExample(EntryExample example);

    int deleteByExample(EntryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Entry record);

    int insertSelective(Entry record);

    List<Entry> selectByExample(EntryExample example);

    Entry selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Entry record, @Param("example") EntryExample example);

    int updateByExample(@Param("record") Entry record, @Param("example") EntryExample example);

    int updateByPrimaryKeySelective(Entry record);

    int updateByPrimaryKey(Entry record);
}