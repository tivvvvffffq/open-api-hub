package com.nxj.api.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.nxj.api.model.entity.InterfaceInfo;

/**
* @author niexingju
* @description 针对表【interface_info(接口信息)】的数据库操作Service
* @createDate 2024-07-12 09:55:14
*/
public interface InterfaceInfoService extends IService<InterfaceInfo> {

    void validInterfaceInfo(InterfaceInfo interfaceInfo, boolean b);
}
