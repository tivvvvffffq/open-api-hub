package com.nxj.api.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.nxj.api.model.entity.UserInterfaceInfo;
import com.nxj.api.mapper.UserInterfaceInfoMapper;
import com.nxj.api.service.UserInterfaceInfoService;
import org.springframework.stereotype.Service;

/**
* @author niexingju
* @description 针对表【user_interface_info(用户调用接口关系)】的数据库操作Service实现
* @createDate 2024-07-12 09:55:58
*/
@Service
public class UserInterfaceInfoServiceImpl extends ServiceImpl<UserInterfaceInfoMapper, UserInterfaceInfo>
    implements UserInterfaceInfoService {

}




