package com.zzp.computer.dao;

import org.mapstruct.Mapper;
import org.springframework.stereotype.Repository;

/**
 * Created by zhuzhengping on 2017/4/13.
 */
@Repository
@Mapper
public interface ComputerMapper {

    String findByComputerName(String computerName);

}
