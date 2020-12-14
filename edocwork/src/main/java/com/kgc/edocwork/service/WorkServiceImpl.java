package com.kgc.edocwork.service;

import com.kgc.edocwork.mapper.EntryMapper;
import com.kgc.edocwork.pojo.Entry;
import com.kgc.edocwork.pojo.EntryExample;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

@Component
@Service
public class WorkServiceImpl implements WorkService {

    @Resource
    EntryMapper entryMapper;

    @Override
    public List<Entry> entrylist(Integer type) {
        EntryExample example=new EntryExample();
        EntryExample.Criteria criteria = example.createCriteria();
        if(type!=0){
            criteria.andCategoryidEqualTo(type);
            return entryMapper.selectByExample(example);
        }else{
            return entryMapper.selectByExample(null);
        }
    }

    @Override
    public int addentry(Entry entry) {
        return entryMapper.insertSelective(entry);
    }

    @Override
    public int delete(Integer id) {
        return entryMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Entry entryById(Integer id) {
        return entryMapper.selectByPrimaryKey(id);
    }

    @Override
    public int upd(Entry entry) {
        return entryMapper.updateByPrimaryKeySelective(entry);
    }
}
