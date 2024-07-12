package com.nxj.api.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.nxj.api.service.InterfaceInfoService;
import com.nxj.api.model.entity.InterfaceInfo;
import com.nxj.api.mapper.InterfaceInfoMapper;
import org.springframework.stereotype.Service;

/**
* @author niexingju
* @description 针对表【interface_info(接口信息)】的数据库操作Service实现
* @createDate 2024-07-12 09:55:14
*/
@Service
public class InterfaceInfoServiceImpl extends ServiceImpl<InterfaceInfoMapper, InterfaceInfo>
    implements InterfaceInfoService {

}




