package com.curso.ecommerce.client.steam;

import com.curso.ecommerce.domain.steam.dto.SteamDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "steam", url = "http://192.168.15.114:3000")
public interface SteamGames {
    @GetMapping(path = "/jogos")
    Object getGamesByName(@RequestParam (name = "ResponseName") String name);
}
