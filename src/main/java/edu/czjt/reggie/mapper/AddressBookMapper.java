package edu.czjt.reggie.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import edu.czjt.reggie.entity.AddressBook;
import org.apache.ibatis.annotations.Mapper;

/**
 *
 *作者：胡雪
 *内容：地址模块
 * 日期：2023/6/15
 *
 */

@Mapper
public interface AddressBookMapper extends BaseMapper<AddressBook> {

}
