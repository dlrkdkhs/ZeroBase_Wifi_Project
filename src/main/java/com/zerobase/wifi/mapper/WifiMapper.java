package com.zerobase.wifi.mapper;

import com.zerobase.wifi.dto.WifiDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface WifiMapper {
    List<WifiDTO> get_Wifi_Info();
}
