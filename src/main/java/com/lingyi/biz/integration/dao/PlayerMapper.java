package com.lingyi.biz.integration.dao;

import com.lingyi.biz.entity.Player;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author 咕噜科
 * ClassName: PlayerMapper
 * date: 2022-06-08 22:08
 * Description:
 * version 1.0
 */
@Mapper
public interface PlayerMapper {

    List<Player> queryPlayerList ();

}
