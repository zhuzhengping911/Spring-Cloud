package com.zzp.computer.dao;

import com.zzp.computer.pojo.Computer;
import org.mapstruct.Mapper;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by zhuzhengping on 2017/4/13.
 */
@Mapper
public interface ComputerMapper extends JpaRepository<Computer,Long>{

    Computer findByComputerName(String computerName);
}
