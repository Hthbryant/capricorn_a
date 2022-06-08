package com.lingyi.web.controller;

import com.lingyi.biz.entity.Player;
import com.lingyi.biz.integration.dao.PlayerMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author 咕噜科
 * ClassName: PlayerController
 * date: 2022-06-08 22:27
 * Description:
 * version 1.0
 */
@RestController
@RequestMapping("/player")
@Slf4j
public class PlayerController {

    @Autowired
    private PlayerMapper playerMapper;

    @RequestMapping("/list")
    public List<Player> getList() {
        List<Player> players = playerMapper.queryPlayerList();
        log.info("players:{}",players);
        return players;
    }
}
